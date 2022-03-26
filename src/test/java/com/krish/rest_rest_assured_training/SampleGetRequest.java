package com.krish.rest_rest_assured_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		Response response = RestAssured.get("http://www.google.co.in");
		
		int statusCode= response.statusCode();
		String statusLine=response.getStatusLine();
		
		System.out.println(statusCode);
		System.out.println(statusLine);		

	}

}
