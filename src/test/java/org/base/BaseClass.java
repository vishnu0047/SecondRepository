package org.base;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	public static RequestSpecification rs;
	
	
	
	
	
	public static void requestObject(String baseUrl) {
		RestAssured.baseURI = baseUrl;
		 rs = RestAssured.given();

	}
	
	
	public static void queryParam(String parameterName,String parameterValue ) {
		rs.queryParam(parameterName, parameterValue);

	}
	
	public static void pathParam(String parameterName,String parameterValue) {
		rs.pathParam(parameterName, parameterValue);

	}
	
	public static Response responseObject(String key, String resources) {
		
		switch (key) {
		case "GET":
			return rs.request(Method.GET, resources);
			
		case "PUT":
			return rs.request(Method.PUT, resources);
			
		case "POST":
			return rs.request(Method.POST, resources);
			
		case "PATCH":
			return rs.request(Method.PATCH, resources);
			
		default:
			return rs.request(Method.DELETE, resources);
		}
	}
	
	public static void verifyResponseCode(Response response, int expected) {
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		Assert.assertEquals(expected, statusCode);
		System.out.println("Validation of response code is done");
		

	}
	
	public static void verifyResponseBody(Response response,String jsonPath ,String expected) {
		Object object = response.jsonPath().get(jsonPath);
		String s = (String) object;
		Assert.assertEquals(expected, s);
		System.out.println("Validation of response body is done");
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
