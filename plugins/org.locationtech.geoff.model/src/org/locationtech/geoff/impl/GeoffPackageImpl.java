/**
 *  Copyright (c) 2014 Erdal Karaca.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Erdal Karaca - initial API and implementation
 * 
 */
package org.locationtech.geoff.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.locationtech.geoff.Feature;
import org.locationtech.geoff.GeoMap;
import org.locationtech.geoff.GeoffFactory;
import org.locationtech.geoff.GeoffPackage;
import org.locationtech.geoff.Identifiable;
import org.locationtech.geoff.Location;
import org.locationtech.geoff.RendererHint;
import org.locationtech.geoff.View;
import org.locationtech.geoff.XYZLocation;
import org.locationtech.geoff.geom.GeomPackage;
import org.locationtech.geoff.geom.impl.GeomPackageImpl;
import org.locationtech.geoff.layer.LayerPackage;
import org.locationtech.geoff.layer.impl.LayerPackageImpl;
import org.locationtech.geoff.source.SourcePackage;
import org.locationtech.geoff.source.impl.SourcePackageImpl;
import org.locationtech.geoff.style.StylePackage;
import org.locationtech.geoff.style.impl.StylePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeoffPackageImpl extends EPackageImpl implements GeoffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Erdal Karaca.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Erdal Karaca - initial API and implementation\r\n"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xyzLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rendererHintEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.locationtech.geoff.GeoffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeoffPackageImpl() {
		super(eNS_URI, GeoffFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GeoffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeoffPackage init() {
		if (isInited)
			return (GeoffPackage) EPackage.Registry.INSTANCE
					.getEPackage(GeoffPackage.eNS_URI);

		// Obtain or create and register package
		GeoffPackageImpl theGeoffPackage = (GeoffPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GeoffPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new GeoffPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		LayerPackageImpl theLayerPackage = (LayerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LayerPackage.eNS_URI) instanceof LayerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LayerPackage.eNS_URI) : LayerPackage.eINSTANCE);
		SourcePackageImpl theSourcePackage = (SourcePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SourcePackage.eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SourcePackage.eNS_URI) : SourcePackage.eINSTANCE);
		GeomPackageImpl theGeomPackage = (GeomPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GeomPackage.eNS_URI) instanceof GeomPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GeomPackage.eNS_URI) : GeomPackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);

		// Create package meta-data objects
		theGeoffPackage.createPackageContents();
		theLayerPackage.createPackageContents();
		theSourcePackage.createPackageContents();
		theGeomPackage.createPackageContents();
		theStylePackage.createPackageContents();

		// Initialize created meta-data
		theGeoffPackage.initializePackageContents();
		theLayerPackage.initializePackageContents();
		theSourcePackage.initializePackageContents();
		theGeomPackage.initializePackageContents();
		theStylePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeoffPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeoffPackage.eNS_URI, theGeoffPackage);
		return theGeoffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoMap() {
		return geoMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoMap_Layers() {
		return (EReference) geoMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoMap_View() {
		return (EReference) geoMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoMap_Name() {
		return (EAttribute) geoMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoMap_Description() {
		return (EAttribute) geoMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoMap_RendererHint() {
		return (EAttribute) geoMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Center() {
		return (EReference) viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Zoom() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_ProjectionCode() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXYZLocation() {
		return xyzLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXYZLocation_X() {
		return (EAttribute) xyzLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXYZLocation_Y() {
		return (EAttribute) xyzLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXYZLocation_Z() {
		return (EAttribute) xyzLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Geometry() {
		return (EReference) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Styles() {
		return (EReference) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRendererHint() {
		return rendererHintEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoffFactory getGeoffFactory() {
		return (GeoffFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

		geoMapEClass = createEClass(GEO_MAP);
		createEReference(geoMapEClass, GEO_MAP__LAYERS);
		createEReference(geoMapEClass, GEO_MAP__VIEW);
		createEAttribute(geoMapEClass, GEO_MAP__NAME);
		createEAttribute(geoMapEClass, GEO_MAP__DESCRIPTION);
		createEAttribute(geoMapEClass, GEO_MAP__RENDERER_HINT);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__CENTER);
		createEAttribute(viewEClass, VIEW__ZOOM);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__PROJECTION_CODE);

		xyzLocationEClass = createEClass(XYZ_LOCATION);
		createEAttribute(xyzLocationEClass, XYZ_LOCATION__X);
		createEAttribute(xyzLocationEClass, XYZ_LOCATION__Y);
		createEAttribute(xyzLocationEClass, XYZ_LOCATION__Z);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__GEOMETRY);
		createEReference(featureEClass, FEATURE__STYLES);

		// Create enums
		rendererHintEEnum = createEEnum(RENDERER_HINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LayerPackage theLayerPackage = (LayerPackage) EPackage.Registry.INSTANCE
				.getEPackage(LayerPackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage) EPackage.Registry.INSTANCE
				.getEPackage(SourcePackage.eNS_URI);
		GeomPackage theGeomPackage = (GeomPackage) EPackage.Registry.INSTANCE
				.getEPackage(GeomPackage.eNS_URI);
		StylePackage theStylePackage = (StylePackage) EPackage.Registry.INSTANCE
				.getEPackage(StylePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLayerPackage);
		getESubpackages().add(theSourcePackage);
		getESubpackages().add(theGeomPackage);
		getESubpackages().add(theStylePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		geoMapEClass.getESuperTypes().add(this.getIdentifiable());
		viewEClass.getESuperTypes().add(this.getIdentifiable());
		locationEClass.getESuperTypes().add(this.getIdentifiable());
		xyzLocationEClass.getESuperTypes().add(this.getLocation());
		featureEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(
				identifiableEClass,
				Identifiable.class,
				"Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getIdentifiable_Id(),
				ecorePackage.getEString(),
				"id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				geoMapEClass,
				GeoMap.class,
				"GeoMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getGeoMap_Layers(),
				theLayerPackage.getLayer(),
				null,
				"layers", null, 0, -1, GeoMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getGeoMap_View(),
				this.getView(),
				null,
				"view", null, 0, 1, GeoMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getGeoMap_Name(),
				ecorePackage.getEString(),
				"name", null, 0, 1, GeoMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getGeoMap_Description(),
				ecorePackage.getEString(),
				"description", null, 0, 1, GeoMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getGeoMap_RendererHint(),
				this.getRendererHint(),
				"rendererHint", null, 0, 1, GeoMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				viewEClass,
				View.class,
				"View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getView_Center(),
				this.getLocation(),
				null,
				"center", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getView_Zoom(),
				ecorePackage.getEInt(),
				"zoom", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				locationEClass,
				Location.class,
				"Location", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getLocation_ProjectionCode(),
				ecorePackage.getEString(),
				"projectionCode", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				xyzLocationEClass,
				XYZLocation.class,
				"XYZLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getXYZLocation_X(),
				ecorePackage.getEDouble(),
				"x", null, 0, 1, XYZLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getXYZLocation_Y(),
				ecorePackage.getEDouble(),
				"y", null, 0, 1, XYZLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getXYZLocation_Z(),
				ecorePackage.getEDouble(),
				"z", null, 0, 1, XYZLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				featureEClass,
				Feature.class,
				"Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getFeature_Geometry(),
				theGeomPackage.getGeometry(),
				null,
				"geometry", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getFeature_Styles(),
				theStylePackage.getStyle(),
				null,
				"styles", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(rendererHintEEnum, RendererHint.class, "RendererHint"); //$NON-NLS-1$
		addEEnumLiteral(rendererHintEEnum, RendererHint.CANVAS);
		addEEnumLiteral(rendererHintEEnum, RendererHint.DOM);
		addEEnumLiteral(rendererHintEEnum, RendererHint.WEBGL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$	
		addAnnotation(getGeoMap_Layers(), source, new String[] {
				"name", "layer", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getFeature_Styles(), source, new String[] {
				"name", "style", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

} //GeoffPackageImpl