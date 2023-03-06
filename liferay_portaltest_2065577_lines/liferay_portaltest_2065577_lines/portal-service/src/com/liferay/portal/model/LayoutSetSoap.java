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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link com.liferay.portal.service.http.LayoutSetServiceSoap}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       com.liferay.portal.service.http.LayoutSetServiceSoap
 * @generated
 */
public class LayoutSetSoap implements Serializable {
	public static LayoutSetSoap toSoapModel(LayoutSet model) {
		LayoutSetSoap soapModel = new LayoutSetSoap();

		soapModel.setLayoutSetId(model.getLayoutSetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setPrivateLayout(model.getPrivateLayout());
		soapModel.setLogo(model.getLogo());
		soapModel.setLogoId(model.getLogoId());
		soapModel.setThemeId(model.getThemeId());
		soapModel.setColorSchemeId(model.getColorSchemeId());
		soapModel.setWapThemeId(model.getWapThemeId());
		soapModel.setWapColorSchemeId(model.getWapColorSchemeId());
		soapModel.setCss(model.getCss());
		soapModel.setPageCount(model.getPageCount());
		soapModel.setVirtualHost(model.getVirtualHost());
		soapModel.setSettings(model.getSettings());
		soapModel.setLayoutSetPrototypeId(model.getLayoutSetPrototypeId());

		return soapModel;
	}

	public static LayoutSetSoap[] toSoapModels(LayoutSet[] models) {
		LayoutSetSoap[] soapModels = new LayoutSetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LayoutSetSoap[][] toSoapModels(LayoutSet[][] models) {
		LayoutSetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LayoutSetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LayoutSetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LayoutSetSoap[] toSoapModels(List<LayoutSet> models) {
		List<LayoutSetSoap> soapModels = new ArrayList<LayoutSetSoap>(models.size());

		for (LayoutSet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LayoutSetSoap[soapModels.size()]);
	}

	public LayoutSetSoap() {
	}

	public long getPrimaryKey() {
		return _layoutSetId;
	}

	public void setPrimaryKey(long pk) {
		setLayoutSetId(pk);
	}

	public long getLayoutSetId() {
		return _layoutSetId;
	}

	public void setLayoutSetId(long layoutSetId) {
		_layoutSetId = layoutSetId;
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

	public boolean getPrivateLayout() {
		return _privateLayout;
	}

	public boolean isPrivateLayout() {
		return _privateLayout;
	}

	public void setPrivateLayout(boolean privateLayout) {
		_privateLayout = privateLayout;
	}

	public boolean getLogo() {
		return _logo;
	}

	public boolean isLogo() {
		return _logo;
	}

	public void setLogo(boolean logo) {
		_logo = logo;
	}

	public long getLogoId() {
		return _logoId;
	}

	public void setLogoId(long logoId) {
		_logoId = logoId;
	}

	public String getThemeId() {
		return _themeId;
	}

	public void setThemeId(String themeId) {
		_themeId = themeId;
	}

	public String getColorSchemeId() {
		return _colorSchemeId;
	}

	public void setColorSchemeId(String colorSchemeId) {
		_colorSchemeId = colorSchemeId;
	}

	public String getWapThemeId() {
		return _wapThemeId;
	}

	public void setWapThemeId(String wapThemeId) {
		_wapThemeId = wapThemeId;
	}

	public String getWapColorSchemeId() {
		return _wapColorSchemeId;
	}

	public void setWapColorSchemeId(String wapColorSchemeId) {
		_wapColorSchemeId = wapColorSchemeId;
	}

	public String getCss() {
		return _css;
	}

	public void setCss(String css) {
		_css = css;
	}

	public int getPageCount() {
		return _pageCount;
	}

	public void setPageCount(int pageCount) {
		_pageCount = pageCount;
	}

	public String getVirtualHost() {
		return _virtualHost;
	}

	public void setVirtualHost(String virtualHost) {
		_virtualHost = virtualHost;
	}

	public String getSettings() {
		return _settings;
	}

	public void setSettings(String settings) {
		_settings = settings;
	}

	public long getLayoutSetPrototypeId() {
		return _layoutSetPrototypeId;
	}

	public void setLayoutSetPrototypeId(long layoutSetPrototypeId) {
		_layoutSetPrototypeId = layoutSetPrototypeId;
	}

	private long _layoutSetId;
	private long _groupId;
	private long _companyId;
	private boolean _privateLayout;
	private boolean _logo;
	private long _logoId;
	private String _themeId;
	private String _colorSchemeId;
	private String _wapThemeId;
	private String _wapColorSchemeId;
	private String _css;
	private int _pageCount;
	private String _virtualHost;
	private String _settings;
	private long _layoutSetPrototypeId;
}