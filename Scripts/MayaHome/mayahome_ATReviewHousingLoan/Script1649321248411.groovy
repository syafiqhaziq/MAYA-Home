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
import groovy.json.internal.Exceptions as Exceptions
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as Keys

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

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/applicationStatusNo1 - Header'), 0, FailureHandling.OPTIONAL)

def statusUpdate2 = Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/applicationStatusNo2 - Header'), 
    0, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabPropertyFinanceAmount - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabPropertyFinanceAmount - Header'), 'Property financing amount', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(500, 1300, 500, 600)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabEffProfitRate - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabFinancePeriod - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabFinancePeriod - Header'), 'Financing period', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabMonthlyInstallment - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabMonthlyInstallment - Header'), 'Monthly instalment', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabPropertyPrice - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabPropertyPrice - Header'), 'Property price', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabDownpayment - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabDownpayment - Header'), 'Downpayment', FailureHandling.CONTINUE_ON_FAILURE)

if (statusUpdate2) {
    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabBankSellPrice - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabBankSellPrice - Header'), 'Bank’s selling price', 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.swipe(500, 1300, 500, 1100)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabSelectedHomeFinance - Header'), 0, 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabSelectedHomeFinance - Header'), 'Selected home financing', 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabFinancingType - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabFinancingType - Header'), 'Financing type', 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabFinanceProduct - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabFinanceProduct - Header'), 'Financing product', 
        FailureHandling.CONTINUE_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 2/applynow - Btn'), 0, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.swipe(500, 1300, 500, 600)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/applynow - Btn'), 0)

    Mobile.swipe(500, 2000, 500, 1250)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyName'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyName'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmountTxt'), 0, 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmountTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmount(RM)'), 0, 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmount(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRateTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRateTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRate(percent)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRate(percent)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - baseRate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - baseRate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - spread'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - spread'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriodTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriodTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriod(year)'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriod(year)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInsalmentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInsalmentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInstalment(RM)'), 0, 
        FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInstalment(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPriceTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPriceTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPrice(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPrice(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpaymentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpaymentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpayment(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpayment(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(500, 700, 500, 1700)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/closePropertyApplication - Btn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/closeSaveProgressBeforeLeaving - Btn'), 0)

    Mobile.scrollToText('Request assistance')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/applynow - Btn'), 0)

    Mobile.callTestCase(findTestCase('MayaHome/mayahome_AIPsubmission'), null)
} else {
    Mobile.swipe(500, 1300, 500, 600)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPriceContinue - Btn'), 0)

    Mobile.callTestCase(findTestCase('MayaHome/mayahome_AIPsubmission'), null)
}

