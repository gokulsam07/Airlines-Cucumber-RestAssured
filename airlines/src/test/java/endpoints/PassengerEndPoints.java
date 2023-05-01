package endpoints;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PassengerEndPoints {
	
	//All the methods needs modification

	public static Response createPassenger(File file){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(file)
				.when()
				.post(Routes.createPassenger);
		return response;
	}
	public static Response getSpecificPassenger(String id){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.pathParam("id", id)
				.accept(ContentType.JSON)
				.when()
				.get(Routes.getSpecificPassenger);
		return response;
	}
	
	public static Response updateFullDetailsOfPassenger(String id, File payload){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id", id)
				.body(payload)
				.when()
				.put(Routes.updatePassengerDetails);
		return response;
	}
	
	public static Response deleteSpecificPassenger(String id){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id", id)
				.when()
				.delete(Routes.deleteSpecificPassenger);
		return response;
	}
	
}
