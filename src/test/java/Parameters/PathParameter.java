package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class PathParameter {
	@Test
	public void pathParameterTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		given()
		.pathParam("pid", "TY_PROJ_604")
		.when()
		.get("/projects/{pid}")
		.then().log().all();
	}
}
