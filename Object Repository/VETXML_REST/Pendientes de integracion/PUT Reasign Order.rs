<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT Reasign Order</name>
   <tag></tag>
   <elementGuidId>d022ffdc-0841-46e1-bcb0-42b063c91605</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\t\u003cLabReport\u003e\n\t  \u003cIdentification\u003e\n\t    \u003cReportType\u003eRequest\u003c/ReportType\u003e\n\t    \u003cPracticeID\u003ePrac-12\u003c/PracticeID\u003e\n\t    \u003cPracticeRef\u003eVUEOrder12347\u003c/PracticeRef\u003e\n\t    \u003cLaboratoryID\u003eLab-1\u003c/LaboratoryID\u003e\n\t    \u003cPIMSName\u003ePMSName\u003c/PIMSName\u003e\n\t    \u003cOwnerID\u003eMañan€aç\u003c/OwnerID\u003e\n\t    \u003cOwnerName\u003eMayer, John\u003c/OwnerName\u003e\n\t    \u003cVetID\u003eMañan€aç\u003c/VetID\u003e\n\t    \u003cVetName\u003eMraz, Jayson\u003c/VetName\u003e\n\t  \u003c/Identification\u003e\n\t  \u003cAnimalDetails\u003e\n\t    \u003cAnimalID\u003ePet-05\u003c/AnimalID\u003e\n\t    \u003cAnimalName\u003eMañan€aç\u003c/AnimalName\u003e\n\t    \u003cBreed\u003e\u003c/Breed\u003e\n\t    \u003cGender\u003eNeutered\u003c/Gender\u003e\n\t    \u003cSpecies\u003eDOG\u003c/Species\u003e\n\t    \u003cAge\u003e1Y 3M 26D\u003c/Age\u003e\n\t    \u003cDateOfBirth\u003e2010-05-05\u003c/DateOfBirth\u003e\n\t    \u003cAbbreviatedHistory\u003eNo history related\u003c/AbbreviatedHistory\u003e\n\t  \u003c/AnimalDetails\u003e\n\t  \u003cLabRequests\u003e\n\t    \u003cLabRequest\u003e\n\t      \u003cTestCode\u003eFF\u003c/TestCode\u003e\n\t      \u003cDeviceID\u003e\u003c/DeviceID\u003e\u003c!-- No device when is a VUE --\u003e\n\t    \u003c/LabRequest\u003e\n\t  \u003c/LabRequests\u003e\n\t\u003c/LabReport\u003e&quot;,
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${url}orders</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.BE_url</defaultValue>
      <description></description>
      <id>81d9ac22-7e12-4d2a-b705-78c4828ade5a</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.PracticeID</defaultValue>
      <description></description>
      <id>623a78be-a0d3-4dcf-ab73-23b1fc033aa0</id>
      <masked>false</masked>
      <name>PracticeID</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
