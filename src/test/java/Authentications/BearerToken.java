package Authentications;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {
	@Test
	public void bearerTokenTest() {
	baseURI="https://api.github.com";
	
	JSONObject jobj = new JSONObject();
	jobj.put("Name", "SDET-RestAssured");
	jobj.put("Description", "RestfulWebservices FW Tested");
	
	given()
	.auth()
	.oauth2("token")
	.body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("/users/repos")
	.then()
	.assertThat().statusCode(201)
	.log().all();
	}
	
}
