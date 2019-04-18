package com.kms.katalon.keyword.saucelabs

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.CustomProfile
import com.kms.katalon.core.keyword.IActionProvider
import com.kms.katalon.core.keyword.IPluginEventHandler
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.setting.BundleSettingStore
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class SauceLabsEventHandler implements IPluginEventHandler {

	void handle(IActionProvider actionProvider, BundleSettingStore store) {
		CustomProfile profile = new CustomProfile();

		def customCapabilities = [:];
		customCapabilities['username'] = store.getString("username", "");
		customCapabilities['accessKey'] = store.getString("accessKey", "");
		customCapabilities['browserName'] = store.getString("browserName", "");
		customCapabilities['platform'] = store.getString("platform", "");
		customCapabilities['version'] = store.getString("version", "");
		customCapabilities['name'] = store.getString("name", "");
		customCapabilities['remoteWebDriverType'] = 'Selenium';
		customCapabilities['remoteWebDriverUrl'] = 'http://ondemand.saucelabs.com:80/wd/hub';

		profile.setName("Sauce Labs");
		profile.setDriverType("Remote");
		profile.setDesiredCapabilities(customCapabilities);

		actionProvider.saveCustomProfile(profile);
	}
}
