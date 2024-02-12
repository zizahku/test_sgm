import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.github.kklisura.cdt.protocol.types.page.Viewport as Viewport
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/button_SAYA SETUJU'))

WebUI.click(findTestObject('Bersama cegah anemia/header_Bersama Cegah Anemia'))

WebUI.click(findTestObject('Produk page/input_concat(id(, , __st_bpn_no, , ))_notnow'))

WebUI.click(findTestObject('Bersama cegah anemia/breadcrumb beranda'))

WebUI.back()

WebUI.click(findTestObject('Bersama cegah anemia/anchor Lihat Lebih Lengkap'))

WebUI.delay(1)

WebUI.click(findTestObject('Bersama cegah anemia/button_next card'))

WebUI.delay(1)

WebUI.click(findTestObject('Bersama cegah anemia/button prev card'))

WebUI.delay(1)

WebUI.click(findTestObject('Bersama cegah anemia/button prev card'))

WebUI.delay(1)

WebUI.click(findTestObject('Bersama cegah anemia/span_next artikel'))

WebUI.delay(1)

WebUI.click(findTestObject('Bersama cegah anemia/span_prev artikel'))

WebUI.delay(1)

WebUI.click(findTestObject('Bersama cegah anemia/a_Cari Tahu Lebih Lanjut'))

WebUI.back()

