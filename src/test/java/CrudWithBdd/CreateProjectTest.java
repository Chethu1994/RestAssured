package CrudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {
	
	@Test
	public void createProjectTest()
	{
	JSONObject obj= new JSONObject();
	obj.put("createBy", "Manjuguy23");
	obj.put("projectName", "Lepact");
	obj.put("status", "ongoing");
	obj.put("teamSize", 8);
	
	
	//send the request
	given()
	  .body(obj)
	    .contentType(ContentType.JSON)
	 .when()
	  .post("http://localhost:8084/addProject");
	 //.then()
	  //.assertThat().statusCode(201).log().all();
	  
	  



	}

}
