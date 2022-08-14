package Authentications;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {
	@Test
	public void createAuth() {
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth()
		.basic("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
		
	}

}

