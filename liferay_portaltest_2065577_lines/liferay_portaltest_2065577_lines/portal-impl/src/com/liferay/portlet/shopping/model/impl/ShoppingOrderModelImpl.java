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

package com.liferay.portlet.shopping.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;
import com.liferay.portlet.shopping.model.ShoppingOrder;
import com.liferay.portlet.shopping.model.ShoppingOrderModel;
import com.liferay.portlet.shopping.model.ShoppingOrderSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the ShoppingOrder service. Represents a row in the &quot;ShoppingOrder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.shopping.model.ShoppingOrderModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ShoppingOrderImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a shopping order model instance should use the {@link com.liferay.portlet.shopping.model.ShoppingOrder} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingOrderImpl
 * @see com.liferay.portlet.shopping.model.ShoppingOrder
 * @see com.liferay.portlet.shopping.model.ShoppingOrderModel
 * @generated
 */
public class ShoppingOrderModelImpl extends BaseModelImpl<ShoppingOrder>
	implements ShoppingOrderModel {
	public static final String TABLE_NAME = "ShoppingOrder";
	public static final Object[][] TABLE_COLUMNS = {
			{ "orderId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "userName", new Integer(Types.VARCHAR) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "number_", new Integer(Types.VARCHAR) },
			{ "tax", new Integer(Types.DOUBLE) },
			{ "shipping", new Integer(Types.DOUBLE) },
			{ "altShipping", new Integer(Types.VARCHAR) },
			{ "requiresShipping", new Integer(Types.BOOLEAN) },
			{ "insure", new Integer(Types.BOOLEAN) },
			{ "insurance", new Integer(Types.DOUBLE) },
			{ "couponCodes", new Integer(Types.VARCHAR) },
			{ "couponDiscount", new Integer(Types.DOUBLE) },
			{ "billingFirstName", new Integer(Types.VARCHAR) },
			{ "billingLastName", new Integer(Types.VARCHAR) },
			{ "billingEmailAddress", new Integer(Types.VARCHAR) },
			{ "billingCompany", new Integer(Types.VARCHAR) },
			{ "billingStreet", new Integer(Types.VARCHAR) },
			{ "billingCity", new Integer(Types.VARCHAR) },
			{ "billingState", new Integer(Types.VARCHAR) },
			{ "billingZip", new Integer(Types.VARCHAR) },
			{ "billingCountry", new Integer(Types.VARCHAR) },
			{ "billingPhone", new Integer(Types.VARCHAR) },
			{ "shipToBilling", new Integer(Types.BOOLEAN) },
			{ "shippingFirstName", new Integer(Types.VARCHAR) },
			{ "shippingLastName", new Integer(Types.VARCHAR) },
			{ "shippingEmailAddress", new Integer(Types.VARCHAR) },
			{ "shippingCompany", new Integer(Types.VARCHAR) },
			{ "shippingStreet", new Integer(Types.VARCHAR) },
			{ "shippingCity", new Integer(Types.VARCHAR) },
			{ "shippingState", new Integer(Types.VARCHAR) },
			{ "shippingZip", new Integer(Types.VARCHAR) },
			{ "shippingCountry", new Integer(Types.VARCHAR) },
			{ "shippingPhone", new Integer(Types.VARCHAR) },
			{ "ccName", new Integer(Types.VARCHAR) },
			{ "ccType", new Integer(Types.VARCHAR) },
			{ "ccNumber", new Integer(Types.VARCHAR) },
			{ "ccExpMonth", new Integer(Types.INTEGER) },
			{ "ccExpYear", new Integer(Types.INTEGER) },
			{ "ccVerNumber", new Integer(Types.VARCHAR) },
			{ "comments", new Integer(Types.VARCHAR) },
			{ "ppTxnId", new Integer(Types.VARCHAR) },
			{ "ppPaymentStatus", new Integer(Types.VARCHAR) },
			{ "ppPaymentGross", new Integer(Types.DOUBLE) },
			{ "ppReceiverEmail", new Integer(Types.VARCHAR) },
			{ "ppPayerEmail", new Integer(Types.VARCHAR) },
			{ "sendOrderEmail", new Integer(Types.BOOLEAN) },
			{ "sendShippingEmail", new Integer(Types.BOOLEAN) }
		};
	public static final String TABLE_SQL_CREATE = "create table ShoppingOrder (orderId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,number_ VARCHAR(75) null,tax DOUBLE,shipping DOUBLE,altShipping VARCHAR(75) null,requiresShipping BOOLEAN,insure BOOLEAN,insurance DOUBLE,couponCodes VARCHAR(75) null,couponDiscount DOUBLE,billingFirstName VARCHAR(75) null,billingLastName VARCHAR(75) null,billingEmailAddress VARCHAR(75) null,billingCompany VARCHAR(75) null,billingStreet VARCHAR(75) null,billingCity VARCHAR(75) null,billingState VARCHAR(75) null,billingZip VARCHAR(75) null,billingCountry VARCHAR(75) null,billingPhone VARCHAR(75) null,shipToBilling BOOLEAN,shippingFirstName VARCHAR(75) null,shippingLastName VARCHAR(75) null,shippingEmailAddress VARCHAR(75) null,shippingCompany VARCHAR(75) null,shippingStreet VARCHAR(75) null,shippingCity VARCHAR(75) null,shippingState VARCHAR(75) null,shippingZip VARCHAR(75) null,shippingCountry VARCHAR(75) null,shippingPhone VARCHAR(75) null,ccName VARCHAR(75) null,ccType VARCHAR(75) null,ccNumber VARCHAR(75) null,ccExpMonth INTEGER,ccExpYear INTEGER,ccVerNumber VARCHAR(75) null,comments STRING null,ppTxnId VARCHAR(75) null,ppPaymentStatus VARCHAR(75) null,ppPaymentGross DOUBLE,ppReceiverEmail VARCHAR(75) null,ppPayerEmail VARCHAR(75) null,sendOrderEmail BOOLEAN,sendShippingEmail BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table ShoppingOrder";
	public static final String ORDER_BY_JPQL = " ORDER BY shoppingOrder.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY ShoppingOrder.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.shopping.model.ShoppingOrder"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.shopping.model.ShoppingOrder"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ShoppingOrder toModel(ShoppingOrderSoap soapModel) {
		ShoppingOrder model = new ShoppingOrderImpl();

		model.setOrderId(soapModel.getOrderId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setNumber(soapModel.getNumber());
		model.setTax(soapModel.getTax());
		model.setShipping(soapModel.getShipping());
		model.setAltShipping(soapModel.getAltShipping());
		model.setRequiresShipping(soapModel.getRequiresShipping());
		model.setInsure(soapModel.getInsure());
		model.setInsurance(soapModel.getInsurance());
		model.setCouponCodes(soapModel.getCouponCodes());
		model.setCouponDiscount(soapModel.getCouponDiscount());
		model.setBillingFirstName(soapModel.getBillingFirstName());
		model.setBillingLastName(soapModel.getBillingLastName());
		model.setBillingEmailAddress(soapModel.getBillingEmailAddress());
		model.setBillingCompany(soapModel.getBillingCompany());
		model.setBillingStreet(soapModel.getBillingStreet());
		model.setBillingCity(soapModel.getBillingCity());
		model.setBillingState(soapModel.getBillingState());
		model.setBillingZip(soapModel.getBillingZip());
		model.setBillingCountry(soapModel.getBillingCountry());
		model.setBillingPhone(soapModel.getBillingPhone());
		model.setShipToBilling(soapModel.getShipToBilling());
		model.setShippingFirstName(soapModel.getShippingFirstName());
		model.setShippingLastName(soapModel.getShippingLastName());
		model.setShippingEmailAddress(soapModel.getShippingEmailAddress());
		model.setShippingCompany(soapModel.getShippingCompany());
		model.setShippingStreet(soapModel.getShippingStreet());
		model.setShippingCity(soapModel.getShippingCity());
		model.setShippingState(soapModel.getShippingState());
		model.setShippingZip(soapModel.getShippingZip());
		model.setShippingCountry(soapModel.getShippingCountry());
		model.setShippingPhone(soapModel.getShippingPhone());
		model.setCcName(soapModel.getCcName());
		model.setCcType(soapModel.getCcType());
		model.setCcNumber(soapModel.getCcNumber());
		model.setCcExpMonth(soapModel.getCcExpMonth());
		model.setCcExpYear(soapModel.getCcExpYear());
		model.setCcVerNumber(soapModel.getCcVerNumber());
		model.setComments(soapModel.getComments());
		model.setPpTxnId(soapModel.getPpTxnId());
		model.setPpPaymentStatus(soapModel.getPpPaymentStatus());
		model.setPpPaymentGross(soapModel.getPpPaymentGross());
		model.setPpReceiverEmail(soapModel.getPpReceiverEmail());
		model.setPpPayerEmail(soapModel.getPpPayerEmail());
		model.setSendOrderEmail(soapModel.getSendOrderEmail());
		model.setSendShippingEmail(soapModel.getSendShippingEmail());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ShoppingOrder> toModels(ShoppingOrderSoap[] soapModels) {
		List<ShoppingOrder> models = new ArrayList<ShoppingOrder>(soapModels.length);

		for (ShoppingOrderSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.shopping.model.ShoppingOrder"));

	public ShoppingOrderModelImpl() {
	}

	public long getPrimaryKey() {
		return _orderId;
	}

	public void setPrimaryKey(long pk) {
		setOrderId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_orderId);
	}

	public long getOrderId() {
		return _orderId;
	}

	public void setOrderId(long orderId) {
		_orderId = orderId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNumber() {
		if (_number == null) {
			return StringPool.BLANK;
		}
		else {
			return _number;
		}
	}

	public void setNumber(String number) {
		_number = number;

		if (_originalNumber == null) {
			_originalNumber = number;
		}
	}

	public String getOriginalNumber() {
		return GetterUtil.getString(_originalNumber);
	}

	public double getTax() {
		return _tax;
	}

	public void setTax(double tax) {
		_tax = tax;
	}

	public double getShipping() {
		return _shipping;
	}

	public void setShipping(double shipping) {
		_shipping = shipping;
	}

	public String getAltShipping() {
		if (_altShipping == null) {
			return StringPool.BLANK;
		}
		else {
			return _altShipping;
		}
	}

	public void setAltShipping(String altShipping) {
		_altShipping = altShipping;
	}

	public boolean getRequiresShipping() {
		return _requiresShipping;
	}

	public boolean isRequiresShipping() {
		return _requiresShipping;
	}

	public void setRequiresShipping(boolean requiresShipping) {
		_requiresShipping = requiresShipping;
	}

	public boolean getInsure() {
		return _insure;
	}

	public boolean isInsure() {
		return _insure;
	}

	public void setInsure(boolean insure) {
		_insure = insure;
	}

	public double getInsurance() {
		return _insurance;
	}

	public void setInsurance(double insurance) {
		_insurance = insurance;
	}

	public String getCouponCodes() {
		if (_couponCodes == null) {
			return StringPool.BLANK;
		}
		else {
			return _couponCodes;
		}
	}

	public void setCouponCodes(String couponCodes) {
		_couponCodes = couponCodes;
	}

	public double getCouponDiscount() {
		return _couponDiscount;
	}

	public void setCouponDiscount(double couponDiscount) {
		_couponDiscount = couponDiscount;
	}

	public String getBillingFirstName() {
		if (_billingFirstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingFirstName;
		}
	}

	public void setBillingFirstName(String billingFirstName) {
		_billingFirstName = billingFirstName;
	}

	public String getBillingLastName() {
		if (_billingLastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingLastName;
		}
	}

	public void setBillingLastName(String billingLastName) {
		_billingLastName = billingLastName;
	}

	public String getBillingEmailAddress() {
		if (_billingEmailAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingEmailAddress;
		}
	}

	public void setBillingEmailAddress(String billingEmailAddress) {
		_billingEmailAddress = billingEmailAddress;
	}

	public String getBillingCompany() {
		if (_billingCompany == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingCompany;
		}
	}

	public void setBillingCompany(String billingCompany) {
		_billingCompany = billingCompany;
	}

	public String getBillingStreet() {
		if (_billingStreet == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingStreet;
		}
	}

	public void setBillingStreet(String billingStreet) {
		_billingStreet = billingStreet;
	}

	public String getBillingCity() {
		if (_billingCity == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingCity;
		}
	}

	public void setBillingCity(String billingCity) {
		_billingCity = billingCity;
	}

	public String getBillingState() {
		if (_billingState == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingState;
		}
	}

	public void setBillingState(String billingState) {
		_billingState = billingState;
	}

	public String getBillingZip() {
		if (_billingZip == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingZip;
		}
	}

	public void setBillingZip(String billingZip) {
		_billingZip = billingZip;
	}

	public String getBillingCountry() {
		if (_billingCountry == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingCountry;
		}
	}

	public void setBillingCountry(String billingCountry) {
		_billingCountry = billingCountry;
	}

	public String getBillingPhone() {
		if (_billingPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _billingPhone;
		}
	}

	public void setBillingPhone(String billingPhone) {
		_billingPhone = billingPhone;
	}

	public boolean getShipToBilling() {
		return _shipToBilling;
	}

	public boolean isShipToBilling() {
		return _shipToBilling;
	}

	public void setShipToBilling(boolean shipToBilling) {
		_shipToBilling = shipToBilling;
	}

	public String getShippingFirstName() {
		if (_shippingFirstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingFirstName;
		}
	}

	public void setShippingFirstName(String shippingFirstName) {
		_shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		if (_shippingLastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingLastName;
		}
	}

	public void setShippingLastName(String shippingLastName) {
		_shippingLastName = shippingLastName;
	}

	public String getShippingEmailAddress() {
		if (_shippingEmailAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingEmailAddress;
		}
	}

	public void setShippingEmailAddress(String shippingEmailAddress) {
		_shippingEmailAddress = shippingEmailAddress;
	}

	public String getShippingCompany() {
		if (_shippingCompany == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingCompany;
		}
	}

	public void setShippingCompany(String shippingCompany) {
		_shippingCompany = shippingCompany;
	}

	public String getShippingStreet() {
		if (_shippingStreet == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingStreet;
		}
	}

	public void setShippingStreet(String shippingStreet) {
		_shippingStreet = shippingStreet;
	}

	public String getShippingCity() {
		if (_shippingCity == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingCity;
		}
	}

	public void setShippingCity(String shippingCity) {
		_shippingCity = shippingCity;
	}

	public String getShippingState() {
		if (_shippingState == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingState;
		}
	}

	public void setShippingState(String shippingState) {
		_shippingState = shippingState;
	}

	public String getShippingZip() {
		if (_shippingZip == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingZip;
		}
	}

	public void setShippingZip(String shippingZip) {
		_shippingZip = shippingZip;
	}

	public String getShippingCountry() {
		if (_shippingCountry == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingCountry;
		}
	}

	public void setShippingCountry(String shippingCountry) {
		_shippingCountry = shippingCountry;
	}

	public String getShippingPhone() {
		if (_shippingPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingPhone;
		}
	}

	public void setShippingPhone(String shippingPhone) {
		_shippingPhone = shippingPhone;
	}

	public String getCcName() {
		if (_ccName == null) {
			return StringPool.BLANK;
		}
		else {
			return _ccName;
		}
	}

	public void setCcName(String ccName) {
		_ccName = ccName;
	}

	public String getCcType() {
		if (_ccType == null) {
			return StringPool.BLANK;
		}
		else {
			return _ccType;
		}
	}

	public void setCcType(String ccType) {
		_ccType = ccType;
	}

	public String getCcNumber() {
		if (_ccNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _ccNumber;
		}
	}

	public void setCcNumber(String ccNumber) {
		_ccNumber = ccNumber;
	}

	public int getCcExpMonth() {
		return _ccExpMonth;
	}

	public void setCcExpMonth(int ccExpMonth) {
		_ccExpMonth = ccExpMonth;
	}

	public int getCcExpYear() {
		return _ccExpYear;
	}

	public void setCcExpYear(int ccExpYear) {
		_ccExpYear = ccExpYear;
	}

	public String getCcVerNumber() {
		if (_ccVerNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _ccVerNumber;
		}
	}

	public void setCcVerNumber(String ccVerNumber) {
		_ccVerNumber = ccVerNumber;
	}

	public String getComments() {
		if (_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _comments;
		}
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public String getPpTxnId() {
		if (_ppTxnId == null) {
			return StringPool.BLANK;
		}
		else {
			return _ppTxnId;
		}
	}

	public void setPpTxnId(String ppTxnId) {
		_ppTxnId = ppTxnId;

		if (_originalPpTxnId == null) {
			_originalPpTxnId = ppTxnId;
		}
	}

	public String getOriginalPpTxnId() {
		return GetterUtil.getString(_originalPpTxnId);
	}

	public String getPpPaymentStatus() {
		if (_ppPaymentStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _ppPaymentStatus;
		}
	}

	public void setPpPaymentStatus(String ppPaymentStatus) {
		_ppPaymentStatus = ppPaymentStatus;
	}

	public double getPpPaymentGross() {
		return _ppPaymentGross;
	}

	public void setPpPaymentGross(double ppPaymentGross) {
		_ppPaymentGross = ppPaymentGross;
	}

	public String getPpReceiverEmail() {
		if (_ppReceiverEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _ppReceiverEmail;
		}
	}

	public void setPpReceiverEmail(String ppReceiverEmail) {
		_ppReceiverEmail = ppReceiverEmail;
	}

	public String getPpPayerEmail() {
		if (_ppPayerEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _ppPayerEmail;
		}
	}

	public void setPpPayerEmail(String ppPayerEmail) {
		_ppPayerEmail = ppPayerEmail;
	}

	public boolean getSendOrderEmail() {
		return _sendOrderEmail;
	}

	public boolean isSendOrderEmail() {
		return _sendOrderEmail;
	}

	public void setSendOrderEmail(boolean sendOrderEmail) {
		_sendOrderEmail = sendOrderEmail;
	}

	public boolean getSendShippingEmail() {
		return _sendShippingEmail;
	}

	public boolean isSendShippingEmail() {
		return _sendShippingEmail;
	}

	public void setSendShippingEmail(boolean sendShippingEmail) {
		_sendShippingEmail = sendShippingEmail;
	}

	public ShoppingOrder toEscapedModel() {
		if (isEscapedModel()) {
			return (ShoppingOrder)this;
		}
		else {
			return (ShoppingOrder)Proxy.newProxyInstance(ShoppingOrder.class.getClassLoader(),
				new Class[] { ShoppingOrder.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					ShoppingOrder.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		ShoppingOrderImpl clone = new ShoppingOrderImpl();

		clone.setOrderId(getOrderId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setNumber(getNumber());
		clone.setTax(getTax());
		clone.setShipping(getShipping());
		clone.setAltShipping(getAltShipping());
		clone.setRequiresShipping(getRequiresShipping());
		clone.setInsure(getInsure());
		clone.setInsurance(getInsurance());
		clone.setCouponCodes(getCouponCodes());
		clone.setCouponDiscount(getCouponDiscount());
		clone.setBillingFirstName(getBillingFirstName());
		clone.setBillingLastName(getBillingLastName());
		clone.setBillingEmailAddress(getBillingEmailAddress());
		clone.setBillingCompany(getBillingCompany());
		clone.setBillingStreet(getBillingStreet());
		clone.setBillingCity(getBillingCity());
		clone.setBillingState(getBillingState());
		clone.setBillingZip(getBillingZip());
		clone.setBillingCountry(getBillingCountry());
		clone.setBillingPhone(getBillingPhone());
		clone.setShipToBilling(getShipToBilling());
		clone.setShippingFirstName(getShippingFirstName());
		clone.setShippingLastName(getShippingLastName());
		clone.setShippingEmailAddress(getShippingEmailAddress());
		clone.setShippingCompany(getShippingCompany());
		clone.setShippingStreet(getShippingStreet());
		clone.setShippingCity(getShippingCity());
		clone.setShippingState(getShippingState());
		clone.setShippingZip(getShippingZip());
		clone.setShippingCountry(getShippingCountry());
		clone.setShippingPhone(getShippingPhone());
		clone.setCcName(getCcName());
		clone.setCcType(getCcType());
		clone.setCcNumber(getCcNumber());
		clone.setCcExpMonth(getCcExpMonth());
		clone.setCcExpYear(getCcExpYear());
		clone.setCcVerNumber(getCcVerNumber());
		clone.setComments(getComments());
		clone.setPpTxnId(getPpTxnId());
		clone.setPpPaymentStatus(getPpPaymentStatus());
		clone.setPpPaymentGross(getPpPaymentGross());
		clone.setPpReceiverEmail(getPpReceiverEmail());
		clone.setPpPayerEmail(getPpPayerEmail());
		clone.setSendOrderEmail(getSendOrderEmail());
		clone.setSendShippingEmail(getSendShippingEmail());

		return clone;
	}

	public int compareTo(ShoppingOrder shoppingOrder) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				shoppingOrder.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ShoppingOrder shoppingOrder = null;

		try {
			shoppingOrder = (ShoppingOrder)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = shoppingOrder.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(103);

		sb.append("{orderId=");
		sb.append(getOrderId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", tax=");
		sb.append(getTax());
		sb.append(", shipping=");
		sb.append(getShipping());
		sb.append(", altShipping=");
		sb.append(getAltShipping());
		sb.append(", requiresShipping=");
		sb.append(getRequiresShipping());
		sb.append(", insure=");
		sb.append(getInsure());
		sb.append(", insurance=");
		sb.append(getInsurance());
		sb.append(", couponCodes=");
		sb.append(getCouponCodes());
		sb.append(", couponDiscount=");
		sb.append(getCouponDiscount());
		sb.append(", billingFirstName=");
		sb.append(getBillingFirstName());
		sb.append(", billingLastName=");
		sb.append(getBillingLastName());
		sb.append(", billingEmailAddress=");
		sb.append(getBillingEmailAddress());
		sb.append(", billingCompany=");
		sb.append(getBillingCompany());
		sb.append(", billingStreet=");
		sb.append(getBillingStreet());
		sb.append(", billingCity=");
		sb.append(getBillingCity());
		sb.append(", billingState=");
		sb.append(getBillingState());
		sb.append(", billingZip=");
		sb.append(getBillingZip());
		sb.append(", billingCountry=");
		sb.append(getBillingCountry());
		sb.append(", billingPhone=");
		sb.append(getBillingPhone());
		sb.append(", shipToBilling=");
		sb.append(getShipToBilling());
		sb.append(", shippingFirstName=");
		sb.append(getShippingFirstName());
		sb.append(", shippingLastName=");
		sb.append(getShippingLastName());
		sb.append(", shippingEmailAddress=");
		sb.append(getShippingEmailAddress());
		sb.append(", shippingCompany=");
		sb.append(getShippingCompany());
		sb.append(", shippingStreet=");
		sb.append(getShippingStreet());
		sb.append(", shippingCity=");
		sb.append(getShippingCity());
		sb.append(", shippingState=");
		sb.append(getShippingState());
		sb.append(", shippingZip=");
		sb.append(getShippingZip());
		sb.append(", shippingCountry=");
		sb.append(getShippingCountry());
		sb.append(", shippingPhone=");
		sb.append(getShippingPhone());
		sb.append(", ccName=");
		sb.append(getCcName());
		sb.append(", ccType=");
		sb.append(getCcType());
		sb.append(", ccNumber=");
		sb.append(getCcNumber());
		sb.append(", ccExpMonth=");
		sb.append(getCcExpMonth());
		sb.append(", ccExpYear=");
		sb.append(getCcExpYear());
		sb.append(", ccVerNumber=");
		sb.append(getCcVerNumber());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", ppTxnId=");
		sb.append(getPpTxnId());
		sb.append(", ppPaymentStatus=");
		sb.append(getPpPaymentStatus());
		sb.append(", ppPaymentGross=");
		sb.append(getPpPaymentGross());
		sb.append(", ppReceiverEmail=");
		sb.append(getPpReceiverEmail());
		sb.append(", ppPayerEmail=");
		sb.append(getPpPayerEmail());
		sb.append(", sendOrderEmail=");
		sb.append(getSendOrderEmail());
		sb.append(", sendShippingEmail=");
		sb.append(getSendShippingEmail());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(157);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.shopping.model.ShoppingOrder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orderId</column-name><column-value><![CDATA[");
		sb.append(getOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tax</column-name><column-value><![CDATA[");
		sb.append(getTax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipping</column-name><column-value><![CDATA[");
		sb.append(getShipping());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>altShipping</column-name><column-value><![CDATA[");
		sb.append(getAltShipping());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requiresShipping</column-name><column-value><![CDATA[");
		sb.append(getRequiresShipping());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insure</column-name><column-value><![CDATA[");
		sb.append(getInsure());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insurance</column-name><column-value><![CDATA[");
		sb.append(getInsurance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>couponCodes</column-name><column-value><![CDATA[");
		sb.append(getCouponCodes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>couponDiscount</column-name><column-value><![CDATA[");
		sb.append(getCouponDiscount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingFirstName</column-name><column-value><![CDATA[");
		sb.append(getBillingFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingLastName</column-name><column-value><![CDATA[");
		sb.append(getBillingLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingEmailAddress</column-name><column-value><![CDATA[");
		sb.append(getBillingEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingCompany</column-name><column-value><![CDATA[");
		sb.append(getBillingCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingStreet</column-name><column-value><![CDATA[");
		sb.append(getBillingStreet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingCity</column-name><column-value><![CDATA[");
		sb.append(getBillingCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingState</column-name><column-value><![CDATA[");
		sb.append(getBillingState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingZip</column-name><column-value><![CDATA[");
		sb.append(getBillingZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingCountry</column-name><column-value><![CDATA[");
		sb.append(getBillingCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingPhone</column-name><column-value><![CDATA[");
		sb.append(getBillingPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipToBilling</column-name><column-value><![CDATA[");
		sb.append(getShipToBilling());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingFirstName</column-name><column-value><![CDATA[");
		sb.append(getShippingFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingLastName</column-name><column-value><![CDATA[");
		sb.append(getShippingLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingEmailAddress</column-name><column-value><![CDATA[");
		sb.append(getShippingEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingCompany</column-name><column-value><![CDATA[");
		sb.append(getShippingCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingStreet</column-name><column-value><![CDATA[");
		sb.append(getShippingStreet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingCity</column-name><column-value><![CDATA[");
		sb.append(getShippingCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingState</column-name><column-value><![CDATA[");
		sb.append(getShippingState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingZip</column-name><column-value><![CDATA[");
		sb.append(getShippingZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingCountry</column-name><column-value><![CDATA[");
		sb.append(getShippingCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingPhone</column-name><column-value><![CDATA[");
		sb.append(getShippingPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccName</column-name><column-value><![CDATA[");
		sb.append(getCcName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccType</column-name><column-value><![CDATA[");
		sb.append(getCcType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccNumber</column-name><column-value><![CDATA[");
		sb.append(getCcNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccExpMonth</column-name><column-value><![CDATA[");
		sb.append(getCcExpMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccExpYear</column-name><column-value><![CDATA[");
		sb.append(getCcExpYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccVerNumber</column-name><column-value><![CDATA[");
		sb.append(getCcVerNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppTxnId</column-name><column-value><![CDATA[");
		sb.append(getPpTxnId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppPaymentStatus</column-name><column-value><![CDATA[");
		sb.append(getPpPaymentStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppPaymentGross</column-name><column-value><![CDATA[");
		sb.append(getPpPaymentGross());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppReceiverEmail</column-name><column-value><![CDATA[");
		sb.append(getPpReceiverEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppPayerEmail</column-name><column-value><![CDATA[");
		sb.append(getPpPayerEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendOrderEmail</column-name><column-value><![CDATA[");
		sb.append(getSendOrderEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendShippingEmail</column-name><column-value><![CDATA[");
		sb.append(getSendShippingEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _orderId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _number;
	private String _originalNumber;
	private double _tax;
	private double _shipping;
	private String _altShipping;
	private boolean _requiresShipping;
	private boolean _insure;
	private double _insurance;
	private String _couponCodes;
	private double _couponDiscount;
	private String _billingFirstName;
	private String _billingLastName;
	private String _billingEmailAddress;
	private String _billingCompany;
	private String _billingStreet;
	private String _billingCity;
	private String _billingState;
	private String _billingZip;
	private String _billingCountry;
	private String _billingPhone;
	private boolean _shipToBilling;
	private String _shippingFirstName;
	private String _shippingLastName;
	private String _shippingEmailAddress;
	private String _shippingCompany;
	private String _shippingStreet;
	private String _shippingCity;
	private String _shippingState;
	private String _shippingZip;
	private String _shippingCountry;
	private String _shippingPhone;
	private String _ccName;
	private String _ccType;
	private String _ccNumber;
	private int _ccExpMonth;
	private int _ccExpYear;
	private String _ccVerNumber;
	private String _comments;
	private String _ppTxnId;
	private String _originalPpTxnId;
	private String _ppPaymentStatus;
	private double _ppPaymentGross;
	private String _ppReceiverEmail;
	private String _ppPayerEmail;
	private boolean _sendOrderEmail;
	private boolean _sendShippingEmail;
	private transient ExpandoBridge _expandoBridge;
}