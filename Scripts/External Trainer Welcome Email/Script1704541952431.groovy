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

//import com.kms.katalon.core.webui.keyword.BrowserBuiltInKeywords as Browser
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Rajaraman RJ')

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Pages/Purchase order record Object/Select User'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(6, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.mouseOver(findTestObject('Pages/Screening Object/Screening slots/login button'))

'successfully login the screening user'
WebUI.enhancedClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(9)

WebUI.enhancedClick(findTestObject('Pages/Contact Object/Record type as External/Contact'))

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('External record/External_Trainer_contact_creation').getValue(
        1, 2))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/select_contact'))

WebUI.enableSmartWait()

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/Pages/External user process button/Send portal invite process button/span_Start Process'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/External user process button/Send portal invite process button/span_Start Process'))

WebUI.doubleClick(findTestObject('Object Repository/Pages/External user process button/Send portal invite process button/div_Send Portal Invite'))

String Email = WebUI.getText(findTestObject('Object Repository/Pages/External user process button/Send portal invite process button/p_Email external13contcat13yopmail.com'))

println(Email)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Object Repository/Pages/External user process button/Send portal invite process button/button_Submit'))

