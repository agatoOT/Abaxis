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

WebUI.click(findTestObject('WEB/BO FUSE/Page_VetScan FUSE - Backoffice/a_NewUser'))

WebUI.setText(findTestObject('WEB/BO FUSE/Page_VetScan FUSE - Backoffice/input_userName'), GlobalVariable.G_BO_user)

WebUI.setEncryptedText(findTestObject('WEB/BO FUSE/Page_VetScan FUSE - Backoffice/input_password'), GlobalVariable.G_BO_password)

WebUI.setText(findTestObject('WEB/BO FUSE/Page_VetScan FUSE - Backoffice/input_email'), GlobalVariable.G_BO_email)

WebUI.selectOptionByValue(findTestObject('WEB/BO FUSE/Page_VetScan FUSE - Backoffice/select_Abaxis AdminAbaxis EngA'), '1', 
    true)

WebUI.click(findTestObject('WEB/BO FUSE/Page_VetScan FUSE - Backoffice/button_Save'))

not_run: WebUI.click(findTestObject('WEB/BO FUSE/Page_VetScan FUSE - Backoffice/a_Cancel'))

