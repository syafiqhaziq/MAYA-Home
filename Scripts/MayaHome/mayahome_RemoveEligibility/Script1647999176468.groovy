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
import javassist.bytecode.stackmap.BasicBlock.Catch as Catch
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.appPathSIT, false)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/dashboard - more3dotsBtn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/home2u - Btn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 3000)

    Mobile.tap(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0)
} else {
}

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/applicationTab - Btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyApplicationCard(1) - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyApplicationCard(1) - Btn'), 0)

if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/header6DigitPin - Txt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 1'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 2'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 3'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 4'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 5'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 6'), 0)

    Mobile.delay(3)
} else {
}

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 6/propertyName - Txt'), 30)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appActiveGreen - Header'), 0)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 8/appActiveGreen - Header'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/3dots - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/cancelApplication - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/viewProperty - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/cancelApplication - Btn'), 0)

if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/enterPassword - Txt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 5/enterPassword - Txt'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
} else {
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/cancelApplication - Txt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/selectReason - dropdownBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/dropdownReason - Btn'), 0)

Mobile.scrollToText('Others')

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/changeOfMind - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/done - dropdownBtn'), 0)

Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 6/specifyReason - TxtField'), 'testing 1', 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/confirm - Btn'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 500, 500, 1000)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appInactiveGrey - Header'), 0)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 8/appInactiveGrey - Header'), 0)

