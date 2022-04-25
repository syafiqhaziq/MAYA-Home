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

Mobile.startApplication(GlobalVariable.appPathSIT, false)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/dashboard - more3dotsBtn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/home2u - Btn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 3000)

    Mobile.tap(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0)
} else {
}

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/filteringIcon - Btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/location1 - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('mayahomeCredentials').getValue(6, 3))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), findTestData('mayahomeCredentials').getValue(
        6, 3), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/location2 - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('mayahomeCredentials').getValue(7, 3))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location2Dropdown - list'), findTestData('mayahomeCredentials').getValue(
        7, 3), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/confirm - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/minPrice - DropdownBtn'), 0)

def minPrice = Mobile.concatenate((('RM ' + findTestData('mayahomeCredentials').getValue(8, 3)) as String))

Mobile.scrollToText(minPrice)

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), minPrice, 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/maxPrice - DropdownBtn'), 0)

def maxPrice = Mobile.concatenate((('RM ' + findTestData('mayahomeCredentials').getValue(9, 3)) as String))

Mobile.scrollToText(maxPrice)

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), maxPrice, 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.scrollToText('Developers')

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/minSize - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('mayahomeCredentials').getValue(10, 3))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), findTestData('mayahomeCredentials').getValue(
        10, 3), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/maxSize - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('mayahomeCredentials').getValue(11, 3))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), findTestData('mayahomeCredentials').getValue(
        11, 3), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/developerName - DropdownBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/searchIcon - Btn'), 0)

Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 6/developerName - Txt'), 'Berjaya', 0)

Mobile.hideKeyboard()

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location2Dropdown - list'), findTestData('mayahomeCredentials').getValue(
        12, 3), 0)

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location2Dropdown - list'), findTestData('mayahomeCredentials').getValue(
        12, 3), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/confirm - Btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 500)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/applyFilters - Btn'), 0)

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 6/resultFound - Header'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

