/*******************************************************************************
 * Copyright (c) 2008 Atlassian and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Atlassian - initial API and implementation
 ******************************************************************************/

package com.atlassian.connector.eclipse.internal.crucible.ui;

import org.eclipse.jface.resource.ImageDescriptor;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Steffen Pingel
 */
public final class CrucibleImages {

	private static final URL BASE_URL = CrucibleUiPlugin.getDefault().getBundle().getEntry("/icons/"); //$NON-NLS-1$

	private static final String T_OBJ = "obj16"; //$NON-NLS-1$

	public static final ImageDescriptor SUMMARIZE = create(T_OBJ, "icn_plan_passed.gif"); //$NON-NLS-1$

	public static final ImageDescriptor ABANDON = create(T_OBJ, "icn_plan_failed.gif"); //$NON-NLS-1$

	private CrucibleImages() {
		// ignore
	}

	private static ImageDescriptor create(String prefix, String name) {
		try {
			return ImageDescriptor.createFromURL(makeIconFileURL(prefix, name));
		} catch (MalformedURLException e) {
			return ImageDescriptor.getMissingImageDescriptor();
		}
	}

	private static URL makeIconFileURL(String prefix, String name) throws MalformedURLException {
		if (BASE_URL == null) {
			throw new MalformedURLException();
		}

		StringBuffer buffer = new StringBuffer(prefix);
		buffer.append('/');
		buffer.append(name);
		return new URL(BASE_URL, buffer.toString());
	}

}
