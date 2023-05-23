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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/li_Holidays'))

WebUI.click(findTestObject('Object Repository/Page_Tour Packages in India, Book Vacation _173dba/span_Month of Travel (Optional)'))

WebUI.click(findTestObject('Object Repository/Page_Tour Packages in India, Book Vacation _173dba/li_August 2022'))

WebUI.click(findTestObject('Object Repository/Page_Tour Packages in India, Book Vacation _173dba/input_August 2022_BE_holiday_search_btn'))

WebUI.click(findTestObject('Object Repository/Page_Ladakh Holiday Packages - Book Ladakh _3b235e/button_View Details'))

WebUI.click(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/button_Submit Query'))

WebUI.setText(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/input_Call 91-9990-614-615_customerName'), 
    'aaa')

WebUI.setText(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/input_Call 91-9990-614-615_mailId'), 
    'hbc@hbc.com')

WebUI.setText(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/input_Call 91-9990-614-615_customerMobileNumber'), 
    '9874563210')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/select_Your city                           _92c8d5'), 
    'Pondicherry', true)

WebUI.click(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/form_91                                    _bdf68a'))

WebUI.click(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/input_THANK YOU FOR YOUR QUERY_submitQuery-_f10800'), 
    '987456')

WebUI.click(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/section_verify your mobile number  An OTP (_669512'))

WebUI.click(findTestObject('Object Repository/Page_Best Of Ladakh - Standard Holiday Pack_5ee1bb/i_THANK YOU FOR YOUR QUERY_back-arrow'))

WebUI.closeBrowser()

