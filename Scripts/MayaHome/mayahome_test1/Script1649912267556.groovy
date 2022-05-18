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
import org.testng.IMethodInterceptor as Keys

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.CONTINUE_ON_FAILURE)

'Selecting Title'
if (Mobile.verifyElementText(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoTitle - Please Select Txt'), 'Please Select', 
    FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionTitle - dropdownBtn'), 0)

    Mobile.scrollToText('Tuan')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)
} else {
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfoOptionTitle - dropdownBtn'), 0)

    Mobile.scrollToText('Tuan')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 4/blankScreen - PersonalDetail'), 0)
}

