import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://pisd-qa-testing.vercel.app/')

WebUI.delay(2)

WebUI.click(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/button_nav-btn-register'))

WebUI.setText(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/input_e.g. Maria Gonzalez'), 
    'Budi Santoso')

WebUI.setText(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/input_e.g. maria_g'), 
    'budisantoso123')

WebUI.setText(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/input_e.g. mariaexample.com'), 
    'budi@mail.com')

WebUI.setEncryptedText(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/input_Create password'), 
    'p4y+y39Ir5O++RH4jAhtiA==')

WebUI.setEncryptedText(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/input_Repeat password'), 
    'p4y+y39Ir5O++RH4jAhtiA==')

WebUI.click(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/input_checkbox-reg-terms'))

WebUI.click(findTestObject('Register_Page/Page_QA Practice Shop - QA Automation  API Testing Sandbox/span_Complete Registration'))

