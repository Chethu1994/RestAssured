package Authentications;

import static io.restassured.RestAssured.*;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oauth2Test {
	@Test
	public void Oauth2Test() {
		
		//Step1. create a post request with client id and client secret
		
          baseURI = "http://coop.apps.symfonycasts.com";
		
		 Response resp = given()
		.formParam("client_id", "ChethanSDET")
		.formParam("client_secret", "0e0a41847bb209225e6103c5076abf41")
		.formParam("grant_type ", "client_credentials ")
		.formParam("redirect_uri ", "http://chethan.com")
		.formParam("code ", "authorization_code ")
		.when()
		.post("/token");
		resp.then().log().all();
		
		//Step2: capture the access token in response
		String token =resp.jsonPath().get("access_token");
		 Reporter.log(token, true);
		 
		 //Step3
		 given()
		 .auth().oauth2(token)
		 .pathParam("USER_ID", 3537)
		  .when()
		  .post("/api/{USER_ID}/chikens-feed")
		  .then().log().all();
		
	}
	

}
