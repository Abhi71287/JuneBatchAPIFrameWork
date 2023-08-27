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

public class TC_5_Get_Particular_By_IdValue {
	
	@Test
	public void getparticularByIdValue() throws IOException {
		ExtentReports report = ReportHandling.takeReport("D://Abhi_Learnings//API//Report//report.html");
        ExtentTest test4=report.startTest("TC3_Get_All_Request");
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.getparticularMethod("URI_1",TC2_Post_Request_with_random_id.returnidValue);
		ValidateRsponse.validateStatusCode(200,res,test4,"TC_5_Get_Particular_By_IdValue");
		report.endTest(test4);
		report.flush();
	}
}
