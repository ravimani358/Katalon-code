import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import myPackage.Screenshots as Screenshots
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory


WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Username_username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Password_pw'), GlobalVariable.Password)

WebUI.click(findTestObject('Pages/Login Object/input_Password_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

//============================================================================ select contcat=============
'start to login as respective users'
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.click(findTestObject('Object Repository/Pages/Screening Object/Screening slots/button_Search'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Pages/Screening Object/Screening slots/input_Search_input-90'), 'Tina Ervin')

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user_search_result'))

WebUI.click(findTestObject('Pages/Screening Object/Screening slots/user details button'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'successfully login the screening user'
WebUI.doubleClick(findTestObject('Pages/Screening Object/Screening slots/login button'))

WebUI.delay(6)

//========================================================================
WebUI.navigateToUrl(GlobalVariable.Navigate_URL)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pages/Login Object/div_App Launcher'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Pages/Login Object/input_Search apps and items_input-90'), 'Delivery Management')

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Pages/Delivery Object/Delivery management app/div_Delivery Management'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

WebUI.click(findTestObject('Object Repository/Pages/Delivery Object/Delivery management app/select_AllStaging'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Delivery Object/Delivery management app/select_AllStaging'), 
    'Staging', true)

WebUI.click(findTestObject('Object Repository/Pages/Delivery Object/Delivery management app/select_AllStaging'))

CustomKeywords.'myPackage.Screenshots.captureScreenshot'(GlobalVariable.folderPath, GlobalVariable.screenshot)

//============================================================Validation=============================================================

List<String> tableValues = new ArrayList()

TestObject tableTestObject = findTestObject('Pages/Delivery Object/Delivery management app/deliver app record type value')

List<WebElement> tableCells = WebUI.findWebElements(tableTestObject, 30)

for (WebElement cell : tableCells) {
    tableValues.add(cell.getText())
	//println(cell.getText()) -->if want to understanding the logic just uncommend and print the values
}



String searchString = 'Staging'

if (tableValues.contains(searchString)) {
    System.out.println('Validate all field and conditions are passed')
} else {
    KeywordUtil.markFailed('This step intentionally failed')
}

