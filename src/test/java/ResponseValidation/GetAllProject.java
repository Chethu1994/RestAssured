package ResponseValidation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProject {
	@org.testng.annotations.Test
	public void getAllProject() {
		
		Response res = RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse validate = res.then();
		validate.log().all();
	}
}
