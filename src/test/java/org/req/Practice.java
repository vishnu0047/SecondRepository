package org.req;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.mapper.factory.JsonbObjectMapperFactory;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practice {


/*	@Test
	public void tc1() {
		System.out.println("tc1");	
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.queryParam("page", "2");
		Response request = rs.request(Method.GET,"api/users");
		int statusCode = request.statusCode();
		System.out.println(statusCode);
		String asPrettyString = request.getBody().asPrettyString();
		System.out.println(asPrettyString);

	} 
		
		
	@Test
	public void tc2() {
		System.out.println("tc2");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "2");
		Response request = rs.request(Method.GET,"api/users/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());

	} 
	
	@Test
	public void tc3() {
		System.out.println("tc3");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "23");
		Response request = rs.request(Method.GET,"api/users/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());

	} 
	
	@Test
	public void tc4() {
		System.out.println("tc4");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		Response request = rs.request(Method.GET,"api/unknown");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());

	} 
	
	@Test
	public void tc5() {
		System.out.println("tc5");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "2");
		Response request = rs.request(Method.GET,"api/unknown/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());

	} 
	
	@Test
	public void tc6() {
		System.out.println("tc6");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "23");
		Response request = rs.request(Method.GET,"api/unknown/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());

	} 
	
	
	@Test
	public void tc7() {
		System.out.println("tc7");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		
		JSONObject js = new JSONObject();
		js.put("name", "morpheous");
		js.put("job", "leader");
		
		rs.body(js.toJSONString());
		
		Response request = rs.request(Method.POST,"api/users");
		
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());

	} 
		
	@Test
	public void tc8() {
		System.out.println("tc8");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "2");
		JSONObject js = new JSONObject();
		js.put("name", "morpheous");
		js.put("job", "zion resident");
		rs.body(js.toJSONString());
		Response request = rs.request(Method.PUT,"api/users/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());
	} 
		
	@Test
	public void tc9() {
		System.out.println("tc9");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "2");
		Response request = rs.request(Method.DELETE,"api/users/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());
	} */
	
	@Test
	public void tc10() {
		System.out.println("tc10");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		JSONObject js = new JSONObject();
		js.put("email","eve.holt@reqres.in");
		js.put("password","pistol");
		rs.body(js.toJSONString());
		Response request = rs.request(Method.POST,"api/register");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());
		
	}
	
	@Test
	public void tc12() {
		System.out.println("tc12");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		JSONObject js = new JSONObject();
		js.put("email","eve.holt@reqres.in");
		js.put("password","cityslicka");
		rs.body(js.toJSONString());
		Response request = rs.request(Method.POST,"api/login");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());
		
	}
		
		
	@Test
	public void tc13() {
		System.out.println("tc3");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "23");
		Response request = rs.request(Method.GET,"api/users/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());	
	}
	
	@Test
	public void tc14() {
		System.out.println("tc3");
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification rs = RestAssured.given();
		rs.pathParam("id", "23");
		Response request = rs.request(Method.GET,"api/users/{id}");
		System.out.println(request.statusCode());
		System.out.println(request.getBody().asPrettyString());	
	}
	
	
		
		
		
		
		
		
		
}

