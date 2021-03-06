/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.kaleo.mysubmissions.workflowtask.viewpaginationtaskmbmessage;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewPaginationTaskMBMessage20ItemsPerPageTest extends BaseTestCase {
	public void testViewPaginationTaskMBMessage20ItemsPerPage()
		throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("//div[@id='dockbar']",
			RuntimeVariables.replace("Dockbar"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=My Submissions",
			RuntimeVariables.replace("My Submissions"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("link=Pending");
		assertEquals(RuntimeVariables.replace("Pending"),
			selenium.getText("link=Pending"));
		selenium.clickAt("link=Pending", RuntimeVariables.replace("Pending"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Showing 1 - 20 of 21 results."),
			selenium.getText("//div[@class='search-results']"));
		assertEquals(RuntimeVariables.replace(
				"Items per Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='delta-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("5 10 20 30 50 75"),
			selenium.getText("//select[@name='_158_itemsPerPage']"));
		assertEquals(RuntimeVariables.replace(
				"Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='page-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("1 2"),
			selenium.getText("//select[@name='_158_page']"));
		assertEquals(RuntimeVariables.replace("First"),
			selenium.getText("//div[@class='page-links']/span[1]"));
		assertEquals(RuntimeVariables.replace("Previous"),
			selenium.getText("//div[@class='page-links']/span[2]"));
		assertEquals(RuntimeVariables.replace("Next"),
			selenium.getText("//div[@class='page-links']/a[1]"));
		assertEquals(RuntimeVariables.replace("Last"),
			selenium.getText("//div[@class='page-links']/a[2]"));
		selenium.select("//select[@name='_158_page']",
			RuntimeVariables.replace("label=2"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Showing 21 - 21 of 21 results."),
			selenium.getText("//div[@class='search-results']"));
		assertEquals(RuntimeVariables.replace(
				"Items per Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='delta-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("5 10 20 30 50 75"),
			selenium.getText("//select[@name='_158_itemsPerPage']"));
		assertEquals(RuntimeVariables.replace(
				"Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='page-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("1 2"),
			selenium.getText("//select[@name='_158_page']"));
		assertEquals(RuntimeVariables.replace("First"),
			selenium.getText("//div[@class='page-links']/a[1]"));
		assertEquals(RuntimeVariables.replace("Previous"),
			selenium.getText("//div[@class='page-links']/a[2]"));
		assertEquals(RuntimeVariables.replace("Next"),
			selenium.getText("//div[@class='page-links']/span[1]"));
		assertEquals(RuntimeVariables.replace("Last"),
			selenium.getText("//div[@class='page-links']/span[2]"));
		selenium.select("//select[@name='_158_page']",
			RuntimeVariables.replace("label=1"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Showing 1 - 20 of 21 results."),
			selenium.getText("//div[@class='search-results']"));
		assertEquals(RuntimeVariables.replace(
				"Items per Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='delta-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("5 10 20 30 50 75"),
			selenium.getText("//select[@name='_158_itemsPerPage']"));
		assertEquals(RuntimeVariables.replace(
				"Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='page-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("1 2"),
			selenium.getText("//select[@name='_158_page']"));
		assertEquals(RuntimeVariables.replace("First"),
			selenium.getText("//div[@class='page-links']/span[1]"));
		assertEquals(RuntimeVariables.replace("Previous"),
			selenium.getText("//div[@class='page-links']/span[2]"));
		assertEquals(RuntimeVariables.replace("Next"),
			selenium.getText("//div[@class='page-links']/a[1]"));
		assertEquals(RuntimeVariables.replace("Last"),
			selenium.getText("//div[@class='page-links']/a[2]"));
		selenium.clickAt("//div[@class='page-links']/a[1]",
			RuntimeVariables.replace("Next"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Showing 21 - 21 of 21 results."),
			selenium.getText("//div[@class='search-results']"));
		assertEquals(RuntimeVariables.replace(
				"Items per Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='delta-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("5 10 20 30 50 75"),
			selenium.getText("//select[@name='_158_itemsPerPage']"));
		assertEquals(RuntimeVariables.replace(
				"Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='page-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("1 2"),
			selenium.getText("//select[@name='_158_page']"));
		assertEquals(RuntimeVariables.replace("First"),
			selenium.getText("//div[@class='page-links']/a[1]"));
		assertEquals(RuntimeVariables.replace("Previous"),
			selenium.getText("//div[@class='page-links']/a[2]"));
		assertEquals(RuntimeVariables.replace("Next"),
			selenium.getText("//div[@class='page-links']/span[1]"));
		assertEquals(RuntimeVariables.replace("Last"),
			selenium.getText("//div[@class='page-links']/span[2]"));
		selenium.clickAt("//div[@class='page-links']/a[2]",
			RuntimeVariables.replace("Previous"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Showing 1 - 20 of 21 results."),
			selenium.getText("//div[@class='search-results']"));
		assertEquals(RuntimeVariables.replace(
				"Items per Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='delta-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("5 10 20 30 50 75"),
			selenium.getText("//select[@name='_158_itemsPerPage']"));
		assertEquals(RuntimeVariables.replace(
				"Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='page-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("1 2"),
			selenium.getText("//select[@name='_158_page']"));
		assertEquals(RuntimeVariables.replace("First"),
			selenium.getText("//div[@class='page-links']/span[1]"));
		assertEquals(RuntimeVariables.replace("Previous"),
			selenium.getText("//div[@class='page-links']/span[2]"));
		assertEquals(RuntimeVariables.replace("Next"),
			selenium.getText("//div[@class='page-links']/a[1]"));
		assertEquals(RuntimeVariables.replace("Last"),
			selenium.getText("//div[@class='page-links']/a[2]"));
		selenium.clickAt("//div[@class='page-links']/a[2]",
			RuntimeVariables.replace("Last"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Showing 21 - 21 of 21 results."),
			selenium.getText("//div[@class='search-results']"));
		assertEquals(RuntimeVariables.replace(
				"Items per Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='delta-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("5 10 20 30 50 75"),
			selenium.getText("//select[@name='_158_itemsPerPage']"));
		assertEquals(RuntimeVariables.replace(
				"Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='page-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("1 2"),
			selenium.getText("//select[@name='_158_page']"));
		assertEquals(RuntimeVariables.replace("First"),
			selenium.getText("//div[@class='page-links']/a[1]"));
		assertEquals(RuntimeVariables.replace("Previous"),
			selenium.getText("//div[@class='page-links']/a[2]"));
		assertEquals(RuntimeVariables.replace("Next"),
			selenium.getText("//div[@class='page-links']/span[1]"));
		assertEquals(RuntimeVariables.replace("Last"),
			selenium.getText("//div[@class='page-links']/span[2]"));
		selenium.clickAt("//div[@class='page-links']/a[1]",
			RuntimeVariables.replace("First"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Showing 1 - 20 of 21 results."),
			selenium.getText("//div[@class='search-results']"));
		assertEquals(RuntimeVariables.replace(
				"Items per Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='delta-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("5 10 20 30 50 75"),
			selenium.getText("//select[@name='_158_itemsPerPage']"));
		assertEquals(RuntimeVariables.replace(
				"Page (Changing the value of this field will reload the page.)"),
			selenium.getText("//div[@class='page-selector']/span/span/label"));
		assertEquals(RuntimeVariables.replace("1 2"),
			selenium.getText("//select[@name='_158_page']"));
		assertEquals(RuntimeVariables.replace("First"),
			selenium.getText("//div[@class='page-links']/span[1]"));
		assertEquals(RuntimeVariables.replace("Previous"),
			selenium.getText("//div[@class='page-links']/span[2]"));
		assertEquals(RuntimeVariables.replace("Next"),
			selenium.getText("//div[@class='page-links']/a[1]"));
		assertEquals(RuntimeVariables.replace("Last"),
			selenium.getText("//div[@class='page-links']/a[2]"));
	}
}