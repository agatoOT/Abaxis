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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_Select patient_info__titl'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_Trisky'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/div_Assign Patient ResetTrisky'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/h4_Select test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_cPL Rapid Test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_FeLV_Fiv Rapid Test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_Lyme Rapid Test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_Flex4 Rapid Test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_Heartworm Rapid Test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/button_Ok'))

WebUI.delay(2)

