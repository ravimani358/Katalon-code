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

WebUI.enableSmartWait()

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.scrollToElement(findTestObject('Field Validations/5. Assign Training/additional contact details'), 2)

WebUI.click(findTestObject('Pages/Submital Object/Submital field'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Pages/Interview Object/Create Interview/button_Start Process'))

WebUI.enableSmartWait()

WebUI.doubleClick(findTestObject('Pages/Interview Object/Create Interview/span_Schedule Client Interview'))

WebUI.clickOffset(findTestObject('Pages/Interview Object/Create Interview/input_DateTime_10530'), 0, 0)

WebUI.sendKeys(findTestObject('Object Repository/Pages/Interview Object/Create Interview/input_DateTime_10530'), findTestData(
        'Interview').getValue(1, 1), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.clickOffset(findTestObject('Object Repository/Pages/Interview Object/Create Interview/input_Date Picker_10530-time'), 
    0, 0)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Interview Object/Create Interview/select_--None--On SitePhoneVideoOnline'), 
    'On Site', true)

WebUI.enableSmartWait()

WebUI.clickOffset(findTestObject('Pages/Interview Object/Create Interview/button_Save'), 0, 0)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Field Validations/8. Create Interview/interview tab'))

WebUI.delay(2)

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

if ((Interview_record.contains('INT') && Interview_round_record.contains('INTR')) && Contact_email.contains('Interview:')) {
    println('Field validation woring properly')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

