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
package org.locationtech.geoff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.locationtech.geoff.Descriptive#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.locationtech.geoff.Descriptive#getLongDescription <em>Long Description</em>}</li>
 * </ul>
 *
 * @see org.locationtech.geoff.GeoffPackage#getDescriptive()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Descriptive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Erdal Karaca.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Erdal Karaca - initial API and implementation\r\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see org.locationtech.geoff.GeoffPackage#getDescriptive_ShortDescription()
	 * @model
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link org.locationtech.geoff.Descriptive#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see org.locationtech.geoff.GeoffPackage#getDescriptive_LongDescription()
	 * @model
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.locationtech.geoff.Descriptive#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

} // Descriptive
