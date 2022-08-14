package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResponseTimeValidation {
	@Test
	
	public void responseTimeValidation() {
		baseURI="http://localhost";
		port=8084;
		
		Response resp= when().get("/projects");
		resp.then().assertThat().time(Matchers.lessThan(1500L),TimeUnit.MILLISECONDS);
	}
}
