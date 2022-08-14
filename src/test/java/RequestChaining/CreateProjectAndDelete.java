package RequestChaining;

import java.util.Random;

import org.testng.annotations.Test;

import ProjectLibrary.PojoClassToSendRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class CreateProjectAndDelete {
	
	@Test
	public void CreateProjectAndDeleteProject() {
		 Random rand = new Random();
		int ran = rand.nextInt(500);
		
		baseURI="http://localhost";
		port=8084;
		
		PojoClassToSendRequest pojo= new PojoClassToSendRequest("chethu", "tyss"+ran, "completed", 5);
		  Response resp = given()
				 .body(pojo)
				 .contentType(ContentType.JSON)
				 .when()
				 .post("/addProject");
		  
		 
		 String pid = resp.jsonPath().get("projectId");
		 System.out.println(pid);
		 
		 given()
		 .pathParam("key", pid)
		 .when().get("./projects/{key}")
		 .then().assertThat().statusCode(200).log().all();
		 
		 given()
		 .pathParam("key", pid)
		 .when().delete("/projects/{key}")
		 .then().assertThat().statusCode(204).log().all();
		
		
	}

}
