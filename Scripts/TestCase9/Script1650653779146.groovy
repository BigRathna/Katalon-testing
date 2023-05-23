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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/span_Freight'))

WebUI.switchToWindowTitle('Freight')

WebUI.click(findTestObject('Object Repository/Page_Freight/li_Real-time Container Tracking'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Freight/img'))

WebUI.click(findTestObject('Object Repository/Page_Freight/a_Get a Quote'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email_email'), 'jvjhv')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_mat-input-1'), 'E66SM2Q6wLQ=')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login/img'))

WebUI.click(findTestObject('Object Repository/Page_Login/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Yatra Freight/div_REQUEST QUOTE'))

WebUI.click(findTestObject('Object Repository/Page_Landing/div_Ocean'))

WebUI.click(findTestObject('Object Repository/Page_Landing/span_Cha'))

WebUI.click(findTestObject('Object Repository/Page_Landing/div_date_range'))

WebUI.click(findTestObject('Object Repository/Page_Landing/div_5'))

WebUI.click(findTestObject('Object Repository/Page_Landing/button_APR 2022_mat-focus-indicator mat-cal_f78b4a'))

WebUI.click(findTestObject('Object Repository/Page_Landing/div_4'))

WebUI.setText(findTestObject('Object Repository/Page_Landing/input_From CityPort_ng-untouched ng-pristin_c68536'), 'wfsazfzd')

WebUI.click(findTestObject('Object Repository/Page_Landing/span_PROCEED'))

WebUI.click(findTestObject('Object Repository/Page_Landing/img'))

WebUI.closeBrowser()

