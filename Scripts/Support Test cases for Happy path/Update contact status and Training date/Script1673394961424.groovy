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

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), findTestData('Contact_Name').getValue(
        1, 2))

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/mark_Report17'))

String contactUrl = WebUI.getUrl()

String[] Edit_Url = contactUrl.split('/')

String editvalue = Edit_Url[7]

Edit_Contact = contactUrl.replaceAll(editvalue, 'edit')

WebUI.navigateToUrl(Edit_Contact)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Pages/Manual Update Object/Update contact status and training date/a_Offer Sent'), 
    0)

WebUI.click(findTestObject('Object Repository/Pages/Manual Update Object/Update contact status and training date/a_Offer Sent'))

WebUI.click(findTestObject('Object Repository/Pages/Manual Update Object/Update contact status and training date/a_Offer Signed'))

WebUI.click(findTestObject('Object Repository/Pages/Manual Update Object/Update contact status and training date/button_Save'))

WebUI.enableSmartWait()

WebUI.scrollToElement(findTestObject('Field Validations/5. Assign Training/additional contact details'), 2)

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/span_TA-00055051'))

WebUI.delay(5)

String Training_AssignmentUrl = WebUI.getUrl()

println(Training_AssignmentUrl)

String[] TA_Edit_Url = Training_AssignmentUrl.split('/')

String replacevalue = TA_Edit_Url[7]

Edit_Training_Assignment = Training_AssignmentUrl.replaceAll(replacevalue, 'edit')

WebUI.navigateToUrl(Edit_Training_Assignment)

WebUI.delay(3)

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/a_Pending'))

WebUI.delay(3)

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/a_Assigned'))

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/Training assignment button_Save'))

//===========================================================Training=============================================================================
WebUI.enableSmartWait()

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/span_TRNG-00001666'))

WebUI.delay(5)

String Training_Url = WebUI.getUrl()

println(Training_Url)

String[] Training_Edit_Url = Training_Url.split('/')

String replacevalue1 = Training_Edit_Url[7]

Edit_Training = Training_Url.replaceAll(replacevalue1, 'edit')

WebUI.navigateToUrl(Edit_Training)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Pages/Manual Update Object/Update contact status and training date/input__100594a'), 
    0)

WebUI.enhancedClick(findTestObject('Pages/Manual Update Object/Update contact status and training date/input__100594a'))

//WebUI.sendKeys(findTestObject('Pages/Manual Update Object/Update contact status and training date/input__100594a'), findTestData(
//      'Training').getValue(1, 4))
WebUI.click(findTestObject('Object Repository/Pages/Manual Update Object/Update contact status and training date/a_Go to previous month (1)'))

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/span_7'))

WebUI.click(findTestObject('Pages/Manual Update Object/Update contact status and training date/button_Save (1)'))

