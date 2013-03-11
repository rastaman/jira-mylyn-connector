/*******************************************************************************
 * Copyright (c) 2004, 2008 Tasktop Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package com.atlassian.connector.eclipse.internal.monitor.usage.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.mylyn.commons.workbench.browser.BrowserUtil;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

import com.atlassian.connector.eclipse.internal.monitor.usage.Messages;
import com.atlassian.connector.eclipse.internal.monitor.usage.UsageMonitorImages;
import com.atlassian.connector.eclipse.internal.ui.IBrandingConstants;
import com.atlassian.connector.eclipse.monitor.core.MonitorCorePlugin;

/**
 * @author Jacek Jaroczynski
 */
public class RestVersionDialog extends Dialog {

	public RestVersionDialog(Shell parentShell) {
		super(parentShell);
	}

	@SuppressWarnings("restriction")
	@Override
	protected Control createDialogArea(Composite parent) {
		getShell().setText(Messages.EnabledMonitoringNoticeDialog_title);

		Composite composite = new Composite((Composite) super.createDialogArea(parent), SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);

		new Label(composite, SWT.NONE).setImage(UsageMonitorImages.getImage(UsageMonitorImages.LOGO));

		Label messageLabel = new Label(composite, SWT.WRAP);
		messageLabel.setText(NLS.bind(Messages.RestVersionNoticeDialog, IBrandingConstants.PRODUCT_NAME));
		GridDataFactory.fillDefaults()
				.align(SWT.FILL, SWT.BEGINNING)
				.grab(true, false)
				.hint(convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH), SWT.DEFAULT)
				.applyTo(messageLabel);

		Link details = new Link(composite, SWT.NULL);
		GridDataFactory.fillDefaults().span(2, 1).align(SWT.END, SWT.FILL).applyTo(details);

		details.setText(NLS.bind(Messages.RestVersionNoticeDialog_learn_more, MonitorCorePlugin.INSTALLATION_URL,
				IBrandingConstants.PRODUCT_NAME));
		details.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				BrowserUtil.openUrl(e.text, IWorkbenchBrowserSupport.AS_EXTERNAL);
			}
		});

		applyDialogFont(composite);
		return composite;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
	}

	@Override
	protected void buttonPressed(int buttonId) {
		setReturnCode(buttonId);
		close();
	}

}
