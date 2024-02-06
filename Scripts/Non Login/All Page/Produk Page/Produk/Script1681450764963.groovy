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

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Homepage/button_SAYA SETUJU'))

WebUI.click(findTestObject('Produk page/header_product'))

WebUI.click(findTestObject('Produk page/img_banner landing produk'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/close popup BPOM'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/input_concat(id(, , __st_bpn_no, , ))_notnow'))

//CurrentUrl = WebUI.getUrl()
//
//WebUI.verifyElementPresent(findTestObject('Homepage/iframe___ nanti ambil'), 20)
//
//WebUI.click(findTestObject('Homepage/input_concat(id(, , __st_bpn_no, , ))_notnow (1)'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Produk page/input_concat(id(, , __st_bpn_no, , ))_notnow'))

//WebUI.navigateToUrl('https://www.generasimaju.co.id/produk')
//
//WebUI.click(findTestObject('null'))
//
//WebUI.click(findTestObject('null'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('null'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('null'))
//
//WebUI.delay(2)
//
//WebUI.navigateToUrl('https://www.generasimaju.co.id/produk')
//
//WebUI.closeBrowser()

