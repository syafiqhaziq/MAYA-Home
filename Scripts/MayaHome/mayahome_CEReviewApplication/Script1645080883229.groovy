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

try {
    //Mobile.startApplication(GlobalVariable.appPathSIT, false)
    //Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)
    //    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
    //
    //    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPrice - Txtfield'), 0)

    'Change row on test data for different Property Price'
    def propertypriceEnter = findTestData('mayahomeCredentials').getValue(3, 2)

    for (def i = 0; i <= 7; i++) {
        if ((propertypriceEnter[i]) == '0') {
            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
        }
        
        if ((propertypriceEnter[i]) == '1') {
            Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
        }
        
        if ((propertypriceEnter[i]) == '2') {
            Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
        }
        
        if ((propertypriceEnter[i]) == '3') {
            Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
        }
        
        if ((propertypriceEnter[i]) == '4') {
            Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
        }
        
        if ((propertypriceEnter[i]) == '5') {
            Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
        }
        
        if ((propertypriceEnter[i]) == '6') {
            Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
        }
        
        if ((propertypriceEnter[i]) == '7') {
            Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
        }
        
        if ((propertypriceEnter[i]) == '8') {
            Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
        }
        
        if ((propertypriceEnter[i]) == '9') {
            Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
        }
    }
    
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinPropertyPrice - check'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/downpaymentAmount - Btn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/downpaymentEnter - Txtfield'), 0)

    //Downpayment test data from excel file
    'Change row on test data for different Downpayment Price'
    def downpaymentEnter = findTestData('mayahomeCredentials').getValue(4, 2)

    for (def i = 0; i <= 6; i++) {
        if ((downpaymentEnter[i]) == '0') {
            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
        }
        
        if ((downpaymentEnter[i]) == '1') {
            Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
        }
        
        if ((downpaymentEnter[i]) == '2') {
            Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
        }
        
        if ((downpaymentEnter[i]) == '3') {
            Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
        }
        
        if ((downpaymentEnter[i]) == '4') {
            Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
        }
        
        if ((downpaymentEnter[i]) == '5') {
            Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
        }
        
        if ((downpaymentEnter[i]) == '6') {
            Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
        }
        
        if ((downpaymentEnter[i]) == '7') {
            Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
        }
        
        if ((downpaymentEnter[i]) == '8') {
            Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
        }
        
        if ((downpaymentEnter[i]) == '9') {
            Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
        }
    }
    
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinPropertyPrice - check'), 0)

    def propertyPrice = 'RM ' + Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyPrice - Txt'), 0)

    def downpaymentPrice = 'RM ' + Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/downpaymentAmount - Txt'), 
        0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPriceContinue - Btn'), 0)

    Mobile.delay(5)

    def loanAmount = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/agreedLoanAmount - Txt'), 0)

    def loanPeriod = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/agreedLoanPeriod - Txt'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPriceContinue - Btn'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    //Call Test Case Status Info 
    Mobile.callTestCase(findTestCase('MayaHome/mayahome_CEPersonalDetail'), null)

    //Call Test Case Monthly Income
    Mobile.callTestCase(findTestCase('MayaHome/mayahome_CEMonthlyIncome'), null)

    //Call Test Case HLPendingApplicant
    if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/hederAdditionalInfo - Txt'), 0, FailureHandling.OPTIONAL)) {
        Mobile.callTestCase(findTestCase('MayaHome/mayahome_CEPendingApplicant'), null)
    } else {
    }
    
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 2/successStatement - Txt'), 0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(500, 2000, 500, 1400)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyName'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyName'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmountTxt'), 
            0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmountTxt'), 0)

        Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmount(RM)'), loanAmount, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmount(RM)'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRateTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRateTxt'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRate(percent)'), 0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRate(percent)'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - baseRate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - baseRate'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - spread'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - spread'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriodTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriodTxt'), 0)

        Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriod(year)'), loanPeriod, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriod(year)'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInsalmentTxt'), 0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInsalmentTxt'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInstalment(RM)'), 
            0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInstalment(RM)'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPriceTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPriceTxt'), 0)

        Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPrice(RM)'), propertyPrice, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPrice(RM)'), 0)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpaymentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpaymentTxt'), 0)

        Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpayment(RM)'), downpaymentPrice, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpayment(RM)'), 0)
    } else if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy2/unaffordableStatement - Txt'), 0, 
        FailureHandling.OPTIONAL)) {
        Mobile.swipe(500, 2000, 500, 1250)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyName'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyName'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmountTxt'), 
            0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmountTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmount(RM)'), 
            0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyLoanAmount(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRateTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRateTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRate(percent)'), 0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - effIntRate(percent)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - baseRate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - baseRate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - spread'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - spread'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriodTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriodTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriod(year)'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - loanPeriod(year)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInsalmentTxt'), 0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInsalmentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInstalment(RM)'), 
            0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - monthlyInstalment(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPriceTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPriceTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPrice(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - propertyPrice(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpaymentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpaymentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpayment(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy4/reviewApp - downpayment(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
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
    }
    
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(500, 700, 500, 1700)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/closePropertyApplication - Btn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/closeSaveProgressBeforeLeaving - Btn'), 0)

    Mobile.scrollToText('Request assistance')

    //		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/applynow - Btn'), 0)
    //
    //		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/successAppliedOkay - Btn'), 0)
    Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyApplicationCard(1) - Btn'), 0)
}
catch (Exception e) {
    if (GlobalVariable.isApplicationOpened == false) {
        Mobile.callTestCase(findTestCase('MayaHome/mayahome_checkEligibilityReviewApplication'), null)
    }
} 

