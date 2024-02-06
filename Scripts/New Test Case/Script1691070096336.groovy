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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver


WebUI.openBrowser('https://generasi.eydendigital.co.id/klub-generasi-maju/register?referral=https://generasi.eydendigital.co.id/')
// Mendapatkan driver
def driver = DriverFactory.getWebDriver()
WebUI.openBrowser('https://generasi.eydendigital.co.id/klub-generasi-maju/register?referral=https://generasi.eydendigital.co.id/')

// Mendapatkan elemen input dengan atribut name="ispregnant"
WebElement inputElement = driver.findElement(By.cssSelector("input[name='ispregnant']"))

// Mendapatkan nilai atribut data-pregnant dan data-child
def dataPregnant = inputElement.getAttribute("data-pregnant")
def dataChild = inputElement.getAttribute("data-child")

// Melakukan keputusan berdasarkan nilai atribut data-pregnant dan data-child
if (dataPregnant.equals("Y") && dataChild.equals("Y")) {
	WebUI.comment("Ibu sedang hamil dan memiliki anak")
} else if (dataPregnant.equals("Y")) {
	WebUI.comment("Ibu sedang hamil")
} else if (dataChild.equals("Y")) {
	WebUI.comment("Ibu memiliki anak")
} else {
	WebUI.comment("Ibu tidak sedang hamil dan tidak memiliki anak")
}

