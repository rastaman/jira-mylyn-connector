/**
 * Copyright (C) 2008 Atlassian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.atlassian.connector.commons.jira;

import com.atlassian.connector.commons.jira.beans.AbstractJIRAConstantBean;

import java.util.ArrayList;
import java.util.List;

public class JIRAActionFieldBean extends AbstractJIRAConstantBean implements JIRAActionField {
	private String fieldId;

	private List<String> fieldValues = new ArrayList<String>();

	public JIRAActionFieldBean(String fieldId, String name) {
		super(fieldId.hashCode(), name, null);
		this.fieldId = fieldId;
	}

	public JIRAActionFieldBean(JIRAActionField other) {
		this(other.getFieldId(), other.getName());
	}

	public String getFieldId() {
		return fieldId;
	}

	public void addValue(String val) {
		fieldValues.add(val);
	}

	public List<String> getValues() {
		return fieldValues;
	}

	public void setValues(List<String> values) {
		this.fieldValues = values;
	}

	public String getQueryStringFragment() {
		// todo: I am almost absolutely sure this is wrong.
		return fieldId + "=";
	}

	public JIRAActionFieldBean getClone() {
		return new JIRAActionFieldBean(this);
	}

}
