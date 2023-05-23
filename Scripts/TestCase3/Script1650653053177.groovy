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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/a_Holidays'))

WebUI.click(findTestObject('Object Repository/Page_Tour Packages in India, Book Vacation _173dba/div_Month of Travel (Optional)'))

WebUI.click(findTestObject('Object Repository/Page_Tour Packages in India, Book Vacation _173dba/li_May 2022'))

WebUI.click(findTestObject('Object Repository/Page_Tour Packages in India, Book Vacation _173dba/input_May 2022_BE_holiday_search_btn'))

WebUI.click(findTestObject('Object Repository/Page_Ladakh Holiday Packages - Book Ladakh _3b235e/button_View Details'))

WebUI.click(findTestObject('Object Repository/Page_Indus Creed - Standard Holiday Package_137158/button_Submit Query'))

WebUI.closeBrowser()

