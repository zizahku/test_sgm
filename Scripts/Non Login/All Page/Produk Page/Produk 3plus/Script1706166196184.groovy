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

WebUI.click(findTestObject('Produk page/input_concat(id(, , __st_bpn_no, , ))_notnow'))

WebUI.click(findTestObject('Produk page/header_product'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Produk page/close X popup produk landing'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/img_3plus'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Produk page/button_Rasa Vanila'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Produk page/button_Rasa Madu'))

WebUI.click(findTestObject('Object Repository/Produk page/button_400 gr'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Produk page/button_600 gr'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Produk page/button_900 gr'))

WebUI.click(findTestObject('Produk page/button_BELI DI SINI'))

//
WebUI.click(findTestObject('Produk page/button close popup merchant'))

WebUI.click(findTestObject('Produk page/div_Disclaimer                                                                      BUKA'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/button tutup disclaimer'))

WebUI.click(findTestObject('Produk page/buka komposisi sgm'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/buka petunjuk penyajian'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/a_MEKANISME KLUB GENERASI MAJU'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/a_Keuntungan Klub Generasi Maju'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/a_Daftar Klub Generasi Maju'))

WebUI.back()

WebUI.click(findTestObject('Produk page/button_Next promo event'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/button_BELI SEKARANG'))

WebUI.delay(2)

WebUI.click(findTestObject('Produk page/button close popup merchant'))
WebUI.delay(1)
WebUI.executeJavaScript('window.scrollTo(0, -document.body.scrollHeight);', null)
WebUI.delay(1)
WebUI.click(findTestObject('Produk page/highlight5 PLUS'))

