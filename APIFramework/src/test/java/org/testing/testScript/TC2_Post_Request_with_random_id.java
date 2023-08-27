package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.ValidateRsponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_Post_Request_with_random_id {
	
	static String returnidValue;
	@Test
	public void postReqWithRandomId() throws IOException {

		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		String requestBody = JsonHandle.loadJsonFile(
				"../APIFramework/src/test/java/org/testing/resources/RequestPayloadWithRandomIdValue.json");
		Random r = new Random();
		Integer idValue = r.nextInt();
		requestBody = JsonReplacement.assignVariableValue(requestBody, "id", idValue.toString());
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.postMethod(requestBody, "URI_1");
		ValidateRsponse.validateStatusCode(201,res);
		returnidValue=JsonParsingUsingOrgJson.jsonParse(res.asString(), "id");
	}
} 
