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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/a_Hotels'))

WebUI.click(findTestObject('Object Repository/Page_Online Hotel Booking - Save Upto 50 on_41b1be/div'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/input_s_BE_hotel_htsearch_btn'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/a_Quick View'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/p_CHECKIN  1200 PM'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/div_Highlights_icon-holder'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/div_Highlights_icon-holder'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/div_Highlights_icon-holder'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/span_Choose Room'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/button_Book Now'))

WebUI.click(findTestObject('Object Repository/Page_Yatra.com  Book your Homestay/i_Hi_paymentDesktopLogo'))

WebUI.closeBrowser()

