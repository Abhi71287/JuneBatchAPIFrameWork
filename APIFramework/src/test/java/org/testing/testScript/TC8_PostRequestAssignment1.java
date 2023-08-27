package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC8_PostRequestAssignment1 {
	
	static String returnNameValue;
	public void postReqWithRandomName() throws IOException {

		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		String requestBody = JsonHandle.loadJsonFile(
				"../APIFramework/src/test/java/org/testing/resources/AssignmentRequestPayload.json");
		String [] firstName = {"Abhi","John","Richard","Daniel","Luther","James"};
		Random r = new Random();
		String nameValue = firstName[r.nextInt(firstName.length)];
		requestBody = JsonReplacement.assignVariableValue(requestBody, "name", nameValue);
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.postMethod(requestBody, "URI_6");
		returnNameValue=JsonParsingUsingOrgJson.jsonParse(res.asString(), "name");
	}
} 


