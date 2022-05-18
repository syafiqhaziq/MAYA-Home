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

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/propertyName - Txt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

def propertyName = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 6/propertyName - Txt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/propertyPrice - Txt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

def propertyPrice = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 6/propertyPrice - Txt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/propertySize - Txt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

def propertySize = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 6/propertySize - Txt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/unitType - txt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

def unitType = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 6/unitType - txt'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 9/3dotsTopRightCorner - Btn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 9/sharePropertyLink - Btn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 9/bookmarkProperty - Btn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 9/bookmarkProperty - Btn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 9/gpsLocatorLink - Btn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Unit Types')

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/unitType - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/unitTypeVisualCard1 - Img'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('Check Eligibility')

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/developer - Header'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/developerNameCEscreen - Txt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

def developerName = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 6/developerNameCEscreen - Txt'), 0)

println('Property Name: ' + propertyName)

println('Property Price: ' + propertyPrice)

println('Property Size: ' + propertySize)

println('Unit Type: ' + unitType)

println('Developer Name' + developerName)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/checkeligibility - Btn'), 0)

