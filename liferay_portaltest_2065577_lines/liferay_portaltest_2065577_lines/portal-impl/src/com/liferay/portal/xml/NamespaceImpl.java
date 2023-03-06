/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.xml;

import com.liferay.portal.kernel.xml.Namespace;

/**
 * @author Brian Wing Shun Chan
 */
public class NamespaceImpl extends NodeImpl implements Namespace {

	public NamespaceImpl(org.dom4j.Namespace namespace) {
		super(namespace);

		_namespace = namespace;
	}

	public boolean equals(Object obj) {
		org.dom4j.Namespace namespace =
			((NamespaceImpl)obj).getWrappedNamespace();

		return _namespace.equals(namespace);
	}

	public short getNodeType() {
		return _namespace.getNodeType();
	}

	public String getPrefix() {
		return _namespace.getPrefix();
	}

	public String getURI() {
		return _namespace.getURI();
	}

	public org.dom4j.Namespace getWrappedNamespace() {
		return _namespace;
	}

	public String getXPathNameStep() {
		return _namespace.getXPathNameStep();
	}

	public int hashCode() {
		return _namespace.hashCode();
	}

	public String toString() {
		return _namespace.toString();
	}

	private org.dom4j.Namespace _namespace;

}