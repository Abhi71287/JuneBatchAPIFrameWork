package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.reportsLogs.ReportHandling;
import org.testing.responseValidation.ValidateRsponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class TC7_DeleteRequest {
	@Test
	public void deleteMethod() throws IOException {
		ExtentReports report = ReportHandling.takeReport("D://Abhi_Learnings//API//Report//report.html");
		ExtentTest test6 = report.startTest("TC3_Get_All_Request");
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.deleteMethod("URI_1", TC2_Post_Request_with_random_id.returnidValue);
		ValidateRsponse.validateStatusCode(200, res, test6,"TC7_DeleteRequest");
		report.endTest(test6);
		report.flush();
	}

}
