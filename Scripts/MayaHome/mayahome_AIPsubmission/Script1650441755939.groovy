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

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/enterYourPasswordLogin - Header'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), GlobalVariable.Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
}

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 7/applyFinancingAIP - TitleHeader'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/propertyNameAIP - Header'), 0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/propertyNameAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/unitTypeAIP - Header'), 0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/unitTypeAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/propertyPriceAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/propertyPriceAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/downPaymentAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/downPaymentAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/loanAmountAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/loanAmountAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/loanPeriodAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/loanPeriodAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/residentStatusAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/residentStatusAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/educationAIP - Header'), 0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/educationAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/empStatusAIP - Header'), 0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/empStatusAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/businessTypeAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/businessTypeAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/monthlyIncomeAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/monthlyIncomeAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/maritalStatusAIP - Header'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/maritalStatusAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/religionAIP - Header'), 0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/religionAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/applyFinancingAIP - TitleHeader'), 
    0)

Mobile.getText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/applyFinancingAIP - TitleHeader'), 0)

Mobile.scrollToText('Confirm')

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/confirmNextPageAIP - Btn'), 0)

Mobile.setText(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/unitNumberAIP - Txt'), '1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/saveAndNextPageAIP - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/soleOwnerStatementAIP - Header'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 7/yesSoleOwnerAIP - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/addCountryAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/addLine1AIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/addLine2AIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/cityAIP - Header'), 0)

Mobile.scrollToText('State')

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/postcodeAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/stateAIP - Header'), 0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/saveAndNextPageAIP - Btn'), 0)

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 7/propertyNameandUnitTypeAIP - Header'), 0)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/occupationAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/employerNameAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/occupationSectorAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/workingExperienceAIP - Header'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('MayaHome/mayahome - MobileSpy 7/workingExpYearsAIP - dropDownBtn'), 0)

Mobile.scrollToText('10 years')

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/10yearsWorkExp- optionDropdownBtn'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/done - dropDownBtn'), 0)

Mobile.doubleTap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/workingExpMonthsAIP - dropDownBtn'), 
    0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/done - dropDownBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 7/saveAndNextPageAIP - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/addCountryAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/addLine1AIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/addLine2AIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/cityAIP - Header'), 0)

Mobile.scrollToText('Contact number')

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/postcodeAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/stateAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/contactNumberAIP - Header'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 7/saveAndNextPageAIP - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/islamicFinanceAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/islamicFinanceDetail1AIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/islamicFinanceDetail2AIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/islamicFinanceDetail3AIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/conventionalFinanceAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/conventionalFinanceDetail1AIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/conventionalFinanceDetail2AIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/conventionalFinanceDetail3AIP - Header'), 
    0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/islamicFinanceAIP - tickBoxBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 7/saveAndNextPageAIP - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/commodityMurabahahHomeFinancing-i - Header'), 
    0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/selectThisPlanAIP - Btn'), 0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/Agreement1AIP - tickBoxBtn'), 0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/Agreement2AIP - tickBoxBtn'), 0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/Agreement3AIP - tickBoxBtn'), 0)

Mobile.swipe(500, 1500, 500, 500)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/Agreement4AIP - tickBoxBtn'), 0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/yesAgreement4AIP - tickBoxBtn'), 0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/Agreement5AIP - tickBoxBtn'), 0)

Mobile.tap(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/agreeAndConfirm - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/finalConfirmationAIP- Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/eligibilityDetailsAIP - Header'), 
    0)

Mobile.scrollToText('Property Details')

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/propertyDetailsAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/personalDetailsAIP - Header'), 
    0)

Mobile.scrollToText('Employment details')

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/empDetailsAIP - Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/officeAddressAIP - Header'), 
    0)

Mobile.scrollToText('Product details')

Mobile.verifyElementVisible(findTestObject('Object Repository/MayaHome/mayahome - MobileSpy 7/productDetailsAIP - Header'), 
    0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 7/confirmAndSubmitAIP - Btn'), 0)

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 7/greatNewsAIP - Header'), 30)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/greatNewsAIP - Header'), 0)

Mobile.swipe(500, 1300, 500, 500)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyName'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyName'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmountTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmountTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmount(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyLoanAmount(RM)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRateTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRateTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRate(percent)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - effIntRate(percent)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - baseRate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - baseRate'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - spread'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - spread'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriodTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriodTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriod(year)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - loanPeriod(year)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInsalmentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInsalmentTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInstalment(RM)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - monthlyInstalment(RM)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPriceTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPriceTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPrice(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - propertyPrice(RM)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpaymentTxt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpaymentTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpayment(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - downpayment(RM)'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - bankSellingPriceTxt'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - bankSellingPriceTxt'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - bankSellingPrice(RM)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 4/reviewApp - bankSellingPrice(RM)'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 7/viewApplicationAIP - Btn'), 0)

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabPropertyName - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabPropertyName - Header'), 0)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 8/appTabPropertyName - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/verifyUnitNoAIP - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 7/verifyStatusApplicationSuccessfullAIP - Header'), 
    0)

Mobile.getText(findTestObject('MayaHome/mayahome - MobileSpy 7/verifyStatusApplicationSuccessfullAIP - Header'), 0)

