/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KaleoTransition}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTransition
 * @generated
 */
public class KaleoTransitionWrapper implements KaleoTransition,
	ModelWrapper<KaleoTransition> {
	public KaleoTransitionWrapper(KaleoTransition kaleoTransition) {
		_kaleoTransition = kaleoTransition;
	}


	public Class<?> getModelClass() {
		return KaleoTransition.class;
	}


	public String getModelClassName() {
		return KaleoTransition.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoTransitionId", getKaleoTransitionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("kaleoNodeId", getKaleoNodeId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("sourceKaleoNodeId", getSourceKaleoNodeId());
		attributes.put("sourceKaleoNodeName", getSourceKaleoNodeName());
		attributes.put("targetKaleoNodeId", getTargetKaleoNodeId());
		attributes.put("targetKaleoNodeName", getTargetKaleoNodeName());
		attributes.put("defaultTransition", getDefaultTransition());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoTransitionId = (Long)attributes.get("kaleoTransitionId");

		if (kaleoTransitionId != null) {
			setKaleoTransitionId(kaleoTransitionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long kaleoDefinitionId = (Long)attributes.get("kaleoDefinitionId");

		if (kaleoDefinitionId != null) {
			setKaleoDefinitionId(kaleoDefinitionId);
		}

		Long kaleoNodeId = (Long)attributes.get("kaleoNodeId");

		if (kaleoNodeId != null) {
			setKaleoNodeId(kaleoNodeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long sourceKaleoNodeId = (Long)attributes.get("sourceKaleoNodeId");

		if (sourceKaleoNodeId != null) {
			setSourceKaleoNodeId(sourceKaleoNodeId);
		}

		String sourceKaleoNodeName = (String)attributes.get(
				"sourceKaleoNodeName");

		if (sourceKaleoNodeName != null) {
			setSourceKaleoNodeName(sourceKaleoNodeName);
		}

		Long targetKaleoNodeId = (Long)attributes.get("targetKaleoNodeId");

		if (targetKaleoNodeId != null) {
			setTargetKaleoNodeId(targetKaleoNodeId);
		}

		String targetKaleoNodeName = (String)attributes.get(
				"targetKaleoNodeName");

		if (targetKaleoNodeName != null) {
			setTargetKaleoNodeName(targetKaleoNodeName);
		}

		Boolean defaultTransition = (Boolean)attributes.get("defaultTransition");

		if (defaultTransition != null) {
			setDefaultTransition(defaultTransition);
		}
	}


	public java.lang.Object clone() {
		return new KaleoTransitionWrapper((KaleoTransition)_kaleoTransition.clone());
	}


	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition) {
		return _kaleoTransition.compareTo(kaleoTransition);
	}

	/**
	* Returns the company ID of this kaleo transition.
	*
	* @return the company ID of this kaleo transition
	*/

	public long getCompanyId() {
		return _kaleoTransition.getCompanyId();
	}

	/**
	* Returns the create date of this kaleo transition.
	*
	* @return the create date of this kaleo transition
	*/

	public java.util.Date getCreateDate() {
		return _kaleoTransition.getCreateDate();
	}

	/**
	* Returns the default transition of this kaleo transition.
	*
	* @return the default transition of this kaleo transition
	*/

	public boolean getDefaultTransition() {
		return _kaleoTransition.getDefaultTransition();
	}

	/**
	* Returns the description of this kaleo transition.
	*
	* @return the description of this kaleo transition
	*/

	public java.lang.String getDescription() {
		return _kaleoTransition.getDescription();
	}


	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoTransition.getExpandoBridge();
	}

	/**
	* Returns the group ID of this kaleo transition.
	*
	* @return the group ID of this kaleo transition
	*/

	public long getGroupId() {
		return _kaleoTransition.getGroupId();
	}

	/**
	* Returns the kaleo definition ID of this kaleo transition.
	*
	* @return the kaleo definition ID of this kaleo transition
	*/

	public long getKaleoDefinitionId() {
		return _kaleoTransition.getKaleoDefinitionId();
	}

	/**
	* Returns the kaleo node ID of this kaleo transition.
	*
	* @return the kaleo node ID of this kaleo transition
	*/

	public long getKaleoNodeId() {
		return _kaleoTransition.getKaleoNodeId();
	}

	/**
	* Returns the kaleo transition ID of this kaleo transition.
	*
	* @return the kaleo transition ID of this kaleo transition
	*/

	public long getKaleoTransitionId() {
		return _kaleoTransition.getKaleoTransitionId();
	}

	/**
	* Returns the modified date of this kaleo transition.
	*
	* @return the modified date of this kaleo transition
	*/

	public java.util.Date getModifiedDate() {
		return _kaleoTransition.getModifiedDate();
	}

	/**
	* Returns the name of this kaleo transition.
	*
	* @return the name of this kaleo transition
	*/

	public java.lang.String getName() {
		return _kaleoTransition.getName();
	}

	/**
	* Returns the primary key of this kaleo transition.
	*
	* @return the primary key of this kaleo transition
	*/

	public long getPrimaryKey() {
		return _kaleoTransition.getPrimaryKey();
	}


	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoTransition.getPrimaryKeyObj();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoNode getSourceKaleoNode()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransition.getSourceKaleoNode();
	}

	/**
	* Returns the source kaleo node ID of this kaleo transition.
	*
	* @return the source kaleo node ID of this kaleo transition
	*/

	public long getSourceKaleoNodeId() {
		return _kaleoTransition.getSourceKaleoNodeId();
	}

	/**
	* Returns the source kaleo node name of this kaleo transition.
	*
	* @return the source kaleo node name of this kaleo transition
	*/

	public java.lang.String getSourceKaleoNodeName() {
		return _kaleoTransition.getSourceKaleoNodeName();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoNode getTargetKaleoNode()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransition.getTargetKaleoNode();
	}

	/**
	* Returns the target kaleo node ID of this kaleo transition.
	*
	* @return the target kaleo node ID of this kaleo transition
	*/

	public long getTargetKaleoNodeId() {
		return _kaleoTransition.getTargetKaleoNodeId();
	}

	/**
	* Returns the target kaleo node name of this kaleo transition.
	*
	* @return the target kaleo node name of this kaleo transition
	*/

	public java.lang.String getTargetKaleoNodeName() {
		return _kaleoTransition.getTargetKaleoNodeName();
	}

	/**
	* Returns the user ID of this kaleo transition.
	*
	* @return the user ID of this kaleo transition
	*/

	public long getUserId() {
		return _kaleoTransition.getUserId();
	}

	/**
	* Returns the user name of this kaleo transition.
	*
	* @return the user name of this kaleo transition
	*/

	public java.lang.String getUserName() {
		return _kaleoTransition.getUserName();
	}

	/**
	* Returns the user uuid of this kaleo transition.
	*
	* @return the user uuid of this kaleo transition
	*/

	public java.lang.String getUserUuid() {
		return _kaleoTransition.getUserUuid();
	}


	public int hashCode() {
		return _kaleoTransition.hashCode();
	}


	public boolean isCachedModel() {
		return _kaleoTransition.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this kaleo transition is default transition.
	*
	* @return <code>true</code> if this kaleo transition is default transition; <code>false</code> otherwise
	*/

	public boolean isDefaultTransition() {
		return _kaleoTransition.isDefaultTransition();
	}


	public boolean isEscapedModel() {
		return _kaleoTransition.isEscapedModel();
	}


	public boolean isNew() {
		return _kaleoTransition.isNew();
	}


	public void persist() {
		_kaleoTransition.persist();
	}


	public void setCachedModel(boolean cachedModel) {
		_kaleoTransition.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this kaleo transition.
	*
	* @param companyId the company ID of this kaleo transition
	*/

	public void setCompanyId(long companyId) {
		_kaleoTransition.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this kaleo transition.
	*
	* @param createDate the create date of this kaleo transition
	*/

	public void setCreateDate(java.util.Date createDate) {
		_kaleoTransition.setCreateDate(createDate);
	}

	/**
	* Sets whether this kaleo transition is default transition.
	*
	* @param defaultTransition the default transition of this kaleo transition
	*/

	public void setDefaultTransition(boolean defaultTransition) {
		_kaleoTransition.setDefaultTransition(defaultTransition);
	}

	/**
	* Sets the description of this kaleo transition.
	*
	* @param description the description of this kaleo transition
	*/

	public void setDescription(java.lang.String description) {
		_kaleoTransition.setDescription(description);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_kaleoTransition.setExpandoBridgeAttributes(baseModel);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_kaleoTransition.setExpandoBridgeAttributes(expandoBridge);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoTransition.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this kaleo transition.
	*
	* @param groupId the group ID of this kaleo transition
	*/

	public void setGroupId(long groupId) {
		_kaleoTransition.setGroupId(groupId);
	}

	/**
	* Sets the kaleo definition ID of this kaleo transition.
	*
	* @param kaleoDefinitionId the kaleo definition ID of this kaleo transition
	*/

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoTransition.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Sets the kaleo node ID of this kaleo transition.
	*
	* @param kaleoNodeId the kaleo node ID of this kaleo transition
	*/

	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoTransition.setKaleoNodeId(kaleoNodeId);
	}

	/**
	* Sets the kaleo transition ID of this kaleo transition.
	*
	* @param kaleoTransitionId the kaleo transition ID of this kaleo transition
	*/

	public void setKaleoTransitionId(long kaleoTransitionId) {
		_kaleoTransition.setKaleoTransitionId(kaleoTransitionId);
	}

	/**
	* Sets the modified date of this kaleo transition.
	*
	* @param modifiedDate the modified date of this kaleo transition
	*/

	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoTransition.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this kaleo transition.
	*
	* @param name the name of this kaleo transition
	*/

	public void setName(java.lang.String name) {
		_kaleoTransition.setName(name);
	}


	public void setNew(boolean n) {
		_kaleoTransition.setNew(n);
	}

	/**
	* Sets the primary key of this kaleo transition.
	*
	* @param primaryKey the primary key of this kaleo transition
	*/

	public void setPrimaryKey(long primaryKey) {
		_kaleoTransition.setPrimaryKey(primaryKey);
	}


	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_kaleoTransition.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the source kaleo node ID of this kaleo transition.
	*
	* @param sourceKaleoNodeId the source kaleo node ID of this kaleo transition
	*/

	public void setSourceKaleoNodeId(long sourceKaleoNodeId) {
		_kaleoTransition.setSourceKaleoNodeId(sourceKaleoNodeId);
	}

	/**
	* Sets the source kaleo node name of this kaleo transition.
	*
	* @param sourceKaleoNodeName the source kaleo node name of this kaleo transition
	*/

	public void setSourceKaleoNodeName(java.lang.String sourceKaleoNodeName) {
		_kaleoTransition.setSourceKaleoNodeName(sourceKaleoNodeName);
	}

	/**
	* Sets the target kaleo node ID of this kaleo transition.
	*
	* @param targetKaleoNodeId the target kaleo node ID of this kaleo transition
	*/

	public void setTargetKaleoNodeId(long targetKaleoNodeId) {
		_kaleoTransition.setTargetKaleoNodeId(targetKaleoNodeId);
	}

	/**
	* Sets the target kaleo node name of this kaleo transition.
	*
	* @param targetKaleoNodeName the target kaleo node name of this kaleo transition
	*/

	public void setTargetKaleoNodeName(java.lang.String targetKaleoNodeName) {
		_kaleoTransition.setTargetKaleoNodeName(targetKaleoNodeName);
	}

	/**
	* Sets the user ID of this kaleo transition.
	*
	* @param userId the user ID of this kaleo transition
	*/

	public void setUserId(long userId) {
		_kaleoTransition.setUserId(userId);
	}

	/**
	* Sets the user name of this kaleo transition.
	*
	* @param userName the user name of this kaleo transition
	*/

	public void setUserName(java.lang.String userName) {
		_kaleoTransition.setUserName(userName);
	}

	/**
	* Sets the user uuid of this kaleo transition.
	*
	* @param userUuid the user uuid of this kaleo transition
	*/

	public void setUserUuid(java.lang.String userUuid) {
		_kaleoTransition.setUserUuid(userUuid);
	}


	public com.liferay.portal.model.CacheModel<com.liferay.portal.workflow.kaleo.model.KaleoTransition> toCacheModel() {
		return _kaleoTransition.toCacheModel();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTransition toEscapedModel() {
		return new KaleoTransitionWrapper(_kaleoTransition.toEscapedModel());
	}


	public java.lang.String toString() {
		return _kaleoTransition.toString();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTransition toUnescapedModel() {
		return new KaleoTransitionWrapper(_kaleoTransition.toUnescapedModel());
	}


	public java.lang.String toXmlString() {
		return _kaleoTransition.toXmlString();
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoTransitionWrapper)) {
			return false;
		}

		KaleoTransitionWrapper kaleoTransitionWrapper = (KaleoTransitionWrapper)obj;

		if (Validator.equals(_kaleoTransition,
					kaleoTransitionWrapper._kaleoTransition)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public KaleoTransition getWrappedKaleoTransition() {
		return _kaleoTransition;
	}


	public KaleoTransition getWrappedModel() {
		return _kaleoTransition;
	}


	public boolean isEntityCacheEnabled() {
		return _kaleoTransition.isEntityCacheEnabled();
	}


	public boolean isFinderCacheEnabled() {
		return _kaleoTransition.isFinderCacheEnabled();
	}


	public void resetOriginalValues() {
		_kaleoTransition.resetOriginalValues();
	}

	private KaleoTransition _kaleoTransition;
}