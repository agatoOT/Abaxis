<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET Order status</name>
   <tag></tag>
   <elementGuidId>cb9f3f54-d905-4b2d-b06a-ddebf28a0971</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\u003cLabReport\u003e\n  \u003cIdentification\u003e\n    \u003cReportType\u003eRequest\u003c/ReportType\u003e\n    \u003cPracticeID\u003ePrac-12\u003c/PracticeID\u003e\n    \u003cPracticeRef\u003e${PracticeRef}\u003c/PracticeRef\u003e\n    \u003cLaboratoryID\u003eLab-2\u003c/LaboratoryID\u003e\n    \u003cPIMSName\u003ePMSName\u003c/PIMSName\u003e\n    \u003cOwnerID\u003e${OwnerID}\u003c/OwnerID\u003e\n    \u003cOwnerName\u003eMayer, John\u003c/OwnerName\u003e\n    \u003cVetID\u003e${VetID}\u003c/VetID\u003e\n    \u003cVetName\u003eMraz, Jayson\u003c/VetName\u003e\n  \u003c/Identification\u003e\n  \u003cAnimalDetails\u003e\n    \u003cAnimalID\u003ePet-05\u003c/AnimalID\u003e\n    \u003cAnimalName\u003e${AnimalName}\u003c/AnimalName\u003e\n    \u003cBreed\u003e\u003c/Breed\u003e\n    \u003cGender\u003eNeutered\u003c/Gender\u003e\n    \u003cSpecies\u003eDOG\u003c/Species\u003e\n    \u003cAge\u003e1Y 3M 26D\u003c/Age\u003e\n    \u003cDateOfBirth\u003e2010-05-05\u003c/DateOfBirth\u003e\n    \u003cAbbreviatedHistory\u003eNo history related\u003c/AbbreviatedHistory\u003e\n  \u003c/AnimalDetails\u003e\n  \u003cLabRequests\u003e\n    \u003cLabRequest\u003e\n      \u003cTestCode\u003eAR\u003c/TestCode\u003e\n      \u003cDeviceID\u003e\u003c/DeviceID\u003e\n    \u003c/LabRequest\u003e\n  \u003c/LabRequests\u003e\n\u003c/LabReport\u003e&quot;,
  &quot;contentType&quot;: &quot;application/xml&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/xml</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic cG1zOnBtcw==</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${url}/orders/${PracticeRef}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.BE_url</defaultValue>
      <description></description>
      <id>49f14053-5ad7-4049-bd6a-6c569a958b64</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>'1234ABED'</defaultValue>
      <description></description>
      <id>d4794361-790f-458d-b577-e6772a0c262b</id>
      <masked>false</masked>
      <name>PracticeRef</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

def variables = request.getVariables()


GlobalVariable.variable
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
