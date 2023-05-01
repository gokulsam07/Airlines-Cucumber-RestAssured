package endpoints;

import static io.restassured.RestAssured.given;

import java.io.File;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class AirlineEndPoints {


	//Airlines 
	public static Response readAllAirlines(){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(Routes.readAllAirline);
		return response;
	}
	public static Response createAirline(File file){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(file)
				.when()
				.post(Routes.createAirline);
		return response;
	}
	public static Response getAirlineById(int id){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("id", id)
				.when()
				.get(Routes.readSpecificAirline);
		return response;
	}

}
