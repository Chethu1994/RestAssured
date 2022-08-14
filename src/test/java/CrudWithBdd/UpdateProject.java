package CrudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class UpdateProject {
@Test

public void updateProject()
{
	baseURI="http://localhost";
	port=8084;
	
	//Step1:- create required data
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "Madhu");
	jobj.put("projectName", "cowork");
	jobj.put("status", "created");
	jobj.put("teamSize", 6);


//step2:- send the request	
	given()
	 .body(jobj).contentType(ContentType.JSON)
	.when()
	 .put("/projects/TY_PROJ_604")
	 .then()
	 .log().all();
	}
}
