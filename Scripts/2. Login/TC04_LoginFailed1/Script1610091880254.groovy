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

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

'Input valid email, valid format'
WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email (1)'), 'test000@mailproof.com')

'Input password minimum 5 character'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd (1)'), 'GYDmRgS5yd5PL6pQTxDpCg==')

'Click on Sign In button. Then will be shown an error message'
WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in (1)'))

WebUI.closeBrowser()

