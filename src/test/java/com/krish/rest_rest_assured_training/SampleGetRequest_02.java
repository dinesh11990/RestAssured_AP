package com.krish.rest_rest_assured_training;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class SampleGetRequest_02 {

	@Test
	public void getRequestExample1() {
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		//You can either use getBody() or body()
		
		ResponseBody responseBody = response.getBody();
		
		//System.out.println(responseBody.asString());
		
		System.out.println(responseBody.asPrettyString());

	}
	
	@Test
	public void getRequestExample2() {
		
		RestAssured.baseURI="https://reqres.in/api";
		
		//If you use "then" keyword, you use the ValidateResponse
		
		//We call it as method chaining
		ValidatableResponse response = RestAssured
				.given()
					.param("", "")
					.header("","")
				.when()
					.get("/users/3")
					.then()
					.statusCode(200);
		
	}
	
	
	
}
