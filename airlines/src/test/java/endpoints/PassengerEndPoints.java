package endpoints;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PassengerEndPoints {
	
	//All the methods needs modification

	public static Response createPassenger(){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(Routes.readAllAirline);
		return response;
	}
	public static Response getSpecificPassenger(){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(Routes.readAllAirline);
		return response;
	}
	public static Response deleteSpecificPassenger(){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(Routes.readAllAirline);
		return response;
	}
	
	public static Response updateFullDetailsOfPassenger(){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(Routes.readAllAirline);
		return response;
	}
	
}
