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

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/filteringIcon - Btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/locationFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/priceRangeFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/minPriceFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/maxPriceFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/sizeRangeFilterFunction - Header'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/location1 - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('propertyDetails').getValue(6, 1))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), findTestData('propertyDetails').getValue(
        6, 1), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/location2 - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('propertyDetails').getValue(7, 1))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location2Dropdown - list'), findTestData('propertyDetails').getValue(
        7, 1), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/confirm - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/minPrice - DropdownBtn'), 0)

def minPrice1 = findTestData('propertyDetails').getValue(8, 1)

def minPrice2 = Mobile.concatenate((('RM ' + findTestData('propertyDetails').getValue(8, 1)) as String))

if (minPrice1 >= '190000') {
    Mobile.scrollToText(minPrice2)

    Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), minPrice2, 
        0)
} else {
    Mobile.scrollToText('Any')

    Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/any - dropdownBtnOption'), 0)
}

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/maxPrice - DropdownBtn'), 0)

def maxPrice = Mobile.concatenate((('RM ' + findTestData('propertyDetails').getValue(9, 1)) as String))

Mobile.scrollToText(maxPrice)

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), maxPrice, 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.scrollToText('Developers')

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/minSizeFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/maxSizeFilterFunction - Header'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/minSize - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('propertyDetails').getValue(10, 1))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), findTestData('propertyDetails').getValue(
        10, 1), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/maxSize - DropdownBtn'), 0)

Mobile.scrollToText(findTestData('propertyDetails').getValue(11, 1))

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location1Dropdown  - List'), findTestData('propertyDetails').getValue(
        11, 1), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/Done - Btn'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/preferDeveloperFilterFunction - Header'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/developerName - DropdownBtn'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/searchIcon - Btn'), 0)

Mobile.setText(findTestObject('MayaHome/mayahome - MobileSpy 6/developerName - Txt'), 'Eco', 0)

Mobile.hideKeyboard()

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location2Dropdown - list'), findTestData('propertyDetails').getValue(
        12, 1), 0)

Mobile.selectListItemByLabel(findTestObject('MayaHome/mayahome - MobileSpy 6/location2Dropdown - list'), findTestData('propertyDetails').getValue(
        12, 1), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/confirm - Btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 1300)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/roomCarParkFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/bedroomFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/bathroomFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/carparkFilterFunction - Header'), 0)

Mobile.swipe(500, 1500, 500, 500)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/propertyTypeFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/apartmentFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/compactFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/condoFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/ownershipFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/freeholdFilterFunction - Header'), 0)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/leaseholdFilterFunction - Header'), 0)

Mobile.tap(findTestObject('MayaHome/mayahome - MobileSpy 6/applyFilters - Btn'), 0)

Mobile.waitForElementPresent(findTestObject('MayaHome/mayahome - MobileSpy 6/resultFound - Header'), 10)

Mobile.verifyElementVisible(findTestObject('MayaHome/mayahome - MobileSpy 6/resultFound - Header'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

