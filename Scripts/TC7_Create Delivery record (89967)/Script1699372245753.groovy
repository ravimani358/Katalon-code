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

//============================================================================ select contcat=============
'start to login as respective users'
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Tina Ervin')

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

WebUI.enhancedClick(findTestObject('Pages/Screening Object/Update screening score/User_select_contact'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Pages/Recruitment Action Object/Start recruitment/span_Start Process'))

WebUI.scrollToElement(findTestObject('Pages/Delivery Object/Delivery record/span_Start Marketing'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Pages/Delivery Object/Delivery record/span_Start Marketing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Delivery Object/Delivery record/select_NewReady'), 
    'Ready', true)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.enhancedClick(findTestObject('Pages/Delivery Object/Delivery record/button_Submit'))

//======================================================Validation=============================================================
String Delivery_status = WebUI.getText(findTestObject('Field Validations/7. Master stage _ Delivery/Delivery status as Ready'))

println(Delivery_status)

WebUI.scrollToElement(findTestObject('Field Validations/7. Master stage _ Delivery/system information'), 3)

String Contact_Master_stage = WebUI.getText(findTestObject('Field Validations/7. Master stage _ Delivery/Delivery_masterstage'))

println(Contact_Master_stage)

if (Contact_Master_stage.equals('Staging') && Delivery_status.equals('Ready')) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

