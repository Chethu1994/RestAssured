package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializatonDeserialization.EmployeeDetails;

public class SerializationEmpDetails {

 public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
	
	//Step1: create object of pojo class and initialize
 EmployeeDetails emp = new EmployeeDetails("Chethan","Ty123456","chethankumarhosmane@gmail.com",12345,"SDET");
			
	//Step2: create object of object Mapper class
		ObjectMapper obj= new ObjectMapper();
	
			
	//Step3: from object mapper call the method writeValue()
	  obj.writeValue(new File("./EmployeeDetails.json"), emp);
}
}