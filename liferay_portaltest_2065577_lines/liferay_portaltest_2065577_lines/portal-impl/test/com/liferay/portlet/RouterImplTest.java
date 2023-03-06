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

package com.liferay.portlet;

import com.liferay.portal.kernel.portlet.Route;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.util.BaseTestCase;
import com.liferay.portal.util.InitUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Connor McKay
 * @author Brian Wing Shun Chan
 */
public class RouterImplTest extends BaseTestCase {

	public RouterImplTest() {
		InitUtil.initWithSpring();
	}

	public void setUp() {
		_routerImpl = new RouterImpl();

		Route route = _routerImpl.addRoute("instance/{instanceId}/{topLink}");

		route.addGeneratedParameter("p_p_id", "15_INSTANCE_{instanceId}");

		route = _routerImpl.addRoute("GET/{controller}");

		route.addImplicitParameter("action", "index");
		route.addImplicitParameter("format", "html");
		route.addImplicitParameter("method", "GET");

		route = _routerImpl.addRoute("GET/{controller}.{format}");

		route.addImplicitParameter("action", "index");
		route.addImplicitParameter("method", "GET");

		route = _routerImpl.addRoute("POST/{controller}");

		route.addImplicitParameter("action", "create");
		route.addImplicitParameter("format", "html");
		route.addImplicitParameter("method", "POST");

		route = _routerImpl.addRoute("POST/{controller}.{format}");

		route.addImplicitParameter("action", "create");
		route.addImplicitParameter("method", "POST");

		route = _routerImpl.addRoute("GET/{controller}/{id:\\d+}");

		route.addImplicitParameter("action", "view");
		route.addImplicitParameter("format", "html");
		route.addImplicitParameter("method", "GET");

		route = _routerImpl.addRoute("GET/{controller}/{id:\\d+}.{format}");

		route.addImplicitParameter("action", "view");
		route.addImplicitParameter("method", "GET");

		route = _routerImpl.addRoute("POST/{controller}/{id:\\d+}");

		route.addImplicitParameter("action", "update");
		route.addImplicitParameter("format", "html");
		route.addImplicitParameter("method", "POST");

		route = _routerImpl.addRoute("POST/{controller}/{id:\\d+}.{format}");

		route.addImplicitParameter("action", "update");
		route.addImplicitParameter("method", "POST");

		route = _routerImpl.addRoute(
			"{method}/{controller}/{id:\\d+}/{action}");

		route.addImplicitParameter("format", "html");

		route = _routerImpl.addRoute(
			"{method}/{controller}/{id:\\d+}/{action}.{format}");

		route = _routerImpl.addRoute("{method}/{controller}/{action}");

		route.addImplicitParameter("format", "html");

		route = _routerImpl.addRoute("{method}/{controller}/{action}.{format}");
	}

	public void testGeneratedParameters() {
		assertUrlGeneratesParameters(
			"instance/1b7c/recent",
			"p_p_id=15_INSTANCE_1b7c&topLink=recent");
		assertUrlRegenerates("instance/1b7c/recent");
	}

	public void testPriority() {
		assertUrlRegeneratesUrl("GET/boxes/index", "GET/boxes");
	}

	public void testReproduction() {
		assertUrlRegenerates("GET/boxes/16");
		assertUrlRegenerates("GET/boxes/25.xml");
		assertUrlRegenerates("POST/boxes/8");
		assertUrlRegenerates("POST/boxes/34.xml");
		assertUrlRegenerates("GET/boxes/new");
		assertUrlRegenerates("GET/boxes/8/export");
		assertUrlRegenerates("GET/boxes");
		assertUrlRegenerates("GET/boxes.xml");
		assertUrlRegenerates("POST/boxes");
		assertUrlRegenerates("POST/boxes.xml");
	}

	public void testUrlDecoding() {
		assertParameterInUrlEquals(
			"controller", "open boxes", "POST/open%20boxes");
	}

	public void testUrlToParameters() {
		assertUrlGeneratesParameters(
			"GET/boxes/16",
			"id=16&action=view&method=GET&format=html&controller=boxes");
		assertUrlGeneratesParameters(
			"GET/boxes/25.xml",
			"id=25&action=view&method=GET&controller=boxes&format=xml");
		assertUrlGeneratesParameters(
			"POST/boxes/8",
			"id=8&action=update&method=POST&format=html&controller=boxes");
		assertUrlGeneratesParameters(
			"POST/boxes/34.xml",
			"id=34&action=update&method=POST&controller=boxes&format=xml");
		assertUrlGeneratesParameters(
			"GET/boxes/new",
			"action=new&method=GET&format=html&controller=boxes");
		assertUrlGeneratesParameters(
			"GET/boxes/8/export",
			"id=8&action=export&method=GET&format=html&controller=boxes");
		assertUrlGeneratesParameters(
			"GET/boxes",
			"action=index&method=GET&format=html&controller=boxes");
		assertUrlGeneratesParameters(
			"GET/boxes.xml",
			"action=index&method=GET&controller=boxes&format=xml");
		assertUrlGeneratesParameters(
			"POST/boxes",
			"action=create&method=POST&format=html&controller=boxes");
		assertUrlGeneratesParameters(
			"POST/boxes.xml",
			"action=create&method=POST&controller=boxes&format=xml");
	}

	protected void assertParameterInUrlEquals(
		String name, String value, String url) {

		Map<String, String> parameters = new HashMap<String, String>();

		_routerImpl.urlToParameters(url, parameters);

		assertEquals(value, MapUtil.getString(parameters, name));
	}

	protected void assertUrlGeneratesParameters(
		String url, String queryString) {

		Map<String, String[]> parameters = HttpUtil.parameterMapFromString(
			queryString);

		Map<String, String> generatedParameters = new HashMap<String, String>();

		_routerImpl.urlToParameters(url, generatedParameters);

		assertEquals(parameters, generatedParameters);
	}

	protected void assertUrlRegenerates(String url) {
		assertUrlRegeneratesUrl(url, url);
	}

	protected void assertUrlRegeneratesUrl(String url, String expectedUrl) {
		Map<String, String> parameters = new HashMap<String, String>();

		_routerImpl.urlToParameters(url, parameters);

		String generatedUrl = _routerImpl.parametersToUrl(parameters);

		assertEquals(expectedUrl, generatedUrl);
	}

	private RouterImpl _routerImpl;

}