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

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Rajkumar Chandrasekaran')

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user_search_result'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.doubleClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(6)

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Field Validations/8. Create Interview/Select user for create interview'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('Field Validations/5. Assign Training/additional contact details'), 2)

WebUI.click(findTestObject('Pages/Submital Object/Submital field'))

WebUI.delay(1)

//=========================================
WebUI.click(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/a_Interviews'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/Interview record id'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/INT_Process button'))

WebUI.clickOffset(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/INT_Process button'), 0, 
    0)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Object Repository/Pages/Interview Object/Enter Interview Feedback Process button/span_Enter Interview Feedback'))

WebUI.click(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/span_DateTime_slds-radio_faux'))

WebUI.doubleClick(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/button_Next'))

WebUI.selectOptionByValue(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/select_--None--In ProgressRejectedSelected'), 
    'Selected', true)

WebUI.delay(3)

WebUI.click(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/input_Confirmation Date_input-561'))

WebUI.sendKeys(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/input_Confirmation Date_input-561'), 
    findTestData('Interview').getValue(2, 1))

WebUI.selectOptionByValue(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/select_--None--Fluency of SpeechClarity of _ed6a14'), 
    'Listening', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Interview Object/Enter Interview Feedback Process button/select_--None--Basic ConceptsTheoretical Kn_ca7ecf'), 
    'Basic Concepts', true)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Pages/Interview Object/Enter Interview Feedback Process button/button_Save'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

String interview_status = WebUI.getText(findTestObject('Field Validations/8. Create Interview/Interview status as selected'))

println(interview_status)

WebUI.click(findTestObject('Field Validations/8. Create Interview/interview round tab'))

WebUI.click(findTestObject('Field Validations/8. Create Interview/interview round status uodate field'))

String interview_round_status = WebUI.getText(findTestObject('Field Validations/8. Create Interview/Interview round status as selected'))

println(interview_round_status)

if (interview_status.equals('Selected') && interview_round_status.equals('Selected')) {
    println('Field validation woring properly')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

