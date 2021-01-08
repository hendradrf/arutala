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

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_Email address_email_create'), 'test111@mailpoof.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr._id_gender'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'))

'Choose radio button option for gender'
WebUI.click(findTestObject('Object Repository/Page_Login - My Store/label_Mr'))

'input first name with alphabet, not number'
WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Hendra')

'input last name with alphabet, not number'
WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'Dea')

'input password minimum 5 characters'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), '5xx1bkCcAlw=')

'input date of birth with date picker'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '12', true)

'input month of birth with date picker'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '11', true)

'input year of birth with date picker'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '2006', true)

'Input address'
WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'Yogyakarta')

'Input City'
WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Yogyakarta')

'Input State with dropdown menu'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '5', true)

'Input phone number (number only)'
WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '085675855663')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__alias'))

'Input post code (5 numbers) '
WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '22222')

'Input password, minimum 5 characters'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), '5xx1bkCcAlw=')

'Click on register button'
WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.closeBrowser()

