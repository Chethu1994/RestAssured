package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializatonDeserialization.EmployeeDetailsWithArray;

public class DserializationEmpDetailsWithArray {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//Step1: Create object of Object Mapper class
		ObjectMapper obj= new ObjectMapper();
	
			
	//Step2: Call the Read Value method and store it in variable
	  EmployeeDetailsWithArray e1 = obj.readValue(new File("./EmployeeDetailsWithArray.json"),EmployeeDetailsWithArray.class);
	 
	 //Step3: Using getters and setters
	  System.out.println(e1.getDesignation());
		 System.out.println(e1.getEmail());
		 System.out.println(e1.getId());
		 System.out.println(e1.getName());
		 
}
	}


