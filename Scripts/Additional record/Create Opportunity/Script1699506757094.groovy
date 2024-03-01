import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pages/Login Object/div_App Launcher'))

WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/Pages/Training Object/Training Location and Room/div_View profile_slds-r8'))
WebUI.sendKeys(findTestObject('Pages/Login Object/input_Search apps and items_input-90'), 'Opportunities')

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/div_Opportunities'))

WebUI.click(findTestObject('Pages/Opportunity Object/a_New'))

WebUI.setText(findTestObject('Pages/Opportunity Object/select account'), findTestData('Create opportunity').getValue(1, 
        1))

WebUI.doubleClick(findTestObject('Pages/Opportunity Object/span_TestingXperts'))

//WebUI.click(findTestObject('Pages/Opportunity Object/input__Name'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.sendKeys(findTestObject('Pages/Opportunity Object/input__Name'), findTestData('Create opportunity').getValue(2, 1))

WebUI.mouseOver(findTestObject('Pages/Opportunity Object/opp_stage_field'))

WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/opp_stage_field'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Pages/Opportunity Object/Opp_stage'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Opportunity Object/input__CloseDate'))

WebUI.sendKeys(findTestObject('Pages/Opportunity Object/Opportunity close date'), '2/7/2024')

WebUI.scrollToElement(findTestObject('Object Repository/Pages/Opportunity Object/inputcombobox-input-501'), 2)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Pages/Opportunity Object/inputcombobox-input-501'), 'Demo21Automation21 TestContact21')

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Opportunity Object/span_AutoLead37 contact37 testing37'))

WebUI.delay(2)

//WebUI.scrollToElement(findTestObject('Pages/Opportunity Object/Primary technology field'), 2)
//WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/Primary technology field'), FailureHandling.STOP_ON_FAILURE)
//WebUI.delay(2)
//'testing'
//WebUI.doubleClick(findTestObject('Pages/Opportunity Object/primary_technology'))
//WebUI.doubleClick(findTestObject('Pages/Opportunity Object/span_Appian'))
//WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Pages/Opportunity Object/Type'), 2)

WebUI.click(findTestObject('Pages/Opportunity Object/Type'))

WebUI.doubleClick(findTestObject('Object Repository/Pages/Opportunity Object/span_Alumni Placement'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/Service line'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/Service line'))

WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/service line option'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Pages/Opportunity Object/input__combobox-input-864'), findTestData('Create opportunity').getValue(
        3, 1))

WebUI.click(findTestObject('Pages/Opportunity Object/primary contact search'))

WebUI.delay(2)

'commit'
WebUI.scrollToElement(findTestObject('Pages/Opportunity Object/button_--None--'), 2)

WebUI.sendKeys(findTestObject('Pages/Opportunity Object/input_Amount_Amount'), findTestData('Create opportunity').getValue(
        4, 1))

WebUI.setText(findTestObject('Object Repository/Pages/Opportunity Object/input_OriginalQuantity__c'), '15')

WebUI.scrollToElement(findTestObject('Pages/Opportunity Object/Cohort required'), 2)

WebUI.click(findTestObject('Pages/Opportunity Object/Cohort required'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Opportunity Object/cohort_value'))

WebUI.scrollToElement(findTestObject('Object Repository/Pages/Opportunity Object/Placement type field'), 2)

WebUI.click(findTestObject('Object Repository/Pages/Opportunity Object/Placement type field'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pages/Opportunity Object/span_C2H - 3'))

WebUI.click(findTestObject('Pages/Opportunity Object/operating_country'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/OperatingCountry_value'))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Opportunity Object/input_Billing Amount_BillingAmount__c'), findTestData(
        'Create opportunity').getValue(5, 1))

WebUI.scrollToElement(findTestObject('Object Repository/Pages/Opportunity Object/input_SOWSigned__c'), 3)

WebUI.click(findTestObject('Object Repository/Pages/Opportunity Object/input_SOWSigned__c'))

WebUI.enhancedClick(findTestObject('Pages/Opportunity Object/inputcombobox-input-479'), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Pages/Opportunity Object/Sow Guarantor'), 'ravishankar')

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Opportunity Object/lightning-base-combobox-item_Ravishankar Nr_d16d84'))

WebUI.click(findTestObject('Pages/Opportunity Object/input_SOWSignDate__c'))

WebUI.click(findTestObject('Object Repository/Pages/Opportunity Object/span_7'))

WebUI.sendKeys(findTestObject('Pages/Opportunity Object/SOW Notes'), 'SOW commends')

WebUI.click(findTestObject('Object Repository/Pages/Opportunity Object/button_Save'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

String opportunity_name = WebUI.getText(findTestObject('Pages/Opportunity Object/lightning-formatted-text_Testing Opportunity12'))

println(opportunity_name)

if (opportunity_name.equals(findTestData('Create opportunity').getValue(2, 1))) {
    println('condition passed')
}else {
	KeywordUtil.markFailed('This step intentionally failed')
}

