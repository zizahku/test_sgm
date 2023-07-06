import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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
import org.eclipse.persistence.jpa.jpql.Assert as Assert
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Object Repository/Homepage/button_SAYA SETUJU'))

WebUI.click(findTestObject('Homepage/Submit Kode Unik'))

WebUI.delay(1)

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/Masuk'))

WebUI.delay(1)

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/Daftar'))

WebUI.delay(1)

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

CurrentUrl = WebUI.getUrl()

WebUI.verifyElementPresent(findTestObject('Homepage/iframe___ nanti ambil'), 20)

WebUI.click(findTestObject('Homepage/input_concat(id(, , __st_bpn_no, , ))_notnow (1)'))

WebUI.click(findTestObject('Object Repository/Homepage/img_Previous_first-img-slider'))

WebUI.delay(3)

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage/img_1'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Homepage/img'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/button_Next'))

WebUI.click(findTestObject('Object Repository/Homepage/a_Anak'))

WebUI.click(findTestObject('Homepage/a_Baca Selengkapnya'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/a_Baca Selengkapnya_1'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Object Repository/Homepage/tab homepage Kehamilan Menyusui'))

WebUI.click(findTestObject('Homepage/a_Baca Selengkapnya_1_2_3_4'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Object Repository/Homepage/tab homepage Bayi'))

WebUI.click(findTestObject('Homepage/a_Baca Selengkapnya_1_2_3_4_5_6_7'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/button_Coba Sekarang DGM'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/btn Hubungi Sekarang'))

WebUI.delay(2)

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Object Repository/Homepage/Lihat Selengkapnya produk 2'))

WebUI.delay(2)

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/img_SAYA SETUJU_button-careline'))

WebUI.delay(1)

WebUI.click(findTestObject('Homepage/span_Whatsapp'))

WebUI.delay(1)

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/a_Sahabat Generasi Maju'))

WebUI.delay(1)

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.closeBrowser()
