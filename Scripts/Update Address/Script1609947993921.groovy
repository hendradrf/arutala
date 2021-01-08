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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/span_Add to cart (4)'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_Proceed to checkout (4)'))

'This is the step for update adress'
WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout (3)'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Email address'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email (4)'), 'test000@mailproof.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd (4)'), '5xx1bkCcAlw=')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in (4)'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Update'))

'Input first name'
WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__firstname'), 'Test')

'Input last name'
WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__lastname'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__address1'), 'Jogja')

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/input__city'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__city'), 'Jogja')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Address - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '1', true)

'5 numbers format\r\n'
WebUI.setText(findTestObject('Page_Address - My Store/input__postcode'), '88888')

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/div_Your addressesModify address My address_2118bc'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone_mobile'), '086754321234')

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/span_Save'))

WebUI.closeBrowser()

