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

WebUI.click(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/a_New Clinic'))

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_Name _name'), 
    'Auto')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_License number _licenseN'), 
    'VFU000033')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_Phone number_phoneNumber'), 
    '66666666')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_Country _country'), 
    'aaaaaaaaaa')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_State _state'), 
    'aaaaaaaaaa')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_City_city'), 
    'aaaaaaaaaa')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_Address_address'), 
    'aaaaaaaaaa')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_Postcode_postcode'), 
    'aaaaaaaaaa')

WebUI.setText(findTestObject('Object Repository/WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_Name _admin1Name'), 
    'aaaaa')

WebUI.setText(findTestObject('WEB/BO VUE/WF1/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/Page_VetScan VUE - Backoffice/input_Email _admin1Email'), 
    'agato@opentrends.net')

