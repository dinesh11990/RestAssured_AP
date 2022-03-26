package com.krish.rest_rest_assured_training;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class JsonValidationExample {
	
	@Test
	public void checkLeagueId() {
		
		get("http://localhost:3000/team").then().body("data.legueId", equalTo(3));
	}
	
	@Test
	public void visitingTeam() {
		
		get("http://localhost:3000/team").then().body("data.visitingTeam", equalTo("India"));
	}
	@Test
	public void checkWeight() {
		
		get("http://localhost:3000/team").then().body("data.weight", equalTo(65.7f));
	}
	@Test
	public void checkTime() {
		
		get("http://localhost:3000/team").then().time(lessThan(1L), TimeUnit.SECONDS);
	}
	@Test
	public void checkEntries() {
		
		//In order to check if it is empty array use empty()
		get("http://localhost:3000/team").then().body("odds", hasSize(2));
	}
}
