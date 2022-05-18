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

//    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoPersonalDetails - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoTitle - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoEducation - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoMaritalStatus - Header'), 0)

'Selecting Title'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionTitle - dropdownBtn'), 'Please Select', 
    FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionTitle - dropdownBtn'), 0)

    Mobile.scrollToText('Tuan')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionTitle - dropdownBtn'), 0)

    Mobile.scrollToText('Tuan')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

'Selecting Resident Status'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionResident - dropdownBtn'), 'Please Select', 
    FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionResident - dropdownBtn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoResidentOption - Bumiputera'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionResident - dropdownBtn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

'Selecting Education Status'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionEducation - dropdownBtn'), 
    'Please Select', FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionEducation - dropdownBtn'), 0)

    Mobile.scrollToText('Professional Qualification', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoEducationOption - Pro Qualify'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionEducation - dropdownBtn'), 0)

    Mobile.scrollToText('Professional Qualification', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

Mobile.scrollToText('Employment status')

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoReligion - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoEmpStatus - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoEmpBussType - Header'), 0)

'Selecting Marital Status'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionMarital - dropdownBtn'), 'Please Select', 
    FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionMarital - dropdownBtn'), 0)

    Mobile.scrollToText('Single', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoMaritalStatus - Married'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionMarital - dropdownBtn'), 0)

    Mobile.scrollToText('Single', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

'Selecting Religion Status'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionReligion - dropdownBtn'), 'Please Select', 
    FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionReligion - dropdownBtn'), 0)

    Mobile.scrollToText('Others', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoReligion - Hinduism'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionReligion - dropdownBtn'), 0)

    Mobile.scrollToText('Others', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

'Selecting Employment Status'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionEmpStatus - dropdownBtn'), 
    'Please Select', FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionEmpStatus - dropdownBtn'), 0)

    Mobile.scrollToText('Unemployed', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionEmpStatus - dropdownBtn'), 0)

    Mobile.scrollToText('Unemployed', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

'Selecting Business Class'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoBusinessClass - dropdownBtn'), 'Please Select', 
    FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoBusinessClass - dropdownBtn'), 0)

    Mobile.scrollToText('Sdn Bhd')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoOption - SdnBhd'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoBusinessClass - dropdownBtn'), 0)

    Mobile.scrollToText('Sdn Bhd')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/save next - Btn'), 0)

