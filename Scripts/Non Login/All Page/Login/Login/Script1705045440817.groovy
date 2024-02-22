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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Object Repository/Homepage/button_SAYA SETUJU'))

WebUI.click(findTestObject('Homepage/Masuk'))

WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/Login/input_Login_Nomor Handphone_msisdn'))
WebUI.setText(findTestObject('Login/input_Login_Nomor Handphone_msisdn'), '085719131755')

WebUI.click(findTestObject('Object Repository/Login/input_login_Password_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_login_Password_password'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

