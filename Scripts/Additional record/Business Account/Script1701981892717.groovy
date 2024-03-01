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

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Search apps and items_input-90'), 'Accounts')

WebUI.doubleClick(findTestObject('Pages/Account Object/Business/select account'))

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/a_New'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Account Object/Business/button_Next'))

WebUI.click(findTestObject('Pages/Account Object/Business/account name'))

WebUI.setText(findTestObject('Pages/Account Object/Business/account name'), findTestData('Create opportunity').getValue(
        1, 1))

WebUI.setText(findTestObject('Pages/Account Object/Business/Click SBDM'), 'Alex Wise')

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/div_Alexandra Gilroy'))

WebUI.setText(findTestObject('Object Repository/Pages/Account Object/Business/input_Support BDM_2092393a'), 'Terry')

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/div_Terry Ahmed'))

WebUI.scrollToElement(findTestObject('Pages/Account Object/Business/MSA Section table'), 3)

WebUI.click(findTestObject('Pages/Account Object/Business/button_--None--'))

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/span_Signed'))

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/input_MSA Signed Date_MSA_Signed_Date__c'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Account Object/Business/span_22'))

WebUI.setText(findTestObject('Object Repository/Pages/Account Object/Business/input_MSA Signer Contact_combobox-input-610'), 
    'autolead2 contact4')

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/lightning-base-combobox-formatted-text_Auto_a138be'))

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/input_MSA Expiration Date_MSAExpirationDate__c'))

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Account Object/Business/span_6'))

WebUI.click(findTestObject('Object Repository/Pages/Account Object/Business/button_Save'))

