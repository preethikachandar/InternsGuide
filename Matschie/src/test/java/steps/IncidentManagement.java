package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import hooks.SetUp;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class IncidentManagement extends BaseRequests{

	@When("short description is added with (.*)$")
	public void add_short_description(String short_desc){
		request = request.when().body("{\"short_description\" : \""+short_desc+"\"}");
	}

	@When("description is added with (.*)$")
	public void add_description(String desc){
		request = request.when().body("{\"description\" : \""+desc+"\"}");
	}

	@When("new incident is created")
	public void a_new_incident_created(){
		response = request.when().contentType(ContentType.JSON).post("incident");
	}

	@When("get all incidents")
	public void get_all_incidents(){
		response = request.when().contentType(ContentType.JSON).get("incident");
	}

	@Given("enable request logs")
	public void setRequestLogs(){ 
		request = given().log().all();
	}
	
	@Given("enable response logs")
	public void setResponseLogs(){ 
		response = response.then().log().all().extract().response();
	}
	
	@When("query parameters with number and (.*)$")
	public void add_query_parameter_number(String value) {
		request.given().queryParam("number", value);
	}
	
	@When("query parameters with sysparm_fields and (.*)$")
	public void add_query_parameter_fields(String value) {
		request.given().queryParam("sysparm_fields", value);
	}
	
	@Then("the status code is (\\d+)$")// {int} -> only digit= (\\d+) (1 or more)
	public void verify_status_code(int statusCode){
		json = response.then().assertThat().statusCode(statusCode);
	}

	@And("response includes the following$")
	public void response_equals(Map<String,String> responseFields){
		for (Entry<String, String> field : responseFields.entrySet()) { 
			if(StringUtils.isNumeric(field.getValue()))
				json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
			else
				json.body(field.getKey(), equalTo(field.getValue()));
		}
	}

	@And("response includes the following in any order$")
	public void response_contains_in_any_order(Map<String,String> responseFields){
		for (Entry<String, String> field : responseFields.entrySet()) {
			if(StringUtils.isNumeric(field.getValue()))
				json.body(field.getKey(), containsInAnyOrder(Integer.parseInt(field.getValue())));
			else
				json.body(field.getKey(), containsInAnyOrder(field.getValue()));
		}
	}
	
	
}