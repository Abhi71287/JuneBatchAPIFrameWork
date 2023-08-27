package org.testing.testScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC9_Get_All_Request_Assignment2 {
	
	public void getAll() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		http.getallMethod("URI_6");
	}


}
