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

for (def index : (0..GlobalVariable.DF_IntUsers)) {
    not_run: ID = WebUI.concatenate((([GlobalVariable.Data_InfoID, index]) as String[]), FailureHandling.STOP_ON_FAILURE)

    not_run: Name = WebUI.concatenate((([GlobalVariable.Data_InfoName, index]) as String[]), FailureHandling.STOP_ON_FAILURE)

    not_run: Ver_Name = WebUI.concatenate(((['Object Repository/NewPatient/Page_Abaxis VetScan Fuse/Page_Abaxis VetScan Fuse/'
                , GlobalVariable.DF_Name, index]) as String[]), FailureHandling.STOP_ON_FAILURE)

    not_run: Ver_Obj = WebUI.concatenate((([GlobalVariable.prefix_Ver, GlobalVariable.Data_InfoID, index]) as String[]), 
        FailureHandling.STOP_ON_FAILURE)

    'Validación Usuario\r\n'
    Ver_Url = WebUI.concatenate((([GlobalVariable.G_FUSE_URL, GlobalVariable.G_Url_PatientVer, GlobalVariable.Data_InfoID
                , index]) as String[]), FailureHandling.STOP_ON_FAILURE)

    println(Ver_Url)

    not_run: println(Ver_Obj)

    not_run: println(Ver_Name)

    WebUI.navigateToUrl(Ver_Url, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    not_run: WebUI.verifyElementText(findTestObject('Page_Abaxis VetScan Fuse/h3_Alex0'), Name)

	}

