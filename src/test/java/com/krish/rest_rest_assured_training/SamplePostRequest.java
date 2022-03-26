package com.krish.rest_rest_assured_training;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class SamplePostRequest {

	@Test
	public void postRequestExample() {
		
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", "dinesh");
		jsonObject.put("job", "Engineer");
		
		System.out.println(jsonObject.toString());
		
		
		RestAssured.baseURI="https://reqres.in";
		  
		RestAssured 
		.given() 
		.header("","")
		.body(jsonObject.toJSONString())
		.post("/api/users")
		.then()
			.statusCode(201);		  
			//.contentType(ContentType.JSON)
		    //.accept(ContentType.JSON)
		 	}
}
