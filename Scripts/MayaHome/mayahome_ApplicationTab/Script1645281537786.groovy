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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as Keys

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/dashboard - more3dotsBtn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

Mobile.swipe(800, 700, 200, 700, FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - status'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - propertyName'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - applicationDateTime'), 0)

if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/getintouchsoon - Txt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(500, 1800, 500, 1100)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanAmountTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanAmount(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - effIntRateTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - effIntRate(percent)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - baseRate'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - spread'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanPeriodTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanPeriod(years)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - monthlyInsTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - monthlyIns(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - propertyPriceTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - propertyPrice(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - downpaymentTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - downpayment(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - bankSellPriceTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - bankSellPrice(RM)'), 0)
} else {
    Mobile.swipe(500, 1800, 500, 1080)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanAmountTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanAmount(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - effIntRateTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - effIntRate(percent)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - baseRate'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - spread'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanPeriodTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - loanPeriod(years)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - monthlyInsTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - monthlyIns(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - propertyPriceTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - propertyPrice(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - downpaymentTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - downpayment(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - bankSellPriceTxt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - bankSellPrice(RM)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - Selected home financing'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - financingType'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - financingType(option)'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - financingProduct'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/appTab - financingProduct(option)'), 0)
}

