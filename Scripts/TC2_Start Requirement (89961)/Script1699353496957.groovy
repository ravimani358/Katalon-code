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

String Master_stage_field_value = 'Recruitment'

String Recruitment_Status_field_value = 'Attempting'

String Qualifying_Status_field_value = 'Recruiter Transfer'

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

String xpath1 = '//span[@title = \''

String xpath2 = '\']'

String contact_name = findTestData('Contact_Name').getValue(1, 2)

println((xpath1 + contact_name) + xpath2)

Global_search_result = ((xpath1 + contact_name) + xpath2)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/select_contact'))

WebUI.enableSmartWait()

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.enhancedClick(findTestObject('Pages/Recruitment Action Object/Start recruitment/span_Start Process'))

WebUI.mouseOver(findTestObject('Pages/Recruitment Action Object/Start recruitment/start_recruitment_button'))

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Start recruitment/start_recruitment_button'))

WebUI.delay(6)

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Start recruitment/input_Street_Street'))

WebUI.sendKeys(findTestObject('Pages/Recruitment Action Object/Start recruitment/input_Street_Street'), findTestData('Contact_Name').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Pages/Recruitment Action Object/Start recruitment/input_City_City'), findTestData('Contact_Name').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Pages/Recruitment Action Object/Start recruitment/input_Zip_Zip'), findTestData('Contact_Name').getValue(
        4, 1))

WebUI.enableSmartWait()

WebUI.selectOptionByValue(findTestObject('Pages/Recruitment Action Object/Start recruitment/State'), findTestData('Contact_Name').getValue(
        5, 1), true)

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Start recruitment/button_Next'))

WebUI.setText(findTestObject('Pages/Recruitment Action Object/Start recruitment/input_BABS School_input-5893'), findTestData(
        'Contact_Name').getValue(6, 1))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Pages/Recruitment Action Object/Start recruitment/div_Test Standford US School Account'))

WebUI.scrollToElement(findTestObject('Pages/Recruitment Action Object/Start recruitment/button_Finish'), 0)

WebUI.doubleClick(findTestObject('Pages/Recruitment Action Object/Start recruitment/button_Finish'))

WebUI.refresh()

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

// start Validation the fields and fields value
WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

String Last_Activity_Date = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Recruitment Last Activity Date'))

println(Last_Activity_Date)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

String Contact_Master_stage = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Master stage as Recruitment (1)'))

println(Contact_Master_stage)

String Qualifiying_status = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Qualifying status as Recruitment transfer'))

println(Qualifiying_status)

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/Activity'))

String Initia_Contact_Task = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Initial Contact Task'))

println(Initia_Contact_Task)

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/Recruitment tab'))

String Recruitment_status = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Recruitment status as Attempting'))

println(Recruitment_status)

if ((((Qualifying_Status_field_value.equals(Qualifiying_status) && Master_stage_field_value.equals(Contact_Master_stage)) && 
Recruitment_Status_field_value.equals(Recruitment_status)) && !(Last_Activity_Date.isEmpty())) && Initia_Contact_Task.contains(
    'Initial Contact:')) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

