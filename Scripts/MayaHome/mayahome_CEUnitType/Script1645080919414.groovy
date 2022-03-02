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
    Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 2/headerPropertyName(UnitType) - Txt'), 5)

    //    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
    //
    //    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 2/unittypeCornerLot - Frame'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/unitselectionconfirm - Btn'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    if (GlobalVariable.isApplicationOpened == false) {
        Mobile.callTestCase(findTestCase('MayaHome/mayahome_checkEligibilityUnitType'), null)
    }
} 

