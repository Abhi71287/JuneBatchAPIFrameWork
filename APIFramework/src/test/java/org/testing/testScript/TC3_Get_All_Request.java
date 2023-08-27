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

public class TC3_Get_All_Request {
    
	@Test
	public void getAll() throws IOException {
		ExtentReports report = ReportHandling.takeReport("D://Abhi_Learnings//API//Report//report.html");
        ExtentTest test2=report.startTest("TC3_Get_All_Request");
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res =http.getallMethod("URI_1");
		ValidateRsponse.validateStatusCode(200,res,test2,"TC3_Get_All_Request");
		report.endTest(test2);
		report.flush();
	}

}
