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

'start to login as respective users'
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Gabriel Santosh')

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user_search_result'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.doubleClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(6)

WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

TestObject global_search = findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90')

WebUI.sendKeys(global_search, Keys.chord(Keys.ENTER))

WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/Select_placement_contact'))

WebUI.delay(3)

String Current_contact_url = WebUI.getUrl()

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('Field Validations/5. Assign Training/additional contact details'), 2)

WebUI.click(findTestObject('Pages/Submital Object/Submital field'))

WebUI.delay(1)

WebUI.mouseOverOffset(findTestObject('Pages/Interview Object/Create Interview/button_Start Process'), 0, 0)

WebUI.clickOffset(findTestObject('Pages/Interview Object/Create Interview/button_Start Process'), 0, 0)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Pages/Placement Object/Create Placement Record/span_Create Placement'))

WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/pay_policy'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Pages/Placement Object/Create Placement Record/pay_policy'), 'STANDARD')

WebUI.delay(2)

//WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/Pay Policy_option'), FailureHandling.STOP_ON_FAILURE)
WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/choose_paypolicy'))

//WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/BDM'))

//WebUI.sendKeys(findTestObject('Pages/Placement Object/Create Placement Record/BDM'), 'Terry')

//WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/BDM User'))

//WebUI.delay(2)

//WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/Support BDM'))

//WebUI.sendKeys(findTestObject('Pages/Placement Object/Create Placement Record/Support BDM'), 'gabriel')

//WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/Support BDM User'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Pages/Placement Object/Create Placement Record/Accounting person'), 'QA Test Business Contact 1')

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/Pages/Placement Object/Create Placement Record/div_BA testing contact1'))

WebUI.setText(findTestObject('Object Repository/Pages/Placement Object/Create Placement Record/Client reporting manager'), 
    'QA Test Business Contact 1')

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/client reporting manager option'))

WebUI.setText(findTestObject('Object Repository/Pages/Placement Object/Create Placement Record/End Client'), findTestData(
        'Create opportunity').getValue(1, 1))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/option_Sanity Test Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Placement Object/Create Placement Record/select_--None--9 months 1500 hrs12 months 2_c407a5'), 
    '9 months/ 1500 hrs', true)

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/placement_startdate'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Pages/Placement Object/Create Placement Record/placement_startdate'), 'Dec 5, 2023')

WebUI.setText(findTestObject('Object Repository/Pages/Placement Object/Create Placement Record/Bill Rate'), '12')

WebUI.delay(2)

//WebUI.selectOptionByValue(findTestObject('Pages/Placement Object/Create Placement Record/Employe category'), 'Higher Education', 
//    false)
WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/location type'))

WebUI.selectOptionByValue(findTestObject('Pages/Placement Object/Create Placement Record/location type'), 'Reporting Site', 
    true)

WebUI.setText(findTestObject('Pages/Placement Object/Create Placement Record/Worklocation'), 'California')

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Pages/Placement Object/Create Placement Record/div_Remote_California'))

WebUI.doubleClick(findTestObject('Pages/Placement Object/Create Placement Record/button_Save'))

WebUI.delay(6)

WebUI.click(findTestObject('Field Validations/9. Master stage_Placement/Related Tab'))

WebUI.click(findTestObject('Field Validations/9. Master stage_Placement/Placement tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

String Placement_record = WebUI.getText(findTestObject('Field Validations/9. Master stage_Placement/Placement record'))

WebUI.delay(2)

println(Placement_record)

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.navigateToUrl(Current_contact_url)

String Placement_start_date = WebUI.getText(findTestObject('Field Validations/9. Master stage_Placement/Placement start date'))

println(Placement_start_date)

WebUI.scrollToElement(findTestObject('Field Validations/1. Master stage_Qualifying/Quick link section'), 2)

String last_placement = WebUI.getText(findTestObject('Field Validations/9. Master stage_Placement/Last Placement'))

println(last_placement)

if (!(Placement_start_date.isEmpty()) && Placement_record.equals(last_placement)) {
    println('Field validation woring properly')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

