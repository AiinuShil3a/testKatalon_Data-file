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

WebUI.navigateToUrl('https://www.cloudnative-skill.com/register')

WebUI.verifyTextPresent('Register', false)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Modern Software Development Toolchains', false)

WebUI.setText(findTestObject('Register_Page_Katalon-Test1/Text_Office'), 'สำนักงานใหญ่')

WebUI.sendKeys(findTestObject('Register_Page_Katalon-Test1/Text_Office'), Keys.chord(Keys.ENTER))

Text_Office = WebUI.getAttribute(findTestObject('Register_Page_Katalon-Test1/Text_Office'), 'value')

WebUI.verifyMatch(Text_Office, 'สำนักงานใหญ่', false)

WebUI.verifyElementNotChecked(findTestObject('Register_Page_Katalon-Test1/Checkbox'), 0)

WebUI.click(findTestObject('Register_Page_Katalon-Test1/Click_ADDRESS-1'))

WebUI.verifyElementNotChecked(findTestObject('Register_Page_Katalon-Test1/Not_Clickable'), 0)

WebUI.click(findTestObject('Register_Page_Katalon-Test1/Click_ADDRESS -2'))

WebUI.verifyElementClickable(findTestObject('Register_Page_Katalon-Test1/Clickable'))

WebUI.setText(findTestObject('Register_Page_Katalon-Test1/Birthday_input'), '30/05/2545')

WebUI.sendKeys(findTestObject('Register_Page_Katalon-Test1/Birthday_input'), Keys.chord(Keys.ENTER))

Auto_Age = WebUI.getText(findTestObject('Register_Page_Katalon-Test1/Auto_Age'))

Auto_Age = WebUI.getAttribute(findTestObject('Register_Page_Katalon-Test1/Auto_Age'), 'value')

WebUI.verifyMatch(Auto_Age, '21', false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

