/**
 *
 * $Id$
 */
package org.locationtech.geoff.validation;

import org.eclipse.emf.common.util.EList;

import org.locationtech.geoff.RendererHint;
import org.locationtech.geoff.View;

import org.locationtech.geoff.layer.Layer;

/**
 * A sample validator interface for {@link org.locationtech.geoff.GeoMap}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GeoMapValidator {
	boolean validate();

	boolean validateLayers(EList<Layer> value);

	boolean validateView(View value);

	boolean validateName(String value);

	boolean validateDescription(String value);

	boolean validateRendererHint(RendererHint value);
}
