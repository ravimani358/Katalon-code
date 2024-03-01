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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Alert as Alert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rev2--revqa.sandbox.lightning.force.com/lightning/r/Submittal__c/a0zRt000000RiOLIA0/view')

WebUI.click(findTestObject('Field Validations/8. Create Interview/interview tab'))

String Interview_record = WebUI.getText(findTestObject('Field Validations/8. Create Interview/Interview_record'))

println(Interview_record)

WebUI.enhancedClick(findTestObject('Field Validations/8. Create Interview/Interview_record'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Field Validations/8. Create Interview/interview round tab'))

WebUI.delay(2)

String Interview_round_record = WebUI.getText(findTestObject('Field Validations/8. Create Interview/Interview round record'))

println(Interview_round_record)

WebUI.enhancedClick(findTestObject('Field Validations/8. Create Interview/Interview round record'))

String Contact_email = WebUI.getText(findTestObject('Field Validations/8. Create Interview/interview email'))

println(Contact_email)

