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

//Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.OPTIONAL)
//    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//    
//    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
'Enter Pin Number MAE'
if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 2/header6DigitPin - Txt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 1'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 2'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 3'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 4'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 5'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinlogin - 6'), 0)

    Mobile.delay(3)
}

'Handling Age Alert (18-65 years old only)'
if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/ageAlertPopup - Txt'), 0, FailureHandling.OPTIONAL)) {
    actualAgeAlert = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 1/ageAlertPopup - Txt'), 0)

    Mobile.verifyMatch(actualAgeAlert, 'We\'re sorry, the age limit to perform eligibility check is between 18 to 65 years old.', 
        false)
}

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/checkEligibility - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/checkEligibilityAgreement - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/checkEligibilityAgreement - Txt'), 0)

uncheck = Mobile.verifyElementNotChecked(findTestObject('MayaHome/mayahome - MobileSpy 1/termagreement - tickBtn'), 0)

if (uncheck == true) {
    Mobile.checkElement(findTestObject('MayaHome/mayahome - MobileSpy 1/termagreement - tickBtn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/confirm - Btn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/confirm - Btn'), 0)
}

