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

WebUI.navigateToUrl('https://secure2.playpark.com/register/registSelect.aspx?game=PP&_gl=1*127d5yx*_up*MQ..*_ga*MTQwMjQzNjE4Mi4xNjc4MzUxOTI4*_ga_62BHE60GVL*MTY3ODM1MTkyNi4xLjEuMTY3ODM1MTkyNi42MC4wLjA.*_ga_7Q4YSGKZ7G*MTY3ODM1MTkyOC4xLjAuMTY3ODM1MTkyOC4wLjAuMA..&_ga=2.186958376.1226505944.1678351926-955886779.1678351926')

WebUI.verifyTextPresent('สมัคร PlayID', false)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'PlayID Member Register - Select Register', false)

WebUI.click(findTestObject('RegisterPlayPark/BT-RS-Phone'))

WebUI.click(findTestObject('RegisterPlayPark/BT-Local'))

WebUI.click(findTestObject('RegisterPlayPark/Select-Local'))

WebUI.setText(findTestObject('RegisterPlayPark/phone'), '0622051697')

WebUI.sendKeys(findTestObject('RegisterPlayPark/phone'), Keys.chord(Keys.ENTER))

phoneTH = WebUI.getAttribute(findTestObject('RegisterPlayPark/phone'), 'value')

WebUI.verifyMatch(phoneTH, '+860622051697', false)

WebUI.setText(findTestObject('RegisterPlayPark/phonePassword'), 'B6CE4C66')

WebUI.sendKeys(findTestObject('RegisterPlayPark/phonePassword'), Keys.chord(Keys.ENTER))

createPW = WebUI.getAttribute(findTestObject('RegisterPlayPark/phonePassword'), 'value')

WebUI.verifyMatch(createPW, 'B6CE4C66', false)

WebUI.setText(findTestObject('RegisterPlayPark/phonePassword-Again'), 'B6CE4C66')

WebUI.sendKeys(findTestObject('RegisterPlayPark/phonePassword-Again'), Keys.chord(Keys.ENTER))

createPWA = WebUI.getAttribute(findTestObject('RegisterPlayPark/phonePassword-Again'), 'value')

WebUI.verifyMatch(createPWA, 'B6CE4C66', false)

WebUI.verifyElementNotChecked(findTestObject('RegisterPlayPark/cheackbox-RS-phone'), 0)

WebUI.click(findTestObject('RegisterPlayPark/cheackbox-RS-phone'))

WebUI.verifyElementClickable(findTestObject('RegisterPlayPark/cheackbox-RS-phone'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

