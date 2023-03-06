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

package com.liferay.portlet.wiki.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WikiPage service. Represents a row in the &quot;WikiPage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.wiki.model.impl.WikiPageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.wiki.model.impl.WikiPageImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a wiki page model instance should use the {@link WikiPage} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WikiPage
 * @see com.liferay.portlet.wiki.model.impl.WikiPageImpl
 * @see com.liferay.portlet.wiki.model.impl.WikiPageModelImpl
 * @generated
 */
public interface WikiPageModel extends BaseModel<WikiPage> {
	/**
	 * Gets the primary key of this wiki page.
	 *
	 * @return the primary key of this wiki page
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this wiki page
	 *
	 * @param pk the primary key of this wiki page
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this wiki page.
	 *
	 * @return the uuid of this wiki page
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this wiki page.
	 *
	 * @param uuid the uuid of this wiki page
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the page id of this wiki page.
	 *
	 * @return the page id of this wiki page
	 */
	public long getPageId();

	/**
	 * Sets the page id of this wiki page.
	 *
	 * @param pageId the page id of this wiki page
	 */
	public void setPageId(long pageId);

	/**
	 * Gets the resource prim key of this wiki page.
	 *
	 * @return the resource prim key of this wiki page
	 */
	public long getResourcePrimKey();

	/**
	 * Sets the resource prim key of this wiki page.
	 *
	 * @param resourcePrimKey the resource prim key of this wiki page
	 */
	public void setResourcePrimKey(long resourcePrimKey);

	/**
	 * Gets the group id of this wiki page.
	 *
	 * @return the group id of this wiki page
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this wiki page.
	 *
	 * @param groupId the group id of this wiki page
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this wiki page.
	 *
	 * @return the company id of this wiki page
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this wiki page.
	 *
	 * @param companyId the company id of this wiki page
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this wiki page.
	 *
	 * @return the user id of this wiki page
	 */
	public long getUserId();

	/**
	 * Sets the user id of this wiki page.
	 *
	 * @param userId the user id of this wiki page
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this wiki page.
	 *
	 * @return the user uuid of this wiki page
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this wiki page.
	 *
	 * @param userUuid the user uuid of this wiki page
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this wiki page.
	 *
	 * @return the user name of this wiki page
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this wiki page.
	 *
	 * @param userName the user name of this wiki page
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this wiki page.
	 *
	 * @return the create date of this wiki page
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this wiki page.
	 *
	 * @param createDate the create date of this wiki page
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this wiki page.
	 *
	 * @return the modified date of this wiki page
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this wiki page.
	 *
	 * @param modifiedDate the modified date of this wiki page
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the node id of this wiki page.
	 *
	 * @return the node id of this wiki page
	 */
	public long getNodeId();

	/**
	 * Sets the node id of this wiki page.
	 *
	 * @param nodeId the node id of this wiki page
	 */
	public void setNodeId(long nodeId);

	/**
	 * Gets the title of this wiki page.
	 *
	 * @return the title of this wiki page
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this wiki page.
	 *
	 * @param title the title of this wiki page
	 */
	public void setTitle(String title);

	/**
	 * Gets the version of this wiki page.
	 *
	 * @return the version of this wiki page
	 */
	public double getVersion();

	/**
	 * Sets the version of this wiki page.
	 *
	 * @param version the version of this wiki page
	 */
	public void setVersion(double version);

	/**
	 * Gets the minor edit of this wiki page.
	 *
	 * @return the minor edit of this wiki page
	 */
	public boolean getMinorEdit();

	/**
	 * Determines whether this wiki page is minor edit.
	 *
	 * @return whether this wiki page is minor edit
	 */
	public boolean isMinorEdit();

	/**
	 * Sets whether this {$entity.humanName} is minor edit.
	 *
	 * @param minorEdit the minor edit of this wiki page
	 */
	public void setMinorEdit(boolean minorEdit);

	/**
	 * Gets the content of this wiki page.
	 *
	 * @return the content of this wiki page
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this wiki page.
	 *
	 * @param content the content of this wiki page
	 */
	public void setContent(String content);

	/**
	 * Gets the summary of this wiki page.
	 *
	 * @return the summary of this wiki page
	 */
	@AutoEscape
	public String getSummary();

	/**
	 * Sets the summary of this wiki page.
	 *
	 * @param summary the summary of this wiki page
	 */
	public void setSummary(String summary);

	/**
	 * Gets the format of this wiki page.
	 *
	 * @return the format of this wiki page
	 */
	@AutoEscape
	public String getFormat();

	/**
	 * Sets the format of this wiki page.
	 *
	 * @param format the format of this wiki page
	 */
	public void setFormat(String format);

	/**
	 * Gets the head of this wiki page.
	 *
	 * @return the head of this wiki page
	 */
	public boolean getHead();

	/**
	 * Determines whether this wiki page is head.
	 *
	 * @return whether this wiki page is head
	 */
	public boolean isHead();

	/**
	 * Sets whether this {$entity.humanName} is head.
	 *
	 * @param head the head of this wiki page
	 */
	public void setHead(boolean head);

	/**
	 * Gets the parent title of this wiki page.
	 *
	 * @return the parent title of this wiki page
	 */
	@AutoEscape
	public String getParentTitle();

	/**
	 * Sets the parent title of this wiki page.
	 *
	 * @param parentTitle the parent title of this wiki page
	 */
	public void setParentTitle(String parentTitle);

	/**
	 * Gets the redirect title of this wiki page.
	 *
	 * @return the redirect title of this wiki page
	 */
	@AutoEscape
	public String getRedirectTitle();

	/**
	 * Sets the redirect title of this wiki page.
	 *
	 * @param redirectTitle the redirect title of this wiki page
	 */
	public void setRedirectTitle(String redirectTitle);

	/**
	 * Gets the status of this wiki page.
	 *
	 * @return the status of this wiki page
	 */
	public int getStatus();

	/**
	 * Sets the status of this wiki page.
	 *
	 * @param status the status of this wiki page
	 */
	public void setStatus(int status);

	/**
	 * Gets the status by user id of this wiki page.
	 *
	 * @return the status by user id of this wiki page
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user id of this wiki page.
	 *
	 * @param statusByUserId the status by user id of this wiki page
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Gets the status by user uuid of this wiki page.
	 *
	 * @return the status by user uuid of this wiki page
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this wiki page.
	 *
	 * @param statusByUserUuid the status by user uuid of this wiki page
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Gets the status by user name of this wiki page.
	 *
	 * @return the status by user name of this wiki page
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this wiki page.
	 *
	 * @param statusByUserName the status by user name of this wiki page
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Gets the status date of this wiki page.
	 *
	 * @return the status date of this wiki page
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this wiki page.
	 *
	 * @param statusDate the status date of this wiki page
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * Determines whether this wiki page is approved.
	 *
	 * @return true if this wiki page is approved; false otherwise
	 */
	public boolean isApproved();

	/**
	 * Determines whether this wiki page is a draft.
	 *
	 * @return true if this wiki page is a draft; false otherwise
	 */
	public boolean isDraft();

	/**
	 * Determines whether this wiki page is expired.
	 *
	 * @return true if this wiki page is expired; false otherwise
	 */
	public boolean isExpired();

	/**
	 * Determines whether this wiki page is pending.
	 *
	 * @return true if this wiki page is pending; false otherwise
	 */
	public boolean isPending();

	/**
	 * Gets a copy of this wiki page as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public WikiPage toEscapedModel();

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

	public int compareTo(WikiPage wikiPage);

	public int hashCode();

	public String toString();

	public String toXmlString();
}