package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class QueryParameter {
@Test
public void queryP() {
	baseURI="https://reqres.in";
	
	given()
	       .queryParam("page", 2)
	       .when()
	       .get("/api/users")
	       .then().log().all();
}

}
