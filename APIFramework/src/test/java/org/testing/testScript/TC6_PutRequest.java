package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.reportsLogs.ReportHandling;
import org.testing.responseValidation.ValidateRsponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC6_PutRequest {
    
	@Test
	public void putRequest() throws IOException {
		ExtentReports report = ReportHandling.takeReport("D://Abhi_Learnings//API//Report//report.html");
        ExtentTest test5=report.startTest("TC3_Get_All_Request");
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		String requestBody = JsonHandle
				.loadJsonFile("../APIFramework/src/test/java/org/testing/resources/UpdateRequestPayload.json");
		requestBody = JsonReplacement.assignVariableValue(requestBody, "id",
				TC2_Post_Request_with_random_id.returnidValue);
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.putMethod(requestBody, "URI_1", TC2_Post_Request_with_random_id.returnidValue);
		ValidateRsponse.validateStatusCode(200,res,test5,"TC6_PutRequest");
		report.endTest(test5);
		report.flush();
		}

}
