package Utils;

import java.io.File;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;



public class validateJSON {
	public static boolean validateSchema(Response response, File file) {
		if(response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(file)) != null) {
			return true;
		}
		else return false;
	}

}
