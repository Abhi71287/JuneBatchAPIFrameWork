package org.testing.assertions;

import io.restassured.response.Response;

public class Assertions {
	
	public static Boolean assert1(int expectedStatusCode, Response res) {
		if (expectedStatusCode== res.statusCode()) {
			System.out.println("Status Code is Matching");
			return true;
		}else {
			System.out.println("Status Code is not  Matching");
			return false;
		}
	}
	
	public static Boolean assert2(String expectedValue, String actualValue) {
		if (expectedValue.equals(actualValue)) {
			System.out.println("Data is Matching");
			return true;
		}else {
			System.out.println("Data is not  Matching");
			return false;
		}
	}

}
