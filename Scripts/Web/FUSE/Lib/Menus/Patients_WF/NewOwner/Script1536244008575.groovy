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

WebUI.callTestCase(findTestCase('Web/FUSE/Lib/Menus/Patients_WF/Patients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/a_sidebar__slider__arrowlink'))

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/span_New Owner'))

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_firstName'), 'Alex1')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_lastName'), 'Gato')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_email'), 'agato@opentrends.net')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_mobilePhone'), '66666666')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_homePhone'), '66666666')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_workPhone'), '66666666')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_address'), 'aaaaaaaaa')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/input_location'), 'aaaaaaaa')

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/WEB/FUSE/WF1/PatientsWF/Page_Abaxis VetScan Fuse/span_Save'))

WebUI.callTestCase(findTestCase('Web/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

