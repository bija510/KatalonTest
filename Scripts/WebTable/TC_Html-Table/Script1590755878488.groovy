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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//for selenium
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By;

String tcID = GlobalVariable.gTestCaseId
print "tcID>>>" +tcID
def currentBrowser = DriverFactory.getExecutedBrowser().getName()
println currentBrowser

try {
	WebUI.openBrowser('https://rstudio.github.io/DT/011-radio.html')
	WebUI.maximizeWindow() 
	
	/************************************************
	 * select DDL Using Katalon Built-in function 
	 * https://total-qa.com/selenium/demo-sites/
	 *************************************************/
	
	WebUI.executeJavaScript("window.scrollBy(0, document.body.scrollHeight)", null)
	WebUI.delay(2)
	CustomKeywords.'library.GUI.HTMLTable.selectRowFromTable'(findTestObject('DemoAutomationTesting/WebTable/tbl_web'), 'C', 'Mar')
	
	
	
	
	
	
	


} catch (WebElementNotFoundException e) {
WebUI.takeScreenshot((((GlobalVariable.gScreenshotDir + tcID) +'_Failed_') + CustomKeywords.'allUtilites.impUTILS.get5DigitTimeStamp'())+'.png', FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.logInfo('ERROR:' + e.message)
	KeywordUtil.markFailed(tcID + 'failed, Element not found')

} catch (Exception e) {
	WebUI.takeScreenshot((((GlobalVariable.gScreenshotDir + tcID) +'_Failed_') + CustomKeywords.'allUtilites.impUTILS.get5DigitTimeStamp'())+'.png', FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.logInfo((('ERROR:' + e.message) + '\n Stack trace') + e.stackTrace)
	KeywordUtil.markFailed(tcID + 'failed')

}finally{

//WebUI.closeBrowser()

}