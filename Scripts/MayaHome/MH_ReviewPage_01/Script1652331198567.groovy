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
Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)


if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy2/unaffordableStatement - Txt'), 0, FailureHandling.OPTIONAL)) {
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

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/successAppliedOkay - Btn'), 0)

    Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyApplicationCard(1) - Btn'), 0)
} 
else{
	Mobile.scrollToText('View Other Properties')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/requestForAssistance - Btn'), 0)

    Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 1/sendingMessagePropertyAgent - Txtfield'), 'Seek for financial advisor help', 
        0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/unitselectionconfirm - Btn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/gotIt - Btn'), 0)

    Mobile.delay(3)

    Mobile.swipe(500, 700, 500, 1700)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/closePropertyApplication - Btn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/saveProgress - Btn'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyApplicationCard(1) - Btn'), 0)
}

