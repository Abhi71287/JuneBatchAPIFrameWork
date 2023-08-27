package org.testing.responseValidation;

import org.testing.assertions.Assertions;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testng.Assert;

import io.restassured.response.Response;

public class ValidateRsponse {

	public static void validateStatusCode(int expectedStatusCode, Response res) {
//		Hard Assertion Ex below :-
//		Assert.assertEquals(res.statusCode(), expectedStatusCode, "Status Code is not matching");
//		System.out.println("Status Code is matching");
		
//		Soft with hard Asertion ex below :-
		Boolean response =Assertions.assert1(expectedStatusCode,res);
		Assert.assertTrue(response);
	}

	public static void validateResponseData(String expectedData,Response res ,String jsonPath) {
      
		String actualValue =JsonParsingUsingJsonPath.jsonParse(res, jsonPath);
		Boolean response =Assertions.assert2(expectedData, actualValue);
		Assert.assertTrue(response);
	}

}
