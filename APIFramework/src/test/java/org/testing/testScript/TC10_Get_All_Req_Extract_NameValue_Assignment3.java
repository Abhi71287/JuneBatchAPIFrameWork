package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC10_Get_All_Req_Extract_NameValue_Assignment3 {
	public void getAllExtractIdValue() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.getallMethod("URI_6");
		JsonParsingUsingOrgJson.jsonParse(res.asString(), "name");
	}

}
