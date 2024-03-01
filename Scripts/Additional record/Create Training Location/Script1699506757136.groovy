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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Login Object/div_App Launcher'))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/div_View profile_slds-r8'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Pages/Login Object/div_App Launcher'))

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Search apps and items_input-90'), 'Training Locations')

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/b_Training Location'))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/a_New'))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training Location and Room/input_Office Name Help Info_OfficeName__c'), findTestData(
        'Training_Location_Name').getValue(2, 1))

//WebUI.click(findTestObject('Object Repository/Page_New Training Location  Salesforce/slot_Training Location NameOffer Letter Tem_899653'))
WebUI.sendKeys(findTestObject('Pages/Training Object/Training Location and Room/input__LocationPayRate__c'), findTestData('Training_Location_Name').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training Location and Room/input__RelocationAmount__c'), findTestData('Training_Location_Name').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/input__ShippingLocation__c'), findTestData(
        'Training_Location_Name').getValue(5, 1))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training Location and Room/input__ShippingCity__c'), findTestData('Training_Location_Name').getValue(
        6, 1))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/input_HR Coordinator_combobox-input-319'))

WebUI.setText(findTestObject('Pages/Training Object/Training Location and Room/input_HR Coordinator_combobox-input-319'), 
    findTestData('Training_Location_Name').getValue(7, 1))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/lightning-base-combobox-item_UserKovardhani GDirector- HR Operations'))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/input_Staging Manager_combobox-input-325'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Pages/Training Object/Training Location and Room/input_Staging Manager_combobox-input-325'), 
    findTestData('Training_Location_Name').getValue(8, 1))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/input_Approval Process Approver_combobox-input-320'))

WebUI.setText(findTestObject('Pages/Training Object/Training Location and Room/input_Mentor_combobox-input-331'), 
    findTestData('Training_Location_Name').getValue(9, 1))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/mentor selection'))

WebUI.setText(findTestObject('Pages/Training Object/Training Location and Room/input_Approval Process Approver_combobox-input-337'), 
    findTestData('Training_Location_Name').getValue(10, 1))

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/strong_Ravishankar'))

WebUI.setText(findTestObject('Pages/Training Object/Training Location and Room/input_Post-Training Approver_combobox-input-343'), 
    findTestData('Training_Location_Name').getValue(11, 1))

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/strong_External'))

//WebUI.setText(findTestObject('Pages/Training Object/Training Location and Room/input_Recruitment Support Specialist_combob_278a8f'), 
//    findTestData('Training_Location_Name').getValue(12, 1))
//WebUI.click(findTestObject('Object Repository/Page_New Training Location  Salesforce/strong_Russel'))
WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/button_Save'))

WebUI.delay(3)

String TrainingURL = WebUI.getUrl()

String[] Edit_Url = TrainingURL.split('/')

String TrainingLocationID = Edit_Url[6]

CustomKeywords.'myPackage.Create_Training.demoKey'(TrainingLocationID)

// Training room

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/a_Training Rooms'))

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/button_New'))

//WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/input__Name'), FailureHandling.STOP_ON_FAILURE)

//WebUI.sendKeys(findTestObject('Pages/Training Object/Training Location and Room/input__Name'), findTestData('Training_Location_Name').getValue(
//        13, 1))

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/div_Active_slds-form-element__control slds-grow'))

//WebUI.doubleClick(findTestObject('Pages/Training Object/Training Location and Room/input_Active_Active__c'))

//WebUI.sendKeys(findTestObject('Pages/Training Object/Training Location and Room/input__RoomCapacity__c'), findTestData('Training_Location_Name').getValue(
//        14, 1))

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/Room record Save button'))

