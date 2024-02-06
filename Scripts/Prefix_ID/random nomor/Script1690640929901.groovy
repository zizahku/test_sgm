
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

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('homepage/button_Daftar'))

WebUI.setText(findTestObject('Register/input_Nama Lengkap_firstname'), 'azia')

String randomPhoneNumber = generateRandomPhoneNumber()

println("Nomor telepon acak dengan kondisi: $randomPhoneNumber")

// Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
WebUI.setText(findTestObject('Register/input_Nomor Ponsel_msisdn'), randomPhoneNumber)

WebUI.setEncryptedText(findTestObject('Register/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Register/Kondisi Bunda'))

String generateRandomPhoneNumber() {
    def random = new Random()

    def phoneNumber = ''

    while (true) {
        phoneNumber = '08'

        while (phoneNumber.size() < 12) {
            def digit = random.nextInt(10)

            phoneNumber += digit
        }
        
        def excludedPrefixes = ['0811', '0812', '0813', '0821', '0822', '0823', '0852', '0853', '0814', '0815', '0816', '0855'
            , '0856', '0857', '0858', '0881', '0882', '0883', '0884', '0885', '0886', '0887', '0888', '0889', '0817', '0818'
            , '0819', '0859', '0877', '0878', '0831', '0832', '0833', '0838', '0895', '0896', '0897', '0898', '0899']

        def isExcludedPrefix = false

        for (String prefix : excludedPrefixes) {
            if (phoneNumber.startsWith(prefix)) {
                isExcludedPrefix = true

                break
            }
        }
        
        if (!(isExcludedPrefix)) {
            break
        }
    }
    
    return phoneNumber
}

