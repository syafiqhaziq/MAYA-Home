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

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPrice - Txtfield'), 0)

'Change row on test data for different Property Price'
def propertypriceEnter = findTestData('propertyDetails').getValue(4, 1)

for (int i = 0; i <= 7; i++) {
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

for (int i = 0; i < 2; i++) {
    switch (i) {
        case '1':
            Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/downpaymentEnter - Txtfield'), 0)

            Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

            Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinPropertyPrice - check'), 0)

            Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPriceContinue - Btn'), 0)

            Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 1/howLongLoanPeriod - Txt'), 0)

            Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/backArrowMAE - Btn'), 0)
        case '2':
            Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/downpaymentAmount - Btn'), 0)

            Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/downpaymentEnter - Txtfield'), 0)

            'Change row on test data for different Downpayment Price'
            def downpaymentEnter = findTestData('propertyDetails').getValue(5, 1)

            for (def a = 0; a <= 6; a++) {
                if ((downpaymentEnter[a]) == '0') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
                }
                
                if ((downpaymentEnter[a]) == '1') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
                }
                
                if ((downpaymentEnter[a]) == '2') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
                }
                
                if ((downpaymentEnter[a]) == '3') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
                }
                
                if ((downpaymentEnter[a]) == '4') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
                }
                
                if ((downpaymentEnter[a]) == '5') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
                }
                
                if ((downpaymentEnter[a]) == '6') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
                }
                
                if ((downpaymentEnter[a]) == '7') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
                }
                
                if ((downpaymentEnter[a]) == '8') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
                }
                
                if ((downpaymentEnter[a]) == '9') {
                    Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
                }
            }
            
            Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/pinPropertyPrice - check'), 0)

            break
    }
}

GlobalVariable.propertyPrice = ('RM ' + Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/propertyPrice - Txt'), 
    0))

GlobalVariable.downpaymentPrice = ('RM ' + Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/downpaymentAmount - Txt'), 
    0))

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPriceContinue - Btn'), 0)

Mobile.delay(5)

GlobalVariable.loanAmount = Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 5/financingPeriod - Header'), 
    0)

GlobalVariable.loanAmount = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/agreedLoanAmount - Txt'), 0)

GlobalVariable.loanPeriod = Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 2/agreedLoanPeriod - Txt'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/propertyPriceContinue - Btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

