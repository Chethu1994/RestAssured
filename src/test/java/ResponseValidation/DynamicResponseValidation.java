package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidation {
	
	@Test
	 public void dynamicResponse() {
	baseURI="http://localhost";
	port= 8084;
	
	String expData = "TY_PROJ_404";
	
	//send request
	Response resp = when().get("projects");
	
	//validate response
	boolean flag = false;
	List<String> list = resp.jsonPath().get("projectId");
	  
	  for(String s :list) {
		  if(s.equalsIgnoreCase(expData)) {
			  flag=true;  //flag rising
			  break;
		  }
	  }
	Assert.assertTrue(flag);	
	}
	}

