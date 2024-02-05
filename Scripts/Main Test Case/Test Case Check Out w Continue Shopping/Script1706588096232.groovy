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

WebUI.callTestCase(findTestCase('Common Test Case/Test Case Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Onesie'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1 (1)'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_1 (1)'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_2'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_3'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_firstName (2)'), 'Kiki')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_lastName (2)'), 'Pratama')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_postalCode (2)'), '17450')

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_continue (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish (2)'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back Home (2)'))

WebUI.callTestCase(findTestCase('Common Test Case/Test Case Logout v2'), [:], FailureHandling.STOP_ON_FAILURE)

