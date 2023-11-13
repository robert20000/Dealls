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

WebUI.navigateToUrl('https://dealls.com/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Search Kata Kunci Valid dan Related/Page_Dealls  Indonesias 1 Career Portal/svg_Squad Game_absolute right-4 top-4 mr-0'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Search Kata Kunci Valid dan Related/Page_Dealls  Indonesias 1 Career Portal/svg'))

WebUI.setText(findTestObject('Object Repository/Search Kata Kunci Valid dan Related/Page_Dealls  Indonesias 1 Career Portal/input_Rp256 jt_globalSearch'), 
    'Front End Engineer')

WebUI.sendKeys(findTestObject('Object Repository/Search Kata Kunci Valid dan Related/Page_Dealls  Indonesias 1 Career Portal/input_Rp256 jt_globalSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Search Kata Kunci Valid dan Related/Page_Search  Dealls/h5_Jobs related to Front End Engineer are n_20ef31'), 
    'Jobs related to "Front End Engineer" are not here yet, but\nwe\'ll take notes & work them out for you 🙏🏻😀')

WebUI.scrollToPosition(0, 1000)

WebUI.verifyElementText(findTestObject('Object Repository/Search Kata Kunci Valid dan Related/Page_Search  Dealls/h4_You might also be interested in these'), 
    'You might also be interested in these')

WebUI.verifyElementText(findTestObject('Object Repository/Search Kata Kunci Valid dan Related/Page_Search  Dealls/div_Full Stack Engineer'), 
    'Full Stack Engineer')

