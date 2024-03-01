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

String assignment_rule = 'AR'

String Master_stage_field_value = 'Qualifying'

String Qualification_status_field_value = 'New'

String Operating_country_field_value = 'United States'

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Pages/Login Object/input_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rev2--revqa.sandbox.lightning.force.com/lightning/page/home?0.source=alohaHeader')

WebUI.click(findTestObject('Object Repository/Pages/Login Object/div_App Launcher'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Search apps and items_input-90'), 'Lead')

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.enhancedClick(findTestObject('Pages/Lead Object/select lead'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Pages/Lead Object/a_New'))

WebUI.click(findTestObject('Pages/Lead Object/button_Next'))

WebUI.setText(findTestObject('Pages/Lead Object/input_firstName'), findTestData('Lead_creation').getValue(1, 1))

WebUI.setText(findTestObject('Pages/Lead Object/input_lastName'), findTestData('Lead_creation').getValue(2, 1))

WebUI.scrollToElement(findTestObject('Pages/Lead Object/lead qualification status field'), 3)

WebUI.click(findTestObject('Pages/Lead Object/lead qualification status field'))

WebUI.click(findTestObject('Pages/Lead Object/Status as RQL'))

WebUI.scrollToElement(findTestObject('Pages/Lead Object/input_Email'), 3)

WebUI.click(findTestObject('Object Repository/Pages/Lead Object/input_Email'))

WebUI.setText(findTestObject('Pages/Lead Object/input_Email'), findTestData('Lead_creation').getValue(3, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Lead Object/input_MobilePhone'), findTestData('Lead_creation').getValue(
        4, 1))

WebUI.scrollToElement(findTestObject('Pages/Lead Object/Work authorization'), 3)

WebUI.click(findTestObject('Pages/Lead Object/Work authorization'))

WebUI.click(findTestObject('Pages/Lead Object/span_U.S. Citizen'))

WebUI.scrollToElement(findTestObject('Pages/Lead Object/Operating_country'), 2)

WebUI.enhancedClick(findTestObject('Pages/Lead Object/Operating_country'))

WebUI.click(findTestObject('Pages/Lead Object/span_United States'))

WebUI.scrollToElement(findTestObject('Pages/Lead Object/inputcombobox-input-1157'), 3)

WebUI.click(findTestObject('Pages/Lead Object/inputcombobox-input-1157'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Pages/Lead Object/inputcombobox-input-1157'), findTestData('Lead_creation').getValue(5, 1))

WebUI.click(findTestObject('Object Repository/Pages/Lead Object/span_Computer - programming'))

WebUI.scrollToElement(findTestObject('Object Repository/Pages/Lead Object/button_--None--_1_2'), 2)

WebUI.click(findTestObject('Object Repository/Pages/Lead Object/button_--None--_1_2'))

WebUI.click(findTestObject('Object Repository/Pages/Lead Object/span_Manual'))

WebUI.setText(findTestObject('Object Repository/Pages/Lead Object/input_Company'), findTestData('Lead_creation').getValue(
        6, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Lead Object/input_MarketingProgram__c'), findTestData('Lead_creation').getValue(
        7, 1))

WebUI.scrollToElement(findTestObject('Pages/Lead Object/button_Save'), 3)

WebUI.click(findTestObject('Pages/Lead Object/button_Save'))

WebUI.delay(12)

WebUI.refresh()

url = WebUI.getUrl()

println(url)

//============================================= Start validation the record===============================
if (url.contains('Contact')) {
    WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/Quick link section'), 3)

    // ----------------------------->as of now last activity date are not populated
    String First_Object_reference_object = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/First Object reference object'))

    println(First_Object_reference_object)

    String Last_Object_reference_object = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/Last object reference object'))

    println(Last_Object_reference_object)

    WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

    String Contact_Master_stage = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Master stage as Qualifying'))

    println(Contact_Master_stage)

    String Qualification_status = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Qualiying status as New'))

    println(Qualification_status)

    String operating_country = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Operating Country'))

    println(operating_country)

    String company_name = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Contact Record Type'))

    println(company_name)

    // -------------------->as of now no task are created so that i commented those line
    //WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/Activity'))
    //String Initia_Contact_Task = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Initial Contact Task'))
    //println(Initia_Contact_Task)
    WebUI.enhancedClick(findTestObject('Field Validations/1. Master stage_Qualifying/Marketing Tab'))

    WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/Lead assignment system info tab'), 
        3)

    String ExpectedAssignment_rule = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Assignment Rule'))

    println(ExpectedAssignment_rule)

    if (((((Master_stage_field_value.equals(Contact_Master_stage) && Qualification_status.equals(Qualification_status_field_value)) && 
    operating_country.equals('United States')) && !(First_Object_reference_object.isEmpty())) && !(Last_Object_reference_object.isEmpty())) && 
    assignment_rule.equals(ExpectedAssignment_rule)) {
        System.out.println('Validate all field and conditions are passed')
    } // ----------------------------->as of now last activity date are not populated
    //String Last_Activity_Date = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Recruitment Last Activity Date'))
    //println(Last_Activity_Date)
    // -------------------->as of now no task are created so that i commented those line
    //WebUI.enhancedClick(findTestObject('Field Validations/2. Master stage_Recruitment/Activity'))
    //String Initia_Contact_Task = WebUI.getText(findTestObject('Field Validations/2. Master stage_Recruitment/Initial Contact Task'))
    //println(Initia_Contact_Task)
    else {
        KeywordUtil.markFailed('This step intentionally failed')
    }
} else {
    WebUI.delay(12)

    WebUI.refresh()

    WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/Quick link section'), 3)

    String First_Object_reference_object = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/First Object reference object'))

    println(First_Object_reference_object)

    String Last_Object_reference_object = WebUI.getText(findTestObject('Field Validations/1. Master stage_Qualifying/Last object reference object'))

    println(Last_Object_reference_object)

    WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/System Info'), 3)

    String Contact_Master_stage = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Master stage as Qualifying'))

    println(Contact_Master_stage)

    String Qualification_status = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Qualiying status as New'))

    println(Qualification_status)

    String operating_country = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Operating Country'))

    println(operating_country)

    String company_name = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Contact Record Type'))

    println(company_name)

    WebUI.enhancedClick(findTestObject('Field Validations/1. Master stage_Qualifying/Marketing Tab'))

    WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/Lead assignment system info tab'), 
        3)

    String ExpectedAssignment_rule = WebUI.getText(findTestObject('Object Repository/Field Validations/1. Master stage_Qualifying/Assignment Rule'))

    println(ExpectedAssignment_rule)

    if(Master_stage_field_value.equals(Contact_Master_stage) && Qualification_status.equals(Qualification_status_field_value) && operating_country.equals('United States') 
		&& !(First_Object_reference_object.isEmpty()) && !(Last_Object_reference_object.isEmpty()) && ExpectedAssignment_rule.contains('AR')) {
        System.out.println('Validate all field and conditions are passed')
    } else {
        KeywordUtil.markFailed('This step intentionally failed')
    }
}

