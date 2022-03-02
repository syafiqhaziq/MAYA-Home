package com.my.keywords.android
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TAC {
	@Keyword


	def  void otpvalidation(String OTP) {
		i
		for (def i = 16; i <= 21; i++) {
			if ((OTP[i]) == '0') {
				Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
			}

			if ((OTP[i]) == '1') {
				Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
			}

			if ((OTP[i]) == '2') {
				Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
			}

			if ((OTP[i]) == '3') {
				Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
			}

			if ((OTP[i]) == '4') {
				Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
			}

			if ((OTP[i]) == '5') {
				Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
			}

			if ((OTP[i]) == '6') {
				Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
			}

			if ((OTP[i]) == '7') {
				Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
			}

			if ((OTP[i]) == '8') {
				Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
			}

			if ((OTP[i]) == '9') {
				Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
			}
		}
	}
}
