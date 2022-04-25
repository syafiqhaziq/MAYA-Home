import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startApplication(GlobalVariable.appPathSIT, false)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/dashboard - more3dotsBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/home2u - Btn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 3000)

    Mobile.tap(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0)
} else {
}

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/applyMortgage - Btn'), 0)

if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/header6DigitPin - Txt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 1'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 2'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 3'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 4'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 5'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 6'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/termagreement - tickBtn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/confirm - Btn'), 0)

    Mobile.delay(3)
} else {
}

//Call Test Case CEAgentPropertyData
Mobile.callTestCase(findTestCase('MayaHome/mayahome_CEAgentPropertyData'), null)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/step2of7 - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/applyMortgage - Txt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyName - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/enterAddressManually - Btn'), 0)

Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 1/propertynameTxt'), findTestData('mayahomeCredentials').getValue(
        3, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/saveandnextBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/step3of7 - Header'), 0)

Mobile.scrollToText('Select property')

if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyimageBtn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyimageBtn'), 0)

    Mobile.scrollToText('Select property', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/selectPropertyImageCard - Btn'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/selectProperty - Btn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/selectProperty - Btn'), 0)
}

//Call Test Case CEUnitType
Mobile.callTestCase(findTestCase('MayaHome/mayahome_CEUnitType'), null)

//Call Test Case CEReviewApplication
Mobile.callTestCase(findTestCase('MayaHome/mayahome_CEReviewApplication'), null)

Mobile.delay(3)

