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

//Call Login TestCase
Mobile.callTestCase(findTestCase('ValidLogin'), null)

//Click on First Item
Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView -'), 10)
Mobile.tap(findTestObject('Object Repository/android.widget.TextView -'), 0)

//Click on Show All Favorites
Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Show all my Favorites'), 0)

//Verify that the Gradient 1 has been added to list
Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - Gradient 1'), 0)

//CLick on Clear All
Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Clear All'), 0)

//Verify that the gradient has been removed
Mobile.tap(findTestObject('Object Repository/android.widget.TextView -  - Nothing to See Here -'), 0)
Mobile.verifyElementText(findTestObject('Object Repository/android.widget.TextView -  - Nothing to See Here -'), GlobalVariable.txtClearAll, FailureHandling.STOP_ON_FAILURE)

//Close App
Mobile.closeApplication()

