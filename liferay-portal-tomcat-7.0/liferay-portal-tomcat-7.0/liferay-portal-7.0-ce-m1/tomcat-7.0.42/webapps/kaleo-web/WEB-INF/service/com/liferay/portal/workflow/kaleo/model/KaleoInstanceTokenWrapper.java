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
 * This class is a wrapper for {@link KaleoInstanceToken}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoInstanceToken
 * @generated
 */
public class KaleoInstanceTokenWrapper implements KaleoInstanceToken,
	ModelWrapper<KaleoInstanceToken> {
	public KaleoInstanceTokenWrapper(KaleoInstanceToken kaleoInstanceToken) {
		_kaleoInstanceToken = kaleoInstanceToken;
	}


	public Class<?> getModelClass() {
		return KaleoInstanceToken.class;
	}


	public String getModelClassName() {
		return KaleoInstanceToken.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoInstanceTokenId", getKaleoInstanceTokenId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("kaleoInstanceId", getKaleoInstanceId());
		attributes.put("parentKaleoInstanceTokenId",
			getParentKaleoInstanceTokenId());
		attributes.put("currentKaleoNodeId", getCurrentKaleoNodeId());
		attributes.put("currentKaleoNodeName", getCurrentKaleoNodeName());
		attributes.put("className", getClassName());
		attributes.put("classPK", getClassPK());
		attributes.put("completed", getCompleted());
		attributes.put("completionDate", getCompletionDate());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoInstanceTokenId = (Long)attributes.get("kaleoInstanceTokenId");

		if (kaleoInstanceTokenId != null) {
			setKaleoInstanceTokenId(kaleoInstanceTokenId);
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

		Long kaleoInstanceId = (Long)attributes.get("kaleoInstanceId");

		if (kaleoInstanceId != null) {
			setKaleoInstanceId(kaleoInstanceId);
		}

		Long parentKaleoInstanceTokenId = (Long)attributes.get(
				"parentKaleoInstanceTokenId");

		if (parentKaleoInstanceTokenId != null) {
			setParentKaleoInstanceTokenId(parentKaleoInstanceTokenId);
		}

		Long currentKaleoNodeId = (Long)attributes.get("currentKaleoNodeId");

		if (currentKaleoNodeId != null) {
			setCurrentKaleoNodeId(currentKaleoNodeId);
		}

		String currentKaleoNodeName = (String)attributes.get(
				"currentKaleoNodeName");

		if (currentKaleoNodeName != null) {
			setCurrentKaleoNodeName(currentKaleoNodeName);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Boolean completed = (Boolean)attributes.get("completed");

		if (completed != null) {
			setCompleted(completed);
		}

		Date completionDate = (Date)attributes.get("completionDate");

		if (completionDate != null) {
			setCompletionDate(completionDate);
		}
	}


	public java.lang.Object clone() {
		return new KaleoInstanceTokenWrapper((KaleoInstanceToken)_kaleoInstanceToken.clone());
	}


	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken kaleoInstanceToken) {
		return _kaleoInstanceToken.compareTo(kaleoInstanceToken);
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken> getChildrenKaleoInstanceTokens() {
		return _kaleoInstanceToken.getChildrenKaleoInstanceTokens();
	}

	/**
	* Returns the class name of this kaleo instance token.
	*
	* @return the class name of this kaleo instance token
	*/

	public java.lang.String getClassName() {
		return _kaleoInstanceToken.getClassName();
	}

	/**
	* Returns the class p k of this kaleo instance token.
	*
	* @return the class p k of this kaleo instance token
	*/

	public long getClassPK() {
		return _kaleoInstanceToken.getClassPK();
	}

	/**
	* Returns the company ID of this kaleo instance token.
	*
	* @return the company ID of this kaleo instance token
	*/

	public long getCompanyId() {
		return _kaleoInstanceToken.getCompanyId();
	}

	/**
	* Returns the completed of this kaleo instance token.
	*
	* @return the completed of this kaleo instance token
	*/

	public boolean getCompleted() {
		return _kaleoInstanceToken.getCompleted();
	}

	/**
	* Returns the completion date of this kaleo instance token.
	*
	* @return the completion date of this kaleo instance token
	*/

	public java.util.Date getCompletionDate() {
		return _kaleoInstanceToken.getCompletionDate();
	}

	/**
	* Returns the create date of this kaleo instance token.
	*
	* @return the create date of this kaleo instance token
	*/

	public java.util.Date getCreateDate() {
		return _kaleoInstanceToken.getCreateDate();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoNode getCurrentKaleoNode()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoInstanceToken.getCurrentKaleoNode();
	}

	/**
	* Returns the current kaleo node ID of this kaleo instance token.
	*
	* @return the current kaleo node ID of this kaleo instance token
	*/

	public long getCurrentKaleoNodeId() {
		return _kaleoInstanceToken.getCurrentKaleoNodeId();
	}

	/**
	* Returns the current kaleo node name of this kaleo instance token.
	*
	* @return the current kaleo node name of this kaleo instance token
	*/

	public java.lang.String getCurrentKaleoNodeName() {
		return _kaleoInstanceToken.getCurrentKaleoNodeName();
	}


	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoInstanceToken.getExpandoBridge();
	}

	/**
	* Returns the group ID of this kaleo instance token.
	*
	* @return the group ID of this kaleo instance token
	*/

	public long getGroupId() {
		return _kaleoInstanceToken.getGroupId();
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken> getIncompleteChildrenKaleoInstanceTokens() {
		return _kaleoInstanceToken.getIncompleteChildrenKaleoInstanceTokens();
	}

	/**
	* Returns the kaleo definition ID of this kaleo instance token.
	*
	* @return the kaleo definition ID of this kaleo instance token
	*/

	public long getKaleoDefinitionId() {
		return _kaleoInstanceToken.getKaleoDefinitionId();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoInstance getKaleoInstance()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoInstanceToken.getKaleoInstance();
	}

	/**
	* Returns the kaleo instance ID of this kaleo instance token.
	*
	* @return the kaleo instance ID of this kaleo instance token
	*/

	public long getKaleoInstanceId() {
		return _kaleoInstanceToken.getKaleoInstanceId();
	}

	/**
	* Returns the kaleo instance token ID of this kaleo instance token.
	*
	* @return the kaleo instance token ID of this kaleo instance token
	*/

	public long getKaleoInstanceTokenId() {
		return _kaleoInstanceToken.getKaleoInstanceTokenId();
	}

	/**
	* Returns the modified date of this kaleo instance token.
	*
	* @return the modified date of this kaleo instance token
	*/

	public java.util.Date getModifiedDate() {
		return _kaleoInstanceToken.getModifiedDate();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken getParentKaleoInstanceToken()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoInstanceToken.getParentKaleoInstanceToken();
	}

	/**
	* Returns the parent kaleo instance token ID of this kaleo instance token.
	*
	* @return the parent kaleo instance token ID of this kaleo instance token
	*/

	public long getParentKaleoInstanceTokenId() {
		return _kaleoInstanceToken.getParentKaleoInstanceTokenId();
	}

	/**
	* Returns the primary key of this kaleo instance token.
	*
	* @return the primary key of this kaleo instance token
	*/

	public long getPrimaryKey() {
		return _kaleoInstanceToken.getPrimaryKey();
	}


	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoInstanceToken.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this kaleo instance token.
	*
	* @return the user ID of this kaleo instance token
	*/

	public long getUserId() {
		return _kaleoInstanceToken.getUserId();
	}

	/**
	* Returns the user name of this kaleo instance token.
	*
	* @return the user name of this kaleo instance token
	*/

	public java.lang.String getUserName() {
		return _kaleoInstanceToken.getUserName();
	}

	/**
	* Returns the user uuid of this kaleo instance token.
	*
	* @return the user uuid of this kaleo instance token
	*/

	public java.lang.String getUserUuid() {
		return _kaleoInstanceToken.getUserUuid();
	}


	public boolean hasIncompleteChildrenKaleoInstanceToken() {
		return _kaleoInstanceToken.hasIncompleteChildrenKaleoInstanceToken();
	}


	public int hashCode() {
		return _kaleoInstanceToken.hashCode();
	}


	public boolean isCachedModel() {
		return _kaleoInstanceToken.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this kaleo instance token is completed.
	*
	* @return <code>true</code> if this kaleo instance token is completed; <code>false</code> otherwise
	*/

	public boolean isCompleted() {
		return _kaleoInstanceToken.isCompleted();
	}


	public boolean isEscapedModel() {
		return _kaleoInstanceToken.isEscapedModel();
	}


	public boolean isNew() {
		return _kaleoInstanceToken.isNew();
	}


	public void persist() {
		_kaleoInstanceToken.persist();
	}


	public void setCachedModel(boolean cachedModel) {
		_kaleoInstanceToken.setCachedModel(cachedModel);
	}

	/**
	* Sets the class name of this kaleo instance token.
	*
	* @param className the class name of this kaleo instance token
	*/

	public void setClassName(java.lang.String className) {
		_kaleoInstanceToken.setClassName(className);
	}

	/**
	* Sets the class p k of this kaleo instance token.
	*
	* @param classPK the class p k of this kaleo instance token
	*/

	public void setClassPK(long classPK) {
		_kaleoInstanceToken.setClassPK(classPK);
	}

	/**
	* Sets the company ID of this kaleo instance token.
	*
	* @param companyId the company ID of this kaleo instance token
	*/

	public void setCompanyId(long companyId) {
		_kaleoInstanceToken.setCompanyId(companyId);
	}

	/**
	* Sets whether this kaleo instance token is completed.
	*
	* @param completed the completed of this kaleo instance token
	*/

	public void setCompleted(boolean completed) {
		_kaleoInstanceToken.setCompleted(completed);
	}

	/**
	* Sets the completion date of this kaleo instance token.
	*
	* @param completionDate the completion date of this kaleo instance token
	*/

	public void setCompletionDate(java.util.Date completionDate) {
		_kaleoInstanceToken.setCompletionDate(completionDate);
	}

	/**
	* Sets the create date of this kaleo instance token.
	*
	* @param createDate the create date of this kaleo instance token
	*/

	public void setCreateDate(java.util.Date createDate) {
		_kaleoInstanceToken.setCreateDate(createDate);
	}


	public void setCurrentKaleoNode(
		com.liferay.portal.workflow.kaleo.model.KaleoNode kaleoNode)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kaleoInstanceToken.setCurrentKaleoNode(kaleoNode);
	}

	/**
	* Sets the current kaleo node ID of this kaleo instance token.
	*
	* @param currentKaleoNodeId the current kaleo node ID of this kaleo instance token
	*/

	public void setCurrentKaleoNodeId(long currentKaleoNodeId) {
		_kaleoInstanceToken.setCurrentKaleoNodeId(currentKaleoNodeId);
	}

	/**
	* Sets the current kaleo node name of this kaleo instance token.
	*
	* @param currentKaleoNodeName the current kaleo node name of this kaleo instance token
	*/

	public void setCurrentKaleoNodeName(java.lang.String currentKaleoNodeName) {
		_kaleoInstanceToken.setCurrentKaleoNodeName(currentKaleoNodeName);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_kaleoInstanceToken.setExpandoBridgeAttributes(baseModel);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_kaleoInstanceToken.setExpandoBridgeAttributes(expandoBridge);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoInstanceToken.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this kaleo instance token.
	*
	* @param groupId the group ID of this kaleo instance token
	*/

	public void setGroupId(long groupId) {
		_kaleoInstanceToken.setGroupId(groupId);
	}

	/**
	* Sets the kaleo definition ID of this kaleo instance token.
	*
	* @param kaleoDefinitionId the kaleo definition ID of this kaleo instance token
	*/

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoInstanceToken.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Sets the kaleo instance ID of this kaleo instance token.
	*
	* @param kaleoInstanceId the kaleo instance ID of this kaleo instance token
	*/

	public void setKaleoInstanceId(long kaleoInstanceId) {
		_kaleoInstanceToken.setKaleoInstanceId(kaleoInstanceId);
	}

	/**
	* Sets the kaleo instance token ID of this kaleo instance token.
	*
	* @param kaleoInstanceTokenId the kaleo instance token ID of this kaleo instance token
	*/

	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId) {
		_kaleoInstanceToken.setKaleoInstanceTokenId(kaleoInstanceTokenId);
	}

	/**
	* Sets the modified date of this kaleo instance token.
	*
	* @param modifiedDate the modified date of this kaleo instance token
	*/

	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoInstanceToken.setModifiedDate(modifiedDate);
	}


	public void setNew(boolean n) {
		_kaleoInstanceToken.setNew(n);
	}

	/**
	* Sets the parent kaleo instance token ID of this kaleo instance token.
	*
	* @param parentKaleoInstanceTokenId the parent kaleo instance token ID of this kaleo instance token
	*/

	public void setParentKaleoInstanceTokenId(long parentKaleoInstanceTokenId) {
		_kaleoInstanceToken.setParentKaleoInstanceTokenId(parentKaleoInstanceTokenId);
	}

	/**
	* Sets the primary key of this kaleo instance token.
	*
	* @param primaryKey the primary key of this kaleo instance token
	*/

	public void setPrimaryKey(long primaryKey) {
		_kaleoInstanceToken.setPrimaryKey(primaryKey);
	}


	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_kaleoInstanceToken.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this kaleo instance token.
	*
	* @param userId the user ID of this kaleo instance token
	*/

	public void setUserId(long userId) {
		_kaleoInstanceToken.setUserId(userId);
	}

	/**
	* Sets the user name of this kaleo instance token.
	*
	* @param userName the user name of this kaleo instance token
	*/

	public void setUserName(java.lang.String userName) {
		_kaleoInstanceToken.setUserName(userName);
	}

	/**
	* Sets the user uuid of this kaleo instance token.
	*
	* @param userUuid the user uuid of this kaleo instance token
	*/

	public void setUserUuid(java.lang.String userUuid) {
		_kaleoInstanceToken.setUserUuid(userUuid);
	}


	public com.liferay.portal.model.CacheModel<com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken> toCacheModel() {
		return _kaleoInstanceToken.toCacheModel();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken toEscapedModel() {
		return new KaleoInstanceTokenWrapper(_kaleoInstanceToken.toEscapedModel());
	}


	public java.lang.String toString() {
		return _kaleoInstanceToken.toString();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken toUnescapedModel() {
		return new KaleoInstanceTokenWrapper(_kaleoInstanceToken.toUnescapedModel());
	}


	public java.lang.String toXmlString() {
		return _kaleoInstanceToken.toXmlString();
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoInstanceTokenWrapper)) {
			return false;
		}

		KaleoInstanceTokenWrapper kaleoInstanceTokenWrapper = (KaleoInstanceTokenWrapper)obj;

		if (Validator.equals(_kaleoInstanceToken,
					kaleoInstanceTokenWrapper._kaleoInstanceToken)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public KaleoInstanceToken getWrappedKaleoInstanceToken() {
		return _kaleoInstanceToken;
	}


	public KaleoInstanceToken getWrappedModel() {
		return _kaleoInstanceToken;
	}


	public boolean isEntityCacheEnabled() {
		return _kaleoInstanceToken.isEntityCacheEnabled();
	}


	public boolean isFinderCacheEnabled() {
		return _kaleoInstanceToken.isFinderCacheEnabled();
	}


	public void resetOriginalValues() {
		_kaleoInstanceToken.resetOriginalValues();
	}

	private KaleoInstanceToken _kaleoInstanceToken;
}