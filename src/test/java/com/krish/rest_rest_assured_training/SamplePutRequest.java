package com.krish.rest_rest_assured_training;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SamplePutRequest {
	
	@Test
	public void putRequestExample() {
		
		JSONObject jsonObject  = new JSONObject();
		
		jsonObject.put("name", "James");
		jsonObject.put("job", "Engineer");
		
		System.out.println(jsonObject.toString());
		
		baseURI="https://reqres.in";
		
			given()
			.when()
			.body(jsonObject.toJSONString())
			//you can change it to patch for partial update
			.put("/api/users/2")
			.then()
				.statusCode(200);
		
		
	}
	
	@Test
	public void deleteRequestExample() {
		
		baseURI = "https://reqres.in";
		
			given()
			.header("","")
			.when()
			.delete("/api/users/2")
			.then()
			.statusCode(204);
	}

}
