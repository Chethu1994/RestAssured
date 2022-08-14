package CrudWithBdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {
	@Test
	public void deleteProject() {
		baseURI="http://localhost";
		port=8084;
		
		when()
		 .delete("/projects/TY_PROJ_1807")
		.then()
		.log().all();
	}

}
