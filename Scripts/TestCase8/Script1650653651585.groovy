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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/span_Cabs'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/a_Outstation Oneway'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/a_airport transfer'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/input_From Airport_BE_cabs_from_airport_location'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/i_Select Return Time_demo-icon icon-go'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/a_rental'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/input_To Airport_cabs_leaving'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/input_Select Destination_hotel_checkin_date'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/td_2'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/div_rental                                 _c9a654'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/input_Select Pickup Time_hotel_checkout_date'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/td_12'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/div_rental                                 _c9a654_1'))

WebUI.click(findTestObject('Object Repository/Page_Online Cab Booking with Latest Offers _b070e4/input_Select Return Time_BE_cabs_htsearch_btn'))

WebUI.click(findTestObject('Object Repository/Page_Cabs/div_Book Now'))

WebUI.click(findTestObject('Object Repository/Page_Cabs/button_Proceed To Payment'))

WebUI.closeBrowser()

