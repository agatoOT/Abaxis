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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Queda pendiente de definición \r\n'
WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/Menus/Clinics'), [:], FailureHandling.STOP_ON_FAILURE)

'Queda pendiente de definición \r\n'
WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/MenuBara/NuevaClinica/Nueva Clinica'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/MenuBara/NuevaClinica/CancelarClinica'), [:], FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/MenuBara/NuevaClinica/Nueva Clinica'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/MenuBara/NuevaClinica/AceptarClinica'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web/BO VUE/LIB/CloseBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

