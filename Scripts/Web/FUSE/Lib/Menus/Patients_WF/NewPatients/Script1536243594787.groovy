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

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_Reset_list-block__col'))

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/md-input-container_Name'))

WebUI.setText(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/input_Patient ID_newId'), GlobalVariable.DataInfoID)

WebUI.setText(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/input_Name_name'), GlobalVariable.DataInfoID)

WebUI.delay(5)

toString()

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/button_Abbreviated history_md-'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/div_SpeciesSpeciesAFRICANGRAYA'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/md-input-container_Abbreviated'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/input_Owner_owner'), 'ale')

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/li_Alex1 Gato'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/select_SpeciesAFRICANGRAYALLIG'), 
    'DEER', true)

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/div_Name'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/select_GenderMaleFemaleMale Ne'), 
    'M', true)

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/div_SpeciesSpeciesAFRICANGRAYA'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/input_Breed_breed'), 'aaaa')

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/fieldset_Name'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/textarea_Abbreviated history_a'), 'aaaa')

WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/span_Save'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Abaxis VetScan Fuse/md-input-container_Patient ID'))

