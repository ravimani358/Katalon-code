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

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/Pages/Login Object/div_App Launcher'))

WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/div_View profile_slds-r8'))
//WebUI.delay(1)
WebUI.sendKeys(findTestObject('Pages/Login Object/input_Search apps and items_input-90'), 'Trainings')

WebUI.doubleClick(findTestObject('Pages/Training Object/Training/div_Trainings'))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/a_New'))

WebUI.click(findTestObject('Pages/Training Object/Training/Training recird type Next button'))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training/Training location name'), findTestData('Training_Location_Name').getValue(
        2, 1))

WebUI.enhancedClick(findTestObject('Pages/Training Object/Training/Training location option'))

WebUI.scrollToElement(findTestObject('Pages/Training Object/Training/input__trainingTarget'), 3)

WebUI.click(findTestObject('Pages/Training Object/Training/input__trainingTarget'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Pages/Training Object/Training/input__trainingTarget'), findTestData('Training').getValue(
        1, 1))

'Training Track value fetch from Excel'
WebUI.enhancedClick(findTestObject('Pages/Training Object/Training/input__input-1581'), FailureHandling.STOP_ON_FAILURE)

'Training Track value fetch from Excel'
WebUI.setText(findTestObject('Pages/Training Object/Training/input__input-1581'), findTestData('Trainaing_Track').getValue(
        1, 2))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Training Object/Training/div_Training Track Testing'))

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training/div_United States'))

WebUI.click(findTestObject('Pages/Training Object/Training/lightning-primitive-icon'))

//WebUI.click(findTestObject('Pages/Training Object/Training/Training status'))
WebUI.enhancedClick(findTestObject('Pages/Training Object/Training/select_PlannedConfirmed'))

WebUI.enhancedClick(findTestObject('Pages/Training Object/Training/Training status option value'))

//WebUI.click(findTestObject('Pages/Training Object/Training/training status as confirmed'))
WebUI.enhancedClick(findTestObject('Pages/Training Object/Training/input__startDate'))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Training Object/Training/input__startDate'), findTestData('Training').getValue(
        3, 1))

WebUI.click(findTestObject('Pages/Training Object/Training/Training end date'))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training/Training end date'), '4/5/2024')

WebUI.enhancedClick(findTestObject('Pages/Training Object/Training/input_Trainer_input-4364'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Pages/Training Object/Training/input_Trainer_input-4364'), findTestData('Training').getValue(
        2, 1))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Pages/Training Object/Training/Select_trainer'))

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training/span_concat(No results found for , , , , )__b075ba'))
//WebUI.click(findTestObject('Pages/Training Object/Training/button_Next'))
//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training/span_Capacity_slds-radio_faux'))
WebUI.click(findTestObject('Pages/Training Object/Training/button_Submit'))

