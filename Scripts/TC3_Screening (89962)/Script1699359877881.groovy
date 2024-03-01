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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String Master_stage_field_value = 'Screening'

String Screening_Status_field_value = 'Scheduled'

String Recruitment_Status_field_value = 'Tech Screen'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

//============================================================================ select contcat=============
'start to login as respective users'
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Erik Schultz')

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user_search_result'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.doubleClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(6)

//========================================================================
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/select_contact'))

//================================================================================
CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

'start process button start here'
WebUI.click(findTestObject('Pages/Recruitment Action Object/Start recruitment/span_Start Process'))

WebUI.mouseOver(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/span_Recruitment Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Recruitment Action Object/Schedule Tech screen/span_Recruitment Actions'))

WebUI.delay(3)

'end here'
WebUI.selectOptionByValue(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Select an action'), 'c:CancelOrRescheduleTechScreen', 
    false)

//==============================================================
WebUI.scrollToElement(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/next button'), 2)

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/next button'))

check = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Finding locked screeningslot'))

println(check)

WebUI.mouseOver(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Finding locked screeningslot'))

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Finding locked screeningslot'))

WebUI.mouseOver(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/slot booking finish button'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/slot booking finish button'))

WebUI.delay(3)

WebUI.refresh()

//----------------------> Start Validation
WebUI.delay(3)

String Screening_status = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Screening status'))

println(Screening_status)

String Last_screen_Date = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Last screen Date'))

println(Last_screen_Date)

WebUI.scrollToElement(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Screening section'), 3)

String Last_screening = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Last screening'))

println(Last_screening)

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/Activity'))

String Screening_Task = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Screening Task'))

println(Screening_Task)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

String Contact_Master_stage = WebUI.getText(findTestObject('Field Validations/3. Master stage_Screening/master stage as screening'))

println(Contact_Master_stage)

WebUI.scrollToElement(findTestObject('Field Validations/2. Master stage_Recruitment/Recruitment tab'), 0)

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/Recruitment tab'))

String Recruitment_status = WebUI.getText(findTestObject('Field Validations/3. Master stage_Screening/screening recruitment status change'))

println(Recruitment_status)

if (((((Contact_Master_stage.equals(Master_stage_field_value) && Screening_status.equals(Screening_Status_field_value)) && 
!(Last_screen_Date.isEmpty())) && Last_screening.contains('SCR')) && Screening_Task.contains('Tech Screen Scheduled')) && 
Recruitment_status.equals(Recruitment_Status_field_value)) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

