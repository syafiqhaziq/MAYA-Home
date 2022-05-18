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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

//Mobile.startExistingApplication('com.maybank2u.life.sit')
//@Keyword
//public static void EnablePermission(boolean isEnable) {
//	DesiredCapabilities.android().setCapability("autoGrantPermissions", isEnable);
//}
Mobile.startApplication(GlobalVariable.appPathSIT, false)

//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
//Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 03)
if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 3000)

    Mobile.tap(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0)

    Mobile.tap(findTestObject('Login Onboarding/onboardTNCAgreeBtn'), 0)
} else {
}

Mobile.tap(findTestObject('Dashboard/dashboardSetUpWalletIcon'), 0)

Mobile.tap(findTestObject('Login Onboarding/getStartedExistingUserBtn'), 0)

Mobile.setText(findTestObject('Login Onboarding/loginExistingUsernameInputField'), findTestData('loginCredentials').getValue(
        1, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Login Onboarding/loginExistingMineConfirmationBtn'), 50)

Mobile.tap(findTestObject('Login Onboarding/loginExistingMineConfirmationBtn'), 0)

Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), findTestData('loginCredentials').getValue(2, 
        1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/ManageDevices - Header'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/ManageDevicesProceed - Btn'), 0)
} else {
}

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/Proceed'), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/Proceed'), 5)
} else {
}

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN2'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN3'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN5'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN6'), 1)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

Mobile.delay(2)

//Mobile.waitForElementPresent(findTestObject('Dashboard/dashboardSetUpWalletIcon'), 50)
Mobile.tap(findTestObject('Login Onboarding/PIN1'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN2'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN3'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN5'), 1)

Mobile.tap(findTestObject('Login Onboarding/PIN6'), 1)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/loginTouchIDSetUpLaterBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginVerifyNumberYesProceedBtn'), 0)

def OTP = Mobile.getText(findTestObject('Login Onboarding/secureGetOTPTxt'), 0)

for (def i = 16; i <= 21; i++) {
    if ((OTP[i]) == '0') {
        Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
    }
    
    if ((OTP[i]) == '1') {
        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
    }
    
    if ((OTP[i]) == '2') {
        Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
    }
    
    if ((OTP[i]) == '3') {
        Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
    }
    
    if ((OTP[i]) == '4') {
        Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
    }
    
    if ((OTP[i]) == '5') {
        Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
    }
    
    if ((OTP[i]) == '6') {
        Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
    }
    
    if ((OTP[i]) == '7') {
        Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
    }
    
    if ((OTP[i]) == '8') {
        Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
    }
    
    if ((OTP[i]) == '9') {
        Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
    }
}

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/TickOTP'), 0)

Mobile.tap(findTestObject('Login Onboarding/onboardNameInputField'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Login Onboarding/onboardNameInputField'), findTestData('loginCredentials').getValue(3, 1), 
    0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(2)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

//List<WebElement> elements =driver.findElementsByXPath('Object Repository/OnboardingObjects/ListofElements')
//println('The size of elements is ::' + elements.size())
//for(int i = 0; i < elements.size(); i++) 
//	{
//	if(elements.get(i).size() > 0) {
//		elements.get(i).click()
//	}
//}
Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/choosingwallet - currentaccountBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/choosingwallet - continueBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/friendreferral - skipBtn'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 1/loginsuccessful - doneBtn'), 0)

Mobile.delay(5)

