/**
 *
 * $Id$
 */
package org.locationtech.geoff.source.validation;

import org.eclipse.emf.common.util.EList;

import org.locationtech.geoff.Feature;

/**
 * A sample validator interface for {@link org.locationtech.geoff.source.Vector}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VectorValidator {
	boolean validate();

	boolean validateFeatures(EList<Feature> value);
}