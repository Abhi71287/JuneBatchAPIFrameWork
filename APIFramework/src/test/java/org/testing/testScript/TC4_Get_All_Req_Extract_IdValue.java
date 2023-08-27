package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ValidateRsponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_Get_All_Req_Extract_IdValue {
	
	@Test
	public void getAllExtractIdValue() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.getallMethod("URI_1");
		ValidateRsponse.validateStatusCode(200,res);
		JsonParsingUsingOrgJson.jsonParse(res.asString(), "id");
	}

}
