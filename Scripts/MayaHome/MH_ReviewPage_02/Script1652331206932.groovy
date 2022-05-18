import groovy.swing.impl.DefaultAction as DefaultAction
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.BreakIterator as BreakIterator
import javax.persistence.criteria.CriteriaBuilder.Case as Case
import com.fasterxml.jackson.databind.PropertyName as PropertyName
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import ch.qos.logback.core.joran.conditional.ElseAction as ElseAction
import internal.GlobalVariable as GlobalVariable
import javassist.bytecode.stackmap.BasicBlock.Catch as Catch
import org.openqa.selenium.Keys as Keys

//Mobile.startApplication(GlobalVariable.appPathSIT, false)
//Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)
//    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 2/successStatement - Txt'), 0, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/viewOfferCondition - Btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/viewOfferCondition - Btn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/offerCondPopupWindow - Img'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/offerCondition - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 5/closeOfferCondition - Btn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 2000, 500, 1350)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyName'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyName'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmountTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmountTxt'), 0)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmount(RM)'), GlobalVariable.loanAmount, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmount(RM)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRateTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRateTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRate(percent)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRate(percent)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - baseRate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - baseRate'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - spread'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - spread'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriodTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriodTxt'), 0)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriod(year)'), GlobalVariable.loanPeriod, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriod(year)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInsalmentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInsalmentTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInstalment(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInstalment(RM)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPriceTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPriceTxt'), 0)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPrice(RM)'), GlobalVariable.propertyPrice, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPrice(RM)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpaymentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpaymentTxt'), 0)

Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpayment(RM)'), GlobalVariable.downpaymentPrice, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpayment(RM)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 700, 500, 1700)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/closePropertyApplication - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/closeSaveProgressBeforeLeaving - Btn'), 0)

Mobile.scrollToText('Request assistance')

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/applynow - Btn'), 0)

if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 2/successAppliedOkay - Btn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/successAppliedOkay - Btn'), 0)

    Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyApplicationCard(1) - Btn'), 0)
} else {
    Mobile.hideKeyboard()

    Mobile.callTestCase(findTestCase('MayaHome/mayahome_AIPsubmission'), null)
}

