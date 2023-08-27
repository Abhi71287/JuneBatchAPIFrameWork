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

public class TC2_Post_Request_with_random_id {
	
	static String returnidValue;
	@Test
	public void postReqWithRandomId() throws IOException {
		ExtentReports report = ReportHandling.takeReport("D://Abhi_Learnings//API//Report//report.html");
        ExtentTest test1=report.startTest("TC2_Post_Request_with_random_id");
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		String requestBody = JsonHandle.loadJsonFile(
				"../APIFramework/src/test/java/org/testing/resources/RequestPayloadWithRandomIdValue.json");
		Random r = new Random();
		Integer idValue = r.nextInt();
		requestBody = JsonReplacement.assignVariableValue(requestBody, "id", idValue.toString());
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.postMethod(requestBody, "URI_1");
		ValidateRsponse.validateStatusCode(201,res,test1,"TC2_Post_Request_with_random_id");
		report.endTest(test1);
		report.flush();
		returnidValue=JsonParsingUsingOrgJson.jsonParse(res.asString(), "id");
	}
} 
