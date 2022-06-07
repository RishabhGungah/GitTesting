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

//Open Application
Mobile.startApplication(GlobalVariable.GradientApp, true)

//Click on Login with instagram
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - Login with instagram'), 10)
Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Login with instagram'), 5)

//Click on Not your account link
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - Not your account'), 10)
Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Not your account'), 0)

//Input email
Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), GlobalVariable.email, 5)

//Input password
Mobile.setText(findTestObject('Object Repository/android.widget.EditText (1)'), 'Testing123', 5)

//Click on Login on Webview
Mobile.tap(findTestObject('Object Repository/android.widget.Button - Log In'), 0)

//Close App
//Mobile.closeApplication()