package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.reportsLogs.ReportHandling;
import org.testing.responseValidation.ValidateRsponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC4_Get_All_Req_Extract_IdValue {
	
	@Test
	public void getAllExtractIdValue() throws IOException {
		ExtentReports report = ReportHandling.takeReport("D://Abhi_Learnings//API//Report//report.html");
        ExtentTest test3=report.startTest("TC3_Get_All_Request");
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.getallMethod("URI_1");
		ValidateRsponse.validateStatusCode(200,res,test3,"TC4_Get_All_Req_Extract_IdValue");
		JsonParsingUsingOrgJson.jsonParse(res.asString(), "id");
		report.endTest(test3);
		report.flush();
	}

}
