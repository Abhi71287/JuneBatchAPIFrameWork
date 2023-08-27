package org.testing.utilities;

import io.restassured.response.Response;

// input Parameter = response Object and the JsonPath.
// Purpose = it will extract value from the response based upon the jsonpath that 
// we are giving.
// outPut = it will return String value.
public class JsonParsingUsingJsonPath {

	public static String jsonParse(Response res, String jsonPath) {
		return res.jsonPath().get(jsonPath);
	}

}
