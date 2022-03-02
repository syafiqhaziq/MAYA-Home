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
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/monthlyIncome - Txtfield'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 4'), 1)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 1)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 1)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 1)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 1)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 1)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - check'), 1)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/existingHousingLoan - dropdownBtn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/existingHousingLoan(1) - Btn'), 0)

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusInfoDropDown - doneBtn'), 0)

    //    if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 3/housingLoanEditField - Txt'), 0, FailureHandling.OPTIONAL)) {
    //		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/housingLoanEditField - Txt'), 0)
    //		
    //		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/pinMonthlyIncome - 8'), 0)
    //		
    //			Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)
    //		
    //			Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)
    //		
    //			Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)
    //		
    //			Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)
    //		
    //			Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - check'), 0)
    //	}else {
    //		
    //	}
    Mobile.delay(3)

    if (Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 3/personalLoanDropDown - header'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/personalLoanDropDown - Btn'), 0)
		Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 3/creditcardDropDown - header'), 0, FailureHandling.OPTIONAL)
		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/ccDropDown - Btn'), 0)
		Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 3/carLoanDropDown - header'), 0, FailureHandling.OPTIONAL)
		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/clDropDown - Btn'), 0)
		Mobile.swipe(500, 1600, 500, 1000)
		Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 3/odDropDown - header'), 0, FailureHandling.OPTIONAL)
		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/odDropDown - Btn'), 0)
		Mobile.verifyElementExist(findTestObject('MayaHome/mayahome - MobileSpy 3/nonbankcommitDropDown - Btn'), 0, FailureHandling.OPTIONAL)
		Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 3/nonbankcommitDropDown - Btn'), 0)
        Mobile.swipe(500, 1600, 500, 1000)
    } else {
        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/non-bankCommit - Txtfield'), 1)

        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 2'), 1)

        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)

        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)

        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)

        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - 0'), 0)

        Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinMonthlyIncome - check'), 0)
    }
    
    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/statusinfo - savenextBtn'), 0)

    Mobile.delay(10)
}
catch (Exception e) {
    if (GlobalVariable.isApplicationOpened == false) {
        Mobile.callTestCase(findTestCase('MayaHome/mayahome_checkEligibilityMonthlyIncome'), null)
    }
} 

