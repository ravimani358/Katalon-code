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

WebUI.click(findTestObject('Object Repository/Pages/Login Object/div_App Launcher'))

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/div_View profile_slds-r8'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Pages/Login Object/div_App Launcher'))

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Search apps and items_input-90'), 'Training track')

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Track and Technology/b_Training Track'))

WebUI.click(findTestObject('Pages/Training Object/Training Location and Room/a_New'))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training Track and Technology/input__Name'), findTestData('Trainaing_Track').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training Track and Technology/input__ShortName__c'), findTestData('Trainaing_Track').getValue(
        3, 1))

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Track and Technology/button_--None--'))

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Track and Technology/span_Specialized'))

WebUI.click(findTestObject('Pages/Training Object/Training Track and Technology/technology'))

//WebUI.click(findTestObject('Pages/Training Object/Training Track and Technology/button_--None--'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Pages/Training Object/Training Track and Technology/span_New Technology'))

WebUI.setText(findTestObject('Pages/Training Object/Training Track and Technology/input__112383a'), findTestData('Trainaing_Track').getValue(
        4, 1))

WebUI.click(findTestObject('Pages/Training Object/Training Track and Technology/button_Save'))

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Track and Technology/span_testing'))
WebUI.sendKeys(findTestObject('Pages/Training Object/Training Track and Technology/textarea__input-299'), findTestData('Trainaing_Track').getValue(
        5, 1))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training Track and Technology/textarea__input-351'), findTestData('Trainaing_Track').getValue(
        6, 1))

WebUI.sendKeys(findTestObject('Pages/Training Object/Training Track and Technology/Training track description'), findTestData('Trainaing_Track').getValue(
        7, 1))

WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Track and Technology/Technology Save button'))

WebUI.delay(3)

String Training_Track_name = WebUI.getText(findTestObject('Pages/Training Object/Training Track and Technology/lightning-formatted-text_test1 training1'))

//println(Training_Track_name)

CustomKeywords.'myPackage.Create_Training_Track.demoKey'(Training_Track_name)

