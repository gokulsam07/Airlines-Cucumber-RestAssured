package stepdefinitions;

import java.io.File;

import org.testng.Assert;

import Utils.validateJSON;
import endpoints.PassengerEndPoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class PassengerTest {
	Response response;
	static String passengerId;
	File jsonSchemaCreate = new File(System.getProperty("user.dir")+"/src/test/java/testdata/createPassengerJSONSchema.json");

	//create
	@When("POST request with {string} is hit for create passenger")
	public void post_request_with_is_hit_for_create_passenger(String payload) {
		File file = new File(payload);
		response= PassengerEndPoints.createPassenger(file);
	}

	@Then("Verify the status code and output schema for passenger creation")
	public void verify_the_status_code_and_output_schema_for_passenger_creation() {
		if(validateJSON.validateSchema(response, jsonSchemaCreate))
			passengerId = response.jsonPath().getString("_id");
		Assert.assertEquals(response.statusCode(), 200);
	}

	//get
	@When("GET request with passengerId is hit")
	public void get_request_with_passenger_id_is_hit() {
		response = PassengerEndPoints.getSpecificPassenger(passengerId);
	}

	@Then("Verify the status code and output schema for passenger")
	public void verify_the_status_code_and_output_schema_for_passenger() {
		if(validateJSON.validateSchema(response, jsonSchemaCreate))
			Assert.assertEquals(response.statusCode(), 200);
	}

	//update
	@When("PUT request with passengerId is hit with {string}")
	public void put_request_with_passengerId_is_hit_with_payload(String filePath) {
		File file = new File(filePath);
		response = PassengerEndPoints.updateFullDetailsOfPassenger(passengerId,file);
	}

	@Then("Verify the status code and output schema for passenger update")
	public void verify_the_status_code_and_output_schema_for_passenger_update() {
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("message"), "Passenger data put successfully completed.");
	}


	//Delete
	@When("DELETE request with passengerId is hit")
	public void delete_request_with_passengerId_is_hit() {
		response = PassengerEndPoints.deleteSpecificPassenger(passengerId);
	}

	@Then("Verify the status code after delete")
	public void verify_the_status_code_after_delete() {
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("message"), "Passenger data deleted successfully.");

	}
	//Get after delete

	@Then("Verify the status code for get after delete")
	public void verify_the_status_code_for_get_after_delete() {
		Assert.assertEquals(response.statusCode(), 204);		
	}

}
