package RequestChaining;

import java.util.Random;

import org.testng.annotations.Test;

import ProjectLibrary.PojoClassToSendRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class CreateProjectPostAndGet {
	@Test
	public void creteProjectAndPost() {
		
	
		Random ran = new Random();
	int randum = ran.nextInt(500);
	
	
	PojoClassToSendRequest pojo= new PojoClassToSendRequest("chethan", "tyss", "created", 06);
	
	 Response resp = given()
	.body(pojo)
	.contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject");
	 
	String pid = resp.jsonPath().get("projectId");
			System.out.println(pid);
			
			given()
			.pathParam("key", pid)
			.get("/projects/{key}")
			.then().assertThat().statusCode(200).log().all();

	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
			
	}
	

}
