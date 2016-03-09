package org.locationtech.geoff.designer.editors;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.equinox.http.servlet.ExtendedHttpService;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.commands.ActionHandler;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.services.IServiceScopes;
import org.locationtech.geoff.core.core.logging.LogUtil;
import org.locationtech.geoff.designer.IGeoMapService;
import org.locationtech.geoff.designer.internal.GeoMapService;
import org.locationtech.geoff.ui.swt.GeoMapComposite;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;

public class GeoMapEditor extends EditorPart {
	private GeoMapComposite geoMapComposite;
	private IHandlerActivation undoHandlerActivation;
	private IHandlerActivation redoHandlerActivation;
	private boolean canSave = false;

	private IGeoMapService geoMapService;

	private Consumer<EventObject> changeConsumer = (event) -> {
		ICommandService cs = (ICommandService) getSite().getService(ICommandService.class);
		Map<String, Object> filter = new HashMap<>();
		filter.put(IServiceScopes.WINDOW_SCOPE, getSite().getPage().getWorkbenchWindow());
		cs.refreshElements(IWorkbenchCommandConstants.EDIT_UNDO, filter);
		cs.refreshElements(IWorkbenchCommandConstants.EDIT_REDO, filter);

		canSave = geoMapService.canUndo();
		firePropertyChange(PROP_DIRTY);
	};

	private String alias;

	@Override
	public void doSave(IProgressMonitor monitor) {
		SafeRunnable.run(new SafeRunnable() {

			@Override
			public void run() throws Exception {
				geoMapService.save();
				canSave = false;
				firePropertyChange(PROP_DIRTY);
			}
		});
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		IEclipseContext context = (IEclipseContext) site.getService(IEclipseContext.class);
		setSite(site);
		setInput(input);

		if (input instanceof FileEditorInput) {
			FileEditorInput fInput = (FileEditorInput) getEditorInput();
			IFile file = fInput.getFile();
			IProject project = file.getProject();
			geoMapService = new GeoMapService(file.getRawLocation().toFile());
			alias = String.format("/workspace/%s", project.getName());

			ExtendedHttpService httpService = (ExtendedHttpService) context.get(HttpService.class);
			HttpContext hctx = new HttpContext() {

				@Override
				public URL getResource(String name) {
					IFile resource = project.getFile(name);

					try {
						return resource.getLocationURI().toURL();
					} catch (MalformedURLException e) {
						// resource does not exist
					}

					return null;
				}

				@Override
				public String getMimeType(String name) {
					return null;
				}

				@Override
				public boolean handleSecurity(HttpServletRequest request, HttpServletResponse response)
						throws IOException {
					return true;
				}
			};
			LogUtil.logErrorOnException(() -> {
				httpService.registerResources(alias, "/", hctx);
			});
		} else {
			throw new UnsupportedOperationException("Provided editor input not supported: " + input);
		}

		geoMapService.onChange(changeConsumer);

		IHandlerService hs = (IHandlerService) getSite().getWorkbenchWindow().getService(IHandlerService.class);
		{
			ActionHandler handler = new ActionHandler(new Action() {
				@Override
				public void run() {
					geoMapService.undo();
				}

				@Override
				public boolean isHandled() {
					return geoMapService.canUndo();
				}
			});
			undoHandlerActivation = hs.activateHandler(IWorkbenchCommandConstants.EDIT_UNDO, handler);
		}
		{
			ActionHandler handler = new ActionHandler(new Action() {
				@Override
				public void run() {
					geoMapService.redo();
				}

				@Override
				public boolean isHandled() {
					return geoMapService.canRedo();
				}
			});
			redoHandlerActivation = hs.activateHandler(IWorkbenchCommandConstants.EDIT_REDO, handler);
		}

		context.set(IGeoMapService.class, geoMapService);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		if (IGeoMapService.class.equals(adapter)) {
			return (T) geoMapService;
		}

		return super.getAdapter(adapter);
	}

	@Override
	public boolean isDirty() {
		return canSave;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		geoMapComposite = new GeoMapComposite(parent, SWT.None) {
			@Override
			protected String doGetResourcesPath() {
				String resourcesPath = String.format("%s/%s", alias.substring(1), "index-fullmap.html");
				return resourcesPath;
			}
		};
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(geoMapComposite);
		geoMapComposite.loadMap(geoMapService.getGeoMap());
	}

	@Override
	public void setFocus() {
		geoMapComposite.setFocus();
	}

	@Override
	public void dispose() {
		IEclipseContext context = (IEclipseContext) getSite().getService(IEclipseContext.class);
		ExtendedHttpService httpService = (ExtendedHttpService) context.get(HttpService.class);
		httpService.unregister(alias);

		undoHandlerActivation.getHandlerService().deactivateHandler(undoHandlerActivation);
		undoHandlerActivation = null;
		redoHandlerActivation.getHandlerService().deactivateHandler(redoHandlerActivation);
		redoHandlerActivation = null;

		geoMapComposite = null;
		geoMapService.shutdown();

		super.dispose();
	}
}
