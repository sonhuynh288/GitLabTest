import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.comment('Story: Login to CURA system')

WebUI.comment('Given that the user has the valid login information')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.setViewPortSize(1920, 1080)

def viewportWidth = WebUI.executeJavaScript('return window.innerWidth;', null)

def viewportHeight = WebUI.executeJavaScript('return window.innerHeight;', null)

KeywordUtil.logInfo("Viewport Size After Maximize: $viewportWidth x $viewportHeight")

WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)

WebUI.setText(findTestObject('Page_Login/txt_Password'), Password)

WebUI.comment('When he logins to CURA system')

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.comment('Then he should be able to login successfully')

landingPage = WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), GlobalVariable.G_Timeout)

WebUI.closeBrowser()

