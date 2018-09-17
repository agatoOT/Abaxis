import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Main Screen \r\n'
not_run: WebUI.click(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/div_Clinics'))

'Main Screen '
not_run: WebUI.click(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/div_Versions'))

'Main Screen '
not_run: WebUI.click(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/div_Tests'))

'Main Screen '
not_run: WebUI.click(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/div_Users'))

'Main Screen '
not_run: WebUI.click(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/div_Statistics'))

'Main Screen '
not_run: WebUI.click(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/div_Lots'))

