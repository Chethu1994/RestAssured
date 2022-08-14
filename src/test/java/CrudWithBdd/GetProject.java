package CrudWithBdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetProject {
	@Test
	public void getProject() {
		
	baseURI="http://localhost";
	port=8084;
	
	when()
	.get("/projects")
	.then()
	 .assertThat().statusCode(200).log().all();
	}
	

}
