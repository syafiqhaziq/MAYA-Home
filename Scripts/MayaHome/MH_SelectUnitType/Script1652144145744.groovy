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

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 2/headerPropertyName(UnitType) - Txt'), 5)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/unittypelayoutcard - Btn0'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/unittypelayoutcard - Btn0'), 0)

Mobile.swipe(800, 1000, 800, 700)

for (int i = 0; i < unit; i++) {
    Mobile.swipe(900, 1000, 450, 1000)

    Mobile.delay(1)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/UTpropertyName - Txt'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/UTpropertyLayout - Img'), 0)

    Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/UTpropertyPrice - Txt'), 0)

    if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/unitTypeLayoutCard - Btn', [('index') : unit]), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/unitTypeLayoutCard - Btn', [('index') : unit]), 0)

        unit += 1
    }
}

Mobile.swipe(200, 1000, 1800, 1000)

Mobile.swipe(200, 1000, 1800, 1000)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/unittypelayoutcard - Btn0'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/unitselectionconfirm - Btn'), 0)

