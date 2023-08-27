package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {

	Properties pr; // global variable

	public HTTPMethods(Properties pr) {
		this.pr = pr;
	}

//	Input parameter ---- Request body, Uri Value from properties file.
	public Response postMethod(String requestBody, String UriKeyName) {
		String uriValue = pr.getProperty(UriKeyName);
		Response res = given().contentType(ContentType.JSON).body(requestBody).when().post(uriValue);
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;

	}

//	Input parameter ---- Uri Value from properties file.
	public Response getallMethod(String UriKeyName) {
		String uriValue = pr.getProperty(UriKeyName);
		Response res = given().contentType(ContentType.JSON).when().get(uriValue);
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;

	}

//	Input parameter ---- Uri Value from properties file.
	public Response getparticularMethod(String UriKeyName, String endPoint) {
		String uriValue = pr.getProperty(UriKeyName) + "/" + endPoint;
		Response res = given().contentType(ContentType.JSON).when().get(uriValue);
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;

	}

//	
	public Response putMethod(String requestBody, String UriKeyName, String enPoint) {
		String uriValue = pr.getProperty(UriKeyName) + "/" + enPoint;
		Response res = given().contentType(ContentType.JSON).body(requestBody).when().put(uriValue);
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;

	}

	public Response deleteMethod(String UriKeyName, String endPoint) {
		String uriValue = pr.getProperty(UriKeyName) + "/" + endPoint;
		Response res = given().contentType(ContentType.JSON).when().delete(uriValue);
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;

	}

}
