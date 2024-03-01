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

WebUI.navigateToUrl('https://rev2--revqa.sandbox.lightning.force.com/lightning/o/Contact/list?filterName=Recent')

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/mark_Report17'))

WebUI.disableSmartWait()

WebUI.doubleClick(findTestObject('Pages/Placement Object/Update Placement/span_SCR-00494692Open SCR-00494692 Preview'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

//=========================================
WebUI.click(findTestObject('Object Repository/Pages/Placement Object/Update Placement/a_Related'))

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('Pages/Placement Object/Update Placement/h2_Interviews(1)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Pages/Placement Object/Update Placement/span_PLACE-00039748Open PLACE-00039748 Preview'))

WebUI.delay(3)

String PlacementUrl = WebUI.getUrl()

println(PlacementUrl)

String[] Edit_placement_Url = PlacementUrl.split('/')

String replacevalue = Edit_placement_Url[7]

Edit_placement = PlacementUrl.replaceAll(replacevalue, 'edit')

WebUI.navigateToUrl(Edit_placement)

WebUI.enableSmartWait()

WebUI.doubleClick(findTestObject('Pages/Placement Object/Update Placement/button_Assigned'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Placement Object/Update Placement/button_Assigned'))

WebUI.click(findTestObject('Pages/Placement Object/Update Placement/span_On Project'))

WebUI.delay(3)

WebUI.click(findTestObject('Pages/Placement Object/Update Placement/button_--None--'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pages/Placement Object/Update Placement/span_Higher Education'))

WebUI.sendKeys(findTestObject('Object Repository/Pages/Placement Object/Update Placement/input__TentativePOEndDate__c'), 
    '1/11/2023')

WebUI.click(findTestObject('Pages/Placement Object/Update Placement/button_--None-- (1)'))

WebUI.click(findTestObject('Pages/Placement Object/Update Placement/button_--None-- (1)'))

//WebUI.click(findTestObject('Object Repository/Pages/Placement Object/Update Placement/span_9'))
//WebUI.click(findTestObject('Object Repository/Pages/Placement Object/Update Placement/button_--None--_1'))
WebUI.click(findTestObject('Placement/Update placement record/Page_PLACE-00039774  Placement  Salesforce/lightning-base-combobox-item_Yes'))

WebUI.click(findTestObject('Object Repository/Pages/Placement Object/Update Placement/button_Save'))

