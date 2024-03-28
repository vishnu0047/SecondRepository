package org.run;

import org.base.BaseClass;
import org.junit.Test;

import io.restassured.response.Response;

public class Testrun extends BaseClass{

	@Test
	public void tc1() {
		requestObject("https://reqres.in/");
		queryParam("page", "2");
		Response response = responseObject("GET", "api/users");
		verifyResponseCode(response, 200);
		verifyResponseBody(response, "data[3].first_name", "Byron");

	}
	
	@Test
	public void tc2() {
		requestObject("https://reqres.in/");
		pathParam("id", "2");
		Response responseObject = responseObject("GET", "api/users/{id}");
		verifyResponseCode(responseObject, 200);
		verifyResponseBody(responseObject, "data.first_name", "Janet");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
