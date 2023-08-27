package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ValidateRsponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC7_DeleteRequest {
	@Test
	public void deleteMethod() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.deleteMethod("URI_1", TC2_Post_Request_with_random_id.returnidValue);
		ValidateRsponse.validateStatusCode(200,res);}

}
