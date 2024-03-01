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

WebUI.openBrowser('')

String Master_stage_field_value = 'Selected'

String Selected_status_field_value = 'Training Assigned'

String Training_status_field_value = 'Pending'

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

//============================================================================ select contcat=============
'start to login as respective users'
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/button_Search'))

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

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Field Validations/5. Assign Training/assign training select contact'))

WebUI.delay(1)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Pages/Recruitment Action Object/Start recruitment/span_Start Process'))

WebUI.mouseOver(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/span_Recruitment Actions'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Recruitment Action Object/Schedule Tech screen/span_Recruitment Actions'))

WebUI.delay(3)

'end here'
WebUI.selectOptionByValue(findTestObject('Pages/Recruitment Action Object/Schedule Tech screen/Select an action'), 
    'c:AssignTraining', false)

WebUI.delay(4)

WebUI.click(findTestObject('Pages/Recruitment Action Object/Assign Training/input_Start Date is On or After_startDateCutoff'))

WebUI.clearText(findTestObject('Pages/Recruitment Action Object/Assign Training/input_Start Date is On or After_startDateCutoff'))

WebUI.sendKeys(findTestObject('Pages/Recruitment Action Object/Assign Training/input_Start Date is On or After_startDateCutoff'), 
    findTestData('Training').getValue(3, 1))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Assign Training/Select_Training'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Assign Training/button_Submit'))

WebUI.delay(9)

WebUI.refresh()

String Selected_status = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Assign Training/Selected status'))

println(Selected_status)

String Training_status = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Assign Training/Training status'))

println(Training_status)

String Training_start_date = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Assign Training/Training start date'))

println(Training_start_date)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/Quick link section'), 3)

String Last_training_class = WebUI.getText(findTestObject('Pages/Recruitment Action Object/Assign Training/Last training class'))

println(Last_training_class)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

String Contact_Master_stage = WebUI.getText(findTestObject('Field Validations/5. Assign Training/Assign training master stage'))

if ((((Master_stage_field_value.equals(Contact_Master_stage) && Selected_status_field_value.equals(Selected_status)) && 
Training_status_field_value.equals(Training_status)) && !(Training_start_date.isEmpty())) && Last_training_class.contains(
    'TA')) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)