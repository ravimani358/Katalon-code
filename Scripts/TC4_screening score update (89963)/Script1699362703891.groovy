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

String Master_stage_field_value = 'Screening'

String Screening_Status_field_value = 'Completed'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

'start to login as respective users'
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'namrata')

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user_search_result'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.doubleClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(6)

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Pages/Screening Object/Update screening score/User_select_contact'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Pages/Recruitment Action Object/Start recruitment/span_Start Process'))

WebUI.mouseOver(findTestObject('Object Repository/Pages/Screening Object/Update screening score/span_Enter Screening Score'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Object Repository/Pages/Screening Object/Update screening score/span_Enter Screening Score'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Pages/Screening Object/Update screening score/button_Enter Score'))

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Update screening score/span_Yes'))

WebUI.sendKeys(findTestObject('Pages/Screening Object/Update screening score/input_OOPS Score_scoreInput'), findTestData(
        'Screening').getValue(2, 1))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Screening Object/Update screening score/input_Basics Score_scoreInput'), 
    findTestData('Screening').getValue(3, 1))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Screening Object/Update screening score/input_Advanced Score_scoreInput'), 
    findTestData('Screening').getValue(4, 1))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Screening Object/Update screening score/input_SQL Score_scoreInput'), 
    findTestData('Screening').getValue(5, 1))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Screening Object/Update screening score/input_Web Score_scoreInput'), 
    findTestData('Screening').getValue(6, 1))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Screening Object/Update screening score/input_Project Work Score_scoreInput'), 
    findTestData('Screening').getValue(7, 1))

WebUI.click(findTestObject('Pages/Screening Object/Update screening score/div_Java V1'))

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Update screening score/lightning-primitive-icon'))

WebUI.doubleClick(findTestObject('Pages/Screening Object/Update screening score/button_Save'))

WebUI.refresh()

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

// ========================================================= Screening score validation
String Screening_status = WebUI.getText(findTestObject('Field Validations/4. Screening Score Update/score_screening status'))

println(Screening_status)

WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/Activity'))

String follow_up_task = WebUI.getText(findTestObject('Field Validations/4. Screening Score Update/follow_up_task'))

println(follow_up_task)

String score_mark = WebUI.getText(findTestObject('Field Validations/4. Screening Score Update/Email-task'))

println(score_mark)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

String Contact_Master_stage = WebUI.getText(findTestObject('Field Validations/3. Master stage_Screening/master stage as screening'))

println(Contact_Master_stage)

if (((Master_stage_field_value.equals(Contact_Master_stage) && Screening_Status_field_value.equals(Screening_status)) && 
follow_up_task.contains('Tech Screen Follow Up')) && score_mark.contains('Scored')) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

