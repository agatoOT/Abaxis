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

Mobile.tap(findTestObject('Android/WF1/Configuration/android.widget.LinearLayout4'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Android/WF1/Configuration/android.widget.LinearLayout5'), 0)

Mobile.tap(findTestObject('Android/WF1/Configuration/android.widget.LinearLayout5'), 0)

Mobile.tap(findTestObject('Android/WF1/Configuration/android.widget.RelativeLayout7'), 0)

Mobile.tap(findTestObject('Android/WF1/Configuration/android.support.v7.widget.LinearLayoutCompat0'), 0)

Mobile.setText(findTestObject('Android/WF1/Configuration/android.widget.EditText0 - Enter fuse IP address'), GlobalVariable.G_FUSE_IP, 
    0)

Mobile.tap(findTestObject('Android/WF1/Configuration/android.widget.Button0 - CONNECT'), 0)

Mobile.pressBack()

