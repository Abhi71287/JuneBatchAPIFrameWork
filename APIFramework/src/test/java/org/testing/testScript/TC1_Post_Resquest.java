package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC1_Post_Resquest {
	@Test
	public void postReq() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		String requestBody = JsonHandle
				.loadJsonFile("../APIFramework/src/test/java/org/testing/resources/RequestPayload.json");
		HTTPMethods http = new HTTPMethods(pr);
		http.postMethod(requestBody, "URI_1");
	}
}
