
package CrudWithOutBdd;

import static io.restassured.RestAssured.*;

import java.net.http.HttpRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProjectTest {
	@Test
	public void deleteProjectTest() {
		
		//specify baseURI
		baseURI="https://reqres.in/api/users?page=2";
		
		//Request Object
		RequestSpecification httpRequest = given();
		
		//print response in console window/Request payload sending along with post request
		JSONObject requestParams= new  JSONObject();
		requestParams.put("id", 14);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString()); //attach above data to the request
		
		//response object
		Response respns =httpRequest.request(Method.DELETE);
		String responseBody = respns.getBody().asString();
		System.out.println("Response body is:"+responseBody);
		
		//status code validation
		int statusCode = respns.getStatusCode();
		System.out.println("Status code is:"+statusCode);
		Assert.assertEquals(statusCode, 204);
		
		
		
		
	}

}
