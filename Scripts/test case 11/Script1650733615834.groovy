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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/span_Villas  Stays'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/input_Save upto 40 with usage based pricing_bca950'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/td_18'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/td_20'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/i_Select Check-Out Time_icon icon-angle-rig_8177aa'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/span_Above 12 years_ddSpinnerPlus'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/span_Above 12 years_ddSpinnerPlus'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/a_Add room'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/span_Above 12 years_ddSpinnerPlus'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays across India - Yatra.com/input_Done_BE_hotel_htsearch_btn'))

WebUI.click(findTestObject('Object Repository/Page_Book Homestays at Lowest Price/i_Logout_ico-newHeaderLogo'))

WebUI.closeBrowser()

