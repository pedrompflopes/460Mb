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

import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the Role service. Represents a row in the &quot;Role_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.RoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.RoleImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a role model instance should use the {@link Role} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Role
 * @see com.liferay.portal.model.impl.RoleImpl
 * @see com.liferay.portal.model.impl.RoleModelImpl
 * @generated
 */
public interface RoleModel extends BaseModel<Role> {
	/**
	 * Gets the primary key of this role.
	 *
	 * @return the primary key of this role
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this role
	 *
	 * @param pk the primary key of this role
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the role id of this role.
	 *
	 * @return the role id of this role
	 */
	public long getRoleId();

	/**
	 * Sets the role id of this role.
	 *
	 * @param roleId the role id of this role
	 */
	public void setRoleId(long roleId);

	/**
	 * Gets the company id of this role.
	 *
	 * @return the company id of this role
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this role.
	 *
	 * @param companyId the company id of this role
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the class name of the model instance this role is polymorphically associated with.
	 *
	 * @return the class name of the model instance this role is polymorphically associated with
	 */
	public String getClassName();

	/**
	 * Gets the class name id of this role.
	 *
	 * @return the class name id of this role
	 */
	public long getClassNameId();

	/**
	 * Sets the class name id of this role.
	 *
	 * @param classNameId the class name id of this role
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Gets the class p k of this role.
	 *
	 * @return the class p k of this role
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this role.
	 *
	 * @param classPK the class p k of this role
	 */
	public void setClassPK(long classPK);

	/**
	 * Gets the name of this role.
	 *
	 * @return the name of this role
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this role.
	 *
	 * @param name the name of this role
	 */
	public void setName(String name);

	/**
	 * Gets the title of this role.
	 *
	 * @return the title of this role
	 */
	public String getTitle();

	/**
	 * Gets the localized title of this role. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized title for
	 * @return the localized title of this role
	 */
	public String getTitle(Locale locale);

	/**
	 * Gets the localized title of this role, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this role. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Gets the localized title of this role. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @return the localized title of this role
	 */
	public String getTitle(String languageId);

	/**
	 * Gets the localized title of this role, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this role
	 */
	public String getTitle(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized title of this role.
	 *
	 * @return the locales and localized title
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this role.
	 *
	 * @param title the title of this role
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this role.
	 *
	 * @param locale the locale to set the localized title for
	 * @param title the localized title of this role
	 */
	public void setTitle(Locale locale, String title);

	/**
	 * Sets the localized titles of this role from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this role
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	/**
	 * Gets the description of this role.
	 *
	 * @return the description of this role
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this role.
	 *
	 * @param description the description of this role
	 */
	public void setDescription(String description);

	/**
	 * Gets the type of this role.
	 *
	 * @return the type of this role
	 */
	public int getType();

	/**
	 * Sets the type of this role.
	 *
	 * @param type the type of this role
	 */
	public void setType(int type);

	/**
	 * Gets the subtype of this role.
	 *
	 * @return the subtype of this role
	 */
	@AutoEscape
	public String getSubtype();

	/**
	 * Sets the subtype of this role.
	 *
	 * @param subtype the subtype of this role
	 */
	public void setSubtype(String subtype);

	/**
	 * Gets a copy of this role as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public Role toEscapedModel();

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

	public int compareTo(Role role);

	public int hashCode();

	public String toString();

	public String toXmlString();
}