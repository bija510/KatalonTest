
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//for selenium
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By as By


	WebUI.openBrowser('http://demo.automationtesting.in/Register.html')
	WebUI.maximizeWindow() 
	
    /*********************************************
	 * import org.openqa.selenium.Keys as Keys
	*********************************************/
	WebUI.sendKeys(findTestObject('Object Repository/DemoAutomationTesting/Register/txt_FirstName'), 'Bija')
	WebUI.sendKeys(findTestObject('Object Repository/DemoAutomationTesting/Register/txt_FirstName'), Keys.chord(Keys.TAB))
	
	WebUI.sendKeys(findTestObject('Object Repository/DemoAutomationTesting/Register/txt_LastName'), Keys.chord(Keys.DIVIDE))
	Thread.sleep(2000)
	
	/*********************************************
	* selenium WebDriver
	* import org.openqa.selenium.WebDriver
	* import org.openqa.selenium.By;
	* import org.openqa.selenium.Keys as Keys
	*********************************************/
	WebDriver driver =DriverFactory.getWebDriver()
	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys(Keys.NUMPAD6)
	
