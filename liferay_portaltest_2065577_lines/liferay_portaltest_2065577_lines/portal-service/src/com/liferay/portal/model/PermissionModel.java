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

package com.liferay.portal.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Permission service. Represents a row in the &quot;Permission_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.PermissionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.PermissionImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a permission model instance should use the {@link Permission} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Permission
 * @see com.liferay.portal.model.impl.PermissionImpl
 * @see com.liferay.portal.model.impl.PermissionModelImpl
 * @generated
 */
public interface PermissionModel extends BaseModel<Permission> {
	/**
	 * Gets the primary key of this permission.
	 *
	 * @return the primary key of this permission
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this permission
	 *
	 * @param pk the primary key of this permission
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the permission id of this permission.
	 *
	 * @return the permission id of this permission
	 */
	public long getPermissionId();

	/**
	 * Sets the permission id of this permission.
	 *
	 * @param permissionId the permission id of this permission
	 */
	public void setPermissionId(long permissionId);

	/**
	 * Gets the company id of this permission.
	 *
	 * @return the company id of this permission
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this permission.
	 *
	 * @param companyId the company id of this permission
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the action id of this permission.
	 *
	 * @return the action id of this permission
	 */
	@AutoEscape
	public String getActionId();

	/**
	 * Sets the action id of this permission.
	 *
	 * @param actionId the action id of this permission
	 */
	public void setActionId(String actionId);

	/**
	 * Gets the resource id of this permission.
	 *
	 * @return the resource id of this permission
	 */
	public long getResourceId();

	/**
	 * Sets the resource id of this permission.
	 *
	 * @param resourceId the resource id of this permission
	 */
	public void setResourceId(long resourceId);

	/**
	 * Gets a copy of this permission as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public Permission toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Permission permission);

	public int hashCode();

	public String toString();

	public String toXmlString();
}