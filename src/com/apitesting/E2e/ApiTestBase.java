package com.apitesting.E2e;

import com.apitesting.bodyString.BodyForBase;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.apitesting.bodyString.BodyForBase;

import io.restassured.RestAssured;

public class ApiTestBase {
public static void main(String[] args) {
	RestAssured.baseURI = "https://rahulshettyacademy.com";
	String response=given().log().all().queryParam("Key", "qaclick123").header("Content-Type", "application/json")
	.body(BodyForBase.body()).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
	.body("scope",equalTo("APP")).extract().response().asString();
	System.out.println("It is passed");
	System.out.println(response);
}
}
