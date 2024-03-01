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
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.Alert as Alert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//import com.kms.katalon.core.webui.keyword.BrowserBuiltInKeywords as Browser
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Rajaraman RJ')

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Pages/Contact Object/Record type as External/Select HR user'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(6, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.mouseOver(findTestObject('Pages/Screening Object/Screening slots/login button'))

'successfully login the screening user'
WebUI.enhancedClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(9)

WebUI.enhancedClick(findTestObject('Pages/Contact Object/Record type as External/Contact'))

WebUI.click(findTestObject('Pages/Contact Object/Record type as Revature/a_New'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/External record type ratio button'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_Next'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_firstName'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_lastName'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Department'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(3, 1))

WebUI.scrollToElement(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_--None--'), 
    3)

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_--None--'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_Full Time'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_--None--_1'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_Yes'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_--None--_1_2_3'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_Male'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_--None--_1_2'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_SGST  CGST'))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_GST_Service_Code__c'), 
    findTestData('External record/External_Trainer_contact_creation').getValue(4, 1))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_--None--'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_United States'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_--None--_1_2_3_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_--None--_1_2_3_4'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_Trainer'))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Trainer_s_Technology__c'), 
    findTestData('External record/External_Trainer_contact_creation').getValue(5, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_PayrollID__c'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(6, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Payment_in_favour_of__c'), 
    findTestData('External record/External_Trainer_contact_creation').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_PAN_Card_Number__c'), 
    findTestData('External record/External_Trainer_contact_creation').getValue(8, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_GST_number__c'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(9, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Bank_Name__c'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(10, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Branch_Name__c'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(11, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_IFSC_Code__c'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(12, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Make_all_checks__c'), 
    findTestData('External record/External_Trainer_contact_creation').getValue(13, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Account_Number__c'), 
    findTestData('External record/External_Trainer_contact_creation').getValue(14, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_MobilePhone'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(15, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_Email'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(16, 1))

WebUI.setText(findTestObject('Pages/Contact Object/Record type as External/Mailing_street'), findTestData('External record/External_Trainer_contact_creation').getValue(
        17, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_city'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(18, 1))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_province'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_California'))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/input_postalCode'), findTestData(
        'External record/External_Trainer_contact_creation').getValue(19, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Contact Object/Record type as External/inputcombobox-input-509'), 
    findTestData('External record/External_Trainer_contact_creation').getValue(20, 1))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/span_Auto Testing9'))

WebUI.click(findTestObject('Object Repository/Pages/Contact Object/Record type as External/button_Save'))

String Contact_name = WebUI.getText(findTestObject('Pages/Contact Object/Record type as External/contact_name'), FailureHandling.STOP_ON_FAILURE)

println(Contact_name)

CustomKeywords.'myPackage.External_contact_name.demoKey'(Contact_name)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

if (Contact_name != null) {
    println('contact created properly')
}

