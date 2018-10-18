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

WebUI.callTestCase(findTestCase('Web/FUSE/Lib/Menus/Patients_WF/Patients'), [:], FailureHandling.STOP_ON_FAILURE)

for (def index : (0..GlobalVariable.DF_IntUsers)) {
    WebUI.click(findTestObject('Object Repository/WEB/FUSE/WF1/Prueba3/Prueba4/Page_Abaxis VetScan Fuse/button_New Patient'))

    ID = WebUI.concatenate((([GlobalVariable.Data_InfoID, index]) as String[]), FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.click(findTestObject('Object Repository/WEB/FUSE/WF1/Prueba3/Page_Abaxis VetScan Fuse/input_Patient ID_newId'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('WEB/FUSE/WF1/Prueba3/Prueba4/Page_Abaxis VetScan Fuse/input_Patient ID_newId'), ID)

    Name = WebUI.concatenate((([GlobalVariable.Data_InfoName, index]) as String[]), FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.click(findTestObject('WEB/FUSE/WF1/Prueba3/Prueba4/Page_Abaxis VetScan Fuse/input_Name_name'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('WEB/FUSE/WF1/Prueba3/Prueba4/Page_Abaxis VetScan Fuse/input_Name_name'), Name)

    WebUI.click(findTestObject('Object Repository/WEB/FUSE/WF1/Prueba3/Prueba4/Page_Abaxis VetScan Fuse/button_Save'))

    not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/p_A patient with this ID alrea'), 
        'A patient with this ID already exists. Please provide another one', FailureHandling.CONTINUE_ON_FAILURE)

    not_run: WebUI.click(findTestObject('Object Repository/WEB/FUSE/WF1/Prueba3/Prueba4/Page_Abaxis VetScan Fuse/button_Cancel'))
}

