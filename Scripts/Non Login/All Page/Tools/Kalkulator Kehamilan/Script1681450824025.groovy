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

WebUI.click(findTestObject('Object Repository/Tools/button_SAYA SETUJU'))

WebUI.mouseOver(findTestObject('Tools/Tools tab'), 'a_Kalkulator Kehamilan')

//WebUI.click(findTestObject('Object Repository/Tools/a_Kalkulator Kehamilan'))
//
//WebUI.switchToWindowTitle('Kalkulator Kehamilan & Kalender Kehamilan 2023')
//
//WebUI.click(findTestObject('Object Repository/Tools/div_Masukan Tanggal HPHT'))
//
//WebUI.click(findTestObject('Object Repository/Tools/a_Pilih Tanggal'))
//
//WebUI.click(findTestObject('Object Repository/Tools/a_15'))
//
//WebUI.click(findTestObject('Object Repository/Tools/a_Pilih Bulan'))
//
//WebUI.click(findTestObject('Object Repository/Tools/a_September'))
//
//WebUI.click(findTestObject('Object Repository/Tools/a_Pilih Tahun'))
//
//WebUI.click(findTestObject('Object Repository/Tools/a_2020'))
//
//WebUI.click(findTestObject('Object Repository/Tools/button_SIMPAN'))
//
//WebUI.click(findTestObject('Object Repository/Tools/button_MULAI DISINI'))
//
//WebUI.click(findTestObject('Object Repository/Tools/div_Usia Kehamilan_innerBar'))
//
//WebUI.click(findTestObject('Object Repository/Tools/button_Kehamilan Bulan ke 8'))
//
//WebUI.click(findTestObject('Object Repository/Tools/button_Kehamilan Bulan ke 9'))
WebUI.closeBrowser()

