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

Mobile.startApplication(GlobalVariable.appPathUAT, false)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/dashboard - more3dotsBtn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)


Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/home2u - Btn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 3000)

    Mobile.tap(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0)
} else {
}

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/applicationTab - Btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//Mobile.swipe(500, 1600, 500, 1100)
//
//Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyApplicationCard(4) - Btn'), 0)
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

Mobile.scrollToText('Sales Representative', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/ContinueLoanDetails - Btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/enterPassword - Txt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 5/enterPassword - Txt'), GlobalVariable.Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/ContinuePassword - Btn'), 0)
} else {
}

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - PropertyName(Title)'), 
    0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - PropertyNameTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - UnitType(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - UnitTypeTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - PropertyPrice(Title)'), 
    0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - PropertyPriceTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - Downpayment(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - DownpaymentTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - LoanAmount(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - LoanAmountTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - LoanPeriod(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - LoanPeriodTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - ResidentStatus(Title)'), 
    0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - ResidentStatusTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - Education(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - EducationTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - EmpStatus(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - EmpStatusTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - BusinessType(Title)'), 
    0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - BusinessTypeTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - Income(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - IncomeTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - MaritalStatus(Title)'), 
    0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - MaritalStatusTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - Religion(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - ReligionTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - ExistingHL(Title)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/eligibilityDetails - ExistingHLTxt'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/ContinueLoanDetails - Btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 5/UnitNumber - Txt'), '22', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/SaveAndNext - Btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)
