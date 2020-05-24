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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.JavascriptExecutor

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://www.facebook.com/')
	
	WebUI.maximizeWindow()
	String actTitle = WebUI.getWindowTitle()
	String expTitle = 'Facebook - Log In or Sign Up'
	
	WebUI.verifyMatch(actTitle, expTitle, false)
	
	
	
	WebUI.setText(findTestObject('Page_Facebook/input_concat2'), 'bijaya')
	
	WebUI.delay(2)
	
	WebUI.setText(findTestObject('Page_Facebook/input_concat3'), 'chhetri')
	WebDriver driver = DriverFactory.getWebDriver()
	
	/***************************************
	 * Hightlight Textbox with red
	 ****************************************/
//  WebUI.executeJavaScript("arguments[0].style.border='3px solid red'", findTestObject('Page_Facebook/input_concat3'), 'chhetri')
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("arguments[0].style.border='3px solid red'", findTestObject('Page_Facebook/input_concat3'), 'chhetri');
	
	WebUI.setText(findTestObject('Page_Facebook/input_Create Your Accou'), '484111525')
	
	/***************************************
	 * how to settext using java script
	 ****************************************/
	WebElement ele = WebUiCommonHelper.findWebElement(findTestObject('Page_Facebook/input_concat3'), 5)
	WebUI.executeJavaScript("arguments[0].value= 'ChhetriJS' ", Arrays.asList(ele))
	Thread.sleep(3000)
	
	
	
	
	
	WebUI.closeBrowser()
	