package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.response.Response;

public class StaticResponseValidation {
	@Test
	public void staticResponse() {
		
	baseURI= "http://localhost";
	port=8084;
	
	String expData= "TY_PROJ_001";
	
	//create data
	//send request and validate response
	Response resp= when()
			.get("/projects");
	
	//validate
	
	String actData = resp.jsonPath().get("[0].projectId");
	Assert.assertEquals(expData,actData );
	resp.then().log().all();
	
	
	}

}
