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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/button_SAYA SETUJU'))

WebUI.click(findTestObject('Object Repository/Homepage/tab homepage Kehamilan Menyusui'))

WebUI.click(findTestObject('Object Repository/Homepage/tab homepage Bayi'))

WebUI.click(findTestObject('Object Repository/Homepage/a_Anak'))

WebUI.click(findTestObject('Object Repository/Homepage/div_Minyak Ikan Kod dan Minyak Ikan Tuna,.1_51689a'))

WebUI.delay(5)

WebUI.back()

WebUI.click(findTestObject('Homepage/a_Baca Selengkapnya'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Homepage/a_Baca Selengkapnya_1'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

WebUI.verifyElementPresent(findTestObject('Homepage/iframe___ nanti ambil'), 20)

WebUI.click(findTestObject('Homepage/button nanti'))

WebUI.click(findTestObject('Homepage/a_Baca Selengkapnya_1_2'))

WebUI.switchToWindowUrl('https://www.generasimaju.co.id/')

