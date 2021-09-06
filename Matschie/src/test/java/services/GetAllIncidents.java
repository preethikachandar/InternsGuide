package services;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllIncidents {
	
	@Test(enabled=false)
	public void getAllIncidents() {
		RestAssured.baseURI = "https://dev79032.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "jqIO1JKv4Ezc");
		
		Response response = RestAssured
		.given()
		.queryParam("number", "INC0010506")
		.queryParam("sysparm_fields", "number,sys_id")
		.get()
		.then().log().all().extract().response()
		;
		
		response.prettyPrint();
		
	}
	
	@Test
	public void getAllIncidents1() {
		RestAssured.baseURI = "https://dev79032.service-now.com/api/now/table/incident?number=INC0010506&sysparm_fields=%27number%2Csys_id%27";
		RestAssured.authentication = RestAssured.basic("admin", "jqIO1JKv4Ezc");
		
		Response response = RestAssured
		.get()
		.then().log().all().extract().response()
		;
		
		response.prettyPrint();
		
	}

}
