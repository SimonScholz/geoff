/*******************************************************************************
 * Copyright (c) 2016 Erdal Karaca and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Erdal Karaca - initial API and implementation
 *******************************************************************************/
package org.locationtech.geoff.showcase;

import org.locationtech.geoff.GeoMap;

public abstract class AbstractExampleGeoMap implements IExampleGeoMap {
	public static boolean DEBUG = true;
	private GeoMap map;

	public GeoMap getMap() {
		if (map == null || DEBUG) {
			map = doCreateMap();
		}

		return map;
	}

	public String getName() {
		return getMap().getShortDescription();
	}

	public String getDescription() {
		return getMap().getLongDescription();
	}

	protected abstract GeoMap doCreateMap();
}
