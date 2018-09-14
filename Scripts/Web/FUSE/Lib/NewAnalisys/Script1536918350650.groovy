import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.scrollToElement(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/button_New Test'), 0)

WebUI.click(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/button_New Test'))

WebUI.delay(3)

WebUI.click(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/div_Select patient'))

WebUI.click(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/span_Select patient_btn--helpe'))

WebUI.click(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/div_Roger OTHER 1234'))

not_run: WebUI.selectOptionByLabel(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/label_cPL Rapid Test'), 
    'cPL Rapid Test', false)

WebUI.clickImage(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/label_cPL Rapid Test'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/button_Next'), 0)

WebUI.click(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/button_Next'))

WebUI.click(findTestObject('WEB/FUSE/WF1/Prueba/Page_Abaxis VetScan Fuse/button_Order Test'))

