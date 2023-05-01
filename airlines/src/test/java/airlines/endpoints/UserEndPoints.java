package airlines.endpoints;

import static io.restassured.RestAssured.given;

import airlines.payloads.AirlinePOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserEndPoints {
	
	
	//Airlines 
	public static Response readAllAirlines(){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(Routes.readAllAirline);
		return response;
	}
	public static Response createAirline(AirlinePOJO payload){
		Response response = 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
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
	
//	//Passenger
//	public static Response readAllAirlines(){
//		Response response = 	given()
//				.contentType(ContentType.JSON)
//				.accept(ContentType.JSON)
//				.when()
//				.get(Routes.readAllAirline);
//		return response;
//	}
//	public static Response readAllAirlines(){
//		Response response = 	given()
//				.contentType(ContentType.JSON)
//				.accept(ContentType.JSON)
//				.when()
//				.get(Routes.readAllAirline);
//		return response;
//	}
//	public static Response readAllAirlines(){
//		Response response = 	given()
//				.contentType(ContentType.JSON)
//				.accept(ContentType.JSON)
//				.when()
//				.get(Routes.readAllAirline);
//		return response;
//	}
//	
//	public static Response readAllAirlines(){
//		Response response = 	given()
//				.contentType(ContentType.JSON)
//				.accept(ContentType.JSON)
//				.when()
//				.get(Routes.readAllAirline);
//		return response;
//	}
	
}
