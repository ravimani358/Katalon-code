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
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String Master_stage_field_value = 'Training'

String Training_status_field_value = 'Training'

String Placement_type_field_value = 'Internal'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

//============================================================================ select contcat=============
'start to login as respective users'
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Theodore Balashov')

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user_search_result'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.doubleClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(6)

//========================================================================
WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user_search_result'))

WebUI.delay(3)

String Contcat_URL = WebUI.getUrl()

println(Contcat_URL)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.scrollToElement(findTestObject('Field Validations/5. Assign Training/additional contact details'), 2)

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/span_TA-00055051'))

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/span_TRNG-00001666'))

WebUI.doubleClick(findTestObject('Pages/Training Object/First day Attandance/button_Start Process'))

WebUI.mouseOver(findTestObject('Pages/Training Object/First day Attandance/span_First Day Attendance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Pages/Training Object/First day Attandance/span_First Day Attendance'))

// Choose specific contact
String xpath1 = '//div[text()=\''

String contact_name = findTestData('Contact_Name').getValue(1, 2)

String xpath2 = '\']/ancestor::tr//input'

String dynamicXPath = (xpath1 + contact_name) + xpath2

TestObjectProperty property = new TestObjectProperty('xpath', ConditionType.EQUALS, dynamicXPath)

TestObject dynamicTestObject = new TestObject('Dynamic Test Object')

dynamicTestObject.addProperty(property)

WebUI.delay(3)

WebUI.enhancedClick(dynamicTestObject)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.doubleClick(findTestObject('Pages/Training Object/First day Attandance/button_Save'))

//=============================================== Validation ==================================================================
WebUI.delay(10)

WebUI.navigateToUrl(Contcat_URL)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/a_Delivery'))

WebUI.click(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/a_Placements'))

String Placement_type = WebUI.getText(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/span_Internal'))

println(Placement_type)

String Placement_id = WebUI.getText(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/span_PLACE-00043199Open PLACE-00043199 Preview'))

println(Placement_id)

WebUI.click(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/li_HR'))

String Employment_start_date = WebUI.getText(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/lightning-formatted-text_1242023'))

println(Employment_start_date)

WebUI.click(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/a_Details'))

String Training_status = WebUI.getText(findTestObject('Object Repository/Field Validations/6. Firstday Attandance/span_Training'))

println(Training_status)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

String Contact_Master_stage = WebUI.getText(findTestObject('Field Validations/6. Firstday Attandance/Firstday attandance master stage'))

println(Contact_Master_stage)

if ((((Placement_type_field_value.equals(Placement_type) && Placement_id.contains('PLACE')) && !(Employment_start_date.isEmpty())) && 
Training_status.equals(Training_status_field_value)) && Contact_Master_stage.equals(Master_stage_field_value)) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

