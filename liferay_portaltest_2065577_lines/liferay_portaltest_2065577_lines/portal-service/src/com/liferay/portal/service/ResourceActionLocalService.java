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

package com.liferay.portal.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the resource action local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link ResourceActionLocalServiceUtil} to access the resource action local service. Add custom service methods to {@link com.liferay.portal.service.impl.ResourceActionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourceActionLocalServiceUtil
 * @see com.liferay.portal.service.base.ResourceActionLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.ResourceActionLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ResourceActionLocalService {
	/**
	* Adds the resource action to the database. Also notifies the appropriate model listeners.
	*
	* @param resourceAction the resource action to add
	* @return the resource action that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceAction addResourceAction(
		com.liferay.portal.model.ResourceAction resourceAction)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new resource action with the primary key. Does not add the resource action to the database.
	*
	* @param resourceActionId the primary key for the new resource action
	* @return the new resource action
	*/
	public com.liferay.portal.model.ResourceAction createResourceAction(
		long resourceActionId);

	/**
	* Deletes the resource action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceActionId the primary key of the resource action to delete
	* @throws PortalException if a resource action with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResourceAction(long resourceActionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the resource action from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceAction the resource action to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResourceAction(
		com.liferay.portal.model.ResourceAction resourceAction)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the resource action with the primary key.
	*
	* @param resourceActionId the primary key of the resource action to get
	* @return the resource action
	* @throws PortalException if a resource action with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.ResourceAction getResourceAction(
		long resourceActionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the resource actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of resource actions to return
	* @param end the upper bound of the range of resource actions to return (not inclusive)
	* @return the range of resource actions
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.ResourceAction> getResourceActions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of resource actions.
	*
	* @return the number of resource actions
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getResourceActionsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the resource action in the database. Also notifies the appropriate model listeners.
	*
	* @param resourceAction the resource action to update
	* @return the resource action that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceAction updateResourceAction(
		com.liferay.portal.model.ResourceAction resourceAction)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the resource action in the database. Also notifies the appropriate model listeners.
	*
	* @param resourceAction the resource action to update
	* @param merge whether to merge the resource action with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the resource action that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceAction updateResourceAction(
		com.liferay.portal.model.ResourceAction resourceAction, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void checkResourceActions()
		throws com.liferay.portal.kernel.exception.SystemException;

	public void checkResourceActions(java.lang.String name,
		java.util.List<java.lang.String> actionIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.ResourceAction getResourceAction(
		java.lang.String name, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.ResourceAction> getResourceActions(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;
}