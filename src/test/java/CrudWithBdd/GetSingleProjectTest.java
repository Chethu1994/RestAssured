package CrudWithBdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleProjectTest {
	@Test
	public void getSingleProject()
	{
		//String projectId = "TY_PROJ_604";
		
		when()
		 .get("http://localhost:8084/projects/TY_PROJ_604")
		 .then()
		   .assertThat().statusCode(200).log().all();
		
	}

}
