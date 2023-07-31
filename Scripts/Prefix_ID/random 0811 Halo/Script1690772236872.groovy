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
import java.util.Random as random

// Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
//WebUI.setText(findTestObject('Object Repository/Page_NamaHalaman/idField'), randomNum)
WebUI.openBrowser('')

WebUI.navigateToUrl('https://generasi.eydendigital.co.id/klub-generasi-maju/register')

WebUI.click(findTestObject('homepage/button_Daftar'))

WebUI.setText(findTestObject('Register/input_Nama Lengkap_firstname'), 'azia')

// Isi field dalam form dengan angka acak
String randomNum = generateRandomNumber()

// Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
WebUI.setText(findTestObject('Register/input_Nomor Ponsel_msisdn'), randomNum)

WebUI.setEncryptedText(findTestObject('Register/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

String generateRandomNumber() {
    Random random = new Random()

    String lastNineDigits = String.format('%09d', random.nextInt(1000000000))

    String randomNumber = '0811' + lastNineDigits

    return randomNumber
}

