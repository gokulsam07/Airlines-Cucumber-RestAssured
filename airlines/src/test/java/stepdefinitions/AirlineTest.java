package stepdefinitions;

import java.io.File;

import org.testng.Assert;

import Utils.validateJSON;
import endpoints.AirlineEndPoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


public class AirlineTest {
	Response response;
	File jsonSchema = new File(System.getProperty("user.dir")+"/src/test/java/testdata/airlineOutputSchema.json");
	File jsonSchemaCreate = new File(System.getProperty("user.dir")+"/src/test/java/testdata/createAirlineSchema.json");
	File spAirline = new File(System.getProperty("user.dir")+"/src/test/java/testdata/specificAirlineJSON.json");

	@When("GET request for airline endpoint is hit")
	public void get_request_for_airline_endpoint_is_hit() {
		response= AirlineEndPoints.readAllAirlines();
	}
	
	@When("POST request for airline {int} is hit")
	public void post_request_for_airline_something_is_hit(int id) {
		response= AirlineEndPoints.getAirlineById(id);
	}

	
	@When("POST request with {string} is hit for create airline")
	public void post_request_with_something_is_hit_for_create_airline(String payload) {
		File file = new File(payload);
		response= AirlineEndPoints.createAirline(file);
	}
	
	@Then("Verify the status code and output schema")
	public void verify_the_status_code_and_output_schema() {
		if(validateJSON.validateSchema(response, jsonSchema))
			Assert.assertEquals(response.statusCode(), 200);	
	}
	
	@Then("Verify the status code and output schema for specific airline")
	public void verify_the_status_code_and_output_schema_for_specific_airline() {
		if(validateJSON.validateSchema(response, spAirline))
			Assert.assertEquals(response.statusCode(), 200);	
	}
	
	@Then("Verify the status code and output schema for create request")
	public void verify_the_status_code_and_output_schema_for_create_request() {
		if(validateJSON.validateSchema(response, jsonSchemaCreate))
			Assert.assertEquals(response.statusCode(), 200);
	}
}
