import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

String Master_stage_field_value = 'Qualifying'

String Qualification_status_field_value = 'New'

String Operating_country_field_value = 'United States'

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/a_New'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.delay(1)

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/button_Next'))

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/input_First Name_firstName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/input_First Name_firstName'), findTestData('Create_contact').getValue(
        1, 1))

WebUI.delay(1)

WebUI.setText(findTestObject('Pages/Contact Object/Record type as Revature/input__lastName'), findTestData('Create_contact').getValue(2, 1))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Pages/Contact Object/Record type as Revature/System information scroll'), 3)

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/button_--None--'))

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/span_Qualifying'))

WebUI.setText(findTestObject('Pages/Contact Object/Record type as Revature/input_Mobile_MobilePhone'), findTestData('Create_contact').getValue(3, 
        1))

WebUI.setText(findTestObject('Pages/Contact Object/Record type as Revature/input_Account Name_combobox-input-1325'), findTestData('Create_contact').getValue(
        4, 1))

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/span_TestingXperts'))

WebUI.setText(findTestObject('Pages/Contact Object/Record type as Revature/input_Email_Email'), findTestData('Create_contact').getValue(5, 1))

WebUI.scrollToElement(findTestObject('Pages/Contact Object/Record type as Revature/button_--None--_1'), 0)

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/button_--None--_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/Qualifying status as New'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Pages/Contact Object/Record type as Revature/Gender button_--None--'), 0)

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/Gender button_--None--'))

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/contact_gender_Male'))

WebUI.scrollToElement(findTestObject('Pages/Contact Object/Record type as Revature/Work auth button_--None--_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/Work auth button_--None--_1'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/span_U.S. Citizen'))

WebUI.scrollToElement(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/operating country button_--None--_1'), 0)

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/operating country button_--None--_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/span_United States'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/button_Save'))

WebUI.delay(3)

String contact_name = WebUI.getText(findTestObject('Object Repository/Pages/Contact Object/Record type as Revature/Contact_fullname'))

println(contact_name)

CustomKeywords.'myPackage.WriteExcel.demoKey'(contact_name)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/Quick link section'), 3)

String First_Object_reference_object = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/First Object reference object'))

println(First_Object_reference_object)

String Last_Object_reference_object = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/Last object reference object'))

println(Last_Object_reference_object)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

String Contact_Master_stage = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/Master stage as Qualifying'))

println(Contact_Master_stage)

String Qualification_status = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Qualiying status as New'))

println(Qualification_status)

String operating_country = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/Operating Country'))

println(operating_country)

String company_name = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Contact Record Type'))

println(company_name)

if ((((Master_stage_field_value.equals(Contact_Master_stage) && Qualification_status.equals(Qualification_status_field_value)) && 
operating_country.equals('United States')) && !(First_Object_reference_object.isEmpty())) && !(Last_Object_reference_object.isEmpty())) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

