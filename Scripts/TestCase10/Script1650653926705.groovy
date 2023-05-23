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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/span_Holidays_demo-icon icon-visa'))

WebUI.switchToWindowTitle('Apply Visa Online - Online E Visa Applications, Tourist, Transit and Business Visas')

WebUI.setText(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/input_X_name'), 'srivishnu thatha')

WebUI.setText(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/input_Your Name_email'), 
    'hbc@hbc.com')

WebUI.setText(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/input_Email ID_mobile'), 
    '9874563210')

WebUI.click(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/button_Apply now'))

WebUI.setText(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/input_Please verify your mobile number_otp-input'), 
    '541236')

WebUI.click(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/a_Resend OTP'))

WebUI.click(findTestObject('Object Repository/Page_Apply Visa Online - Online E Visa Appl_69f706/span_X'))

WebUI.closeBrowser()

