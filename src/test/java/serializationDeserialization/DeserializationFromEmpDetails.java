package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializatonDeserialization.EmployeeDetails;

public class DeserializationFromEmpDetails {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		
		//Step1: Create object of Object Mapper class
			ObjectMapper obj= new ObjectMapper();
		
				
		//Step2: Call the Read Value method and store it in variable
		 EmployeeDetails e1 = obj.readValue(new File(".\\EmployeeDetails.json"), EmployeeDetails.class);
		 
		 //Step3: Using getters and setters
		 System.out.println(e1.getDesignation());
		 System.out.println(e1.getEmail());
		 System.out.println(e1.getEmpId());
		 System.out.println(e1.getEmpName());
	}

}
