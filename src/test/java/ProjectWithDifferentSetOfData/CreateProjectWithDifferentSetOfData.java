package ProjectWithDifferentSetOfData;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectLibrary.PojoClassToSendRequest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithDifferentSetOfData {

	@Test(dataProvider ="projectWithDifferentData")
	public void createProjectWithDifferentData(String createdBy,String projectName,String status,int teamSize) {


		Random rand = new Random();
		int randnum = rand.nextInt(300);

		baseURI="http://localhost";
		port= 8084;

		PojoClassToSendRequest pojo= new PojoClassToSendRequest(createdBy, projectName+randnum, status, teamSize);

		given()
		.body(pojo)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().log().all();
	}

	@DataProvider
	public Object[][] projectWithDifferentData(){
		Object[][] objarray= new Object[5][4];

		Random rdm = new Random();
		rdm.nextInt(300);

		objarray[0][0]="Chethan";
		objarray[0][1]="idfc"+rdm;
		objarray[0][2]="Ongoing";
		objarray[0][3]=5;

		objarray[1][0]="Jayanth";
		objarray[1][1]="Axis"+rdm;
		objarray[1][2]="Completed";
		objarray[1][3]=6;	

		objarray[2][0]="Adarsh";
		objarray[2][1]="Kotak"+rdm;
		objarray[2][2]="InProcess";
		objarray[2][3]=7;	

		objarray[3][0]="Darshan";
		objarray[3][1]="Icici"+rdm;
		objarray[3][2]="Completed";
		objarray[3][3]=8;

		objarray[4][0]="Sumanth";
		objarray[4][1]="Canara"+rdm;
		objarray[4][2]="Created";
		objarray[4][3]=9;

		return objarray;
	}
}
