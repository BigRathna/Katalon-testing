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

WebUI.click(findTestObject('Object Repository/Page_Flight, Cheap Air Tickets , Hotels, Ho_5a7f1b/a_Gift Voucher NEW'))

WebUI.switchToWindowTitle('Yatra Gift Cards - Buy Yatra Gift Vouchers Online, Gift Vouchers')

WebUI.click(findTestObject('Object Repository/Page_Yatra Gift Cards - Buy Yatra Gift Vouc_f06053/p_Full Utilization of vouchers with multire_ea606a'))

WebUI.click(findTestObject('Object Repository/Page_Yatra Gift Cards - Buy Yatra Gift Vouc_f06053/h1_Utilization'))

WebUI.click(findTestObject('Object Repository/Page_Yatra Gift Cards - Buy Yatra Gift Vouc_f06053/i_Club Together_image6'))

WebUI.click(findTestObject('Object Repository/Page_Yatra Gift Cards - Buy Yatra Gift Vouc_f06053/a_Shop Now'))

WebUI.switchToWindowTitle('Gift Cards')

WebUI.click(findTestObject('Object Repository/Page_Gift Cards/img_Previous_img-fluid rounded'))

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_Yatra Hotels  Holidays Vouchers_denomination'), '5200')

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_50,000.00_quantity'), '1')

WebUI.sendKeys(findTestObject('Object Repository/Page_Gift Cards/input_50,000.00_quantity'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_concat(Sender, , s Details)_firstname'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_concat(Sender, , s First Name)_lastname'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_concat(Please enter Sender, , s Last _aa706e'), 'abc@abc.com')

WebUI.click(findTestObject('Object Repository/Page_Gift Cards/label_Mobile Number'))

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_358_telephone'), '7896541230')

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_concat(Sender, , s Details)_firstname'), 'b')

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_concat(Sender, , s First Name)_lastname'), 'hq')

WebUI.setText(findTestObject('Object Repository/Page_Gift Cards/input_concat(Please enter Sender, , s Last _aa706e'), 'as@as.com')

WebUI.closeBrowser()

