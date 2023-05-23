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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.yatra.com/')

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/span_Buses'))

WebUI.click(findTestObject('Object Repository/Page_Bus Tickets Online, Book AC Volvo Slee_940f42/input_Round Trip_bus_leaving'))

WebUI.click(findTestObject('Object Repository/Page_Bus Tickets Online, Book AC Volvo Slee_940f42/input_Going To_bus_depart_date'))

WebUI.click(findTestObject('Object Repository/Page_Bus Tickets Online, Book AC Volvo Slee_940f42/td_4'))

WebUI.click(findTestObject('Object Repository/Page_Bus Tickets Online, Book AC Volvo Slee_940f42/input_Depart Date_BE_bus_search_btn'))

WebUI.click(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/button_Select Seat'))

WebUI.click(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/i_Upper Deck_ico-sprite ico-default'))

WebUI.click(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/i_Upper Deck_ico-sprite ico-default_1'))

WebUI.click(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/i_Upper Deck_ico-sprite ico-default'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/i_Upper Deck_ico-sprite ico-default_1'))

WebUI.click(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/i_Upper Deck_ico-sprite ico-default'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/i_Upper Deck_ico-sprite ico-default_1_2'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/i_Upper Deck_ico-sprite ico-default_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/select_Select Boarding Points  Gujarat trav_e0a7ea'), 
    '[object Object]', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/select_Select Dropping Points Tumkur by pas_71b20c'), 
    '[object Object]', true)

WebUI.click(findTestObject('Object Repository/Page_Yatra.com  Mumbai to Bangalore Bus/div_Confirm Seats'))

WebUI.setText(findTestObject('Object Repository/Page_Yatra  Book Bus/input_Contact Details_input-style width-100'), 'hbc@hbc.com')

WebUI.setText(findTestObject('Object Repository/Page_Yatra  Book Bus/input__number border-none'), '9874563210')

WebUI.click(findTestObject('Object Repository/Page_Yatra  Book Bus/div_Proceed To Payment'))

WebUI.closeBrowser()

