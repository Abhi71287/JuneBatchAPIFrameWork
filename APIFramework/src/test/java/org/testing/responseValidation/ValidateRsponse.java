package org.testing.responseValidation;

import org.testing.assertions.Assertions;
import org.testing.reportsLogs.LogCapture;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class ValidateRsponse {

	public static void validateStatusCode(int expectedStatusCode, Response res,ExtentTest test,String className) {
//		Hard Assertion Ex below :-
//		Assert.assertEquals(res.statusCode(), expectedStatusCode, "Status Code is not matching");
//		System.out.println("Status Code is matching");
		
//		Soft with hard Asertion ex below :-
		Boolean response =Assertions.assert1(expectedStatusCode,res);
		if(response) {
			test.log(LogStatus.PASS,"Status Code is matching with the expected status code");
			LogCapture.takeLogs(className, "Status Code is matching with the expected status code");
		}else {
			test.log(LogStatus.FAIL,"Status Code Is not matching with the expected status code");
			LogCapture.takeLogs(className, "Status Code is not matching with the expected status code");
		}
//		Assert.assertTrue(response);
	}

	public static void validateResponseData(String expectedData,Response res ,String jsonPath) {
      
		String actualValue =JsonParsingUsingJsonPath.jsonParse(res, jsonPath);
		Boolean response =Assertions.assert2(expectedData, actualValue);
		Assert.assertTrue(response);
	}

}
