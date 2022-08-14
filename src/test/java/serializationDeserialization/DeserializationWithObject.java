package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializatonDeserialization.EmployeeDetailsWithObject;

public class DeserializationWithObject {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
 
		ObjectMapper obj= new ObjectMapper();
		
	 EmployeeDetailsWithObject e1 = obj.readValue(new File(".\\EmployeeDetailsWithObject.json"), EmployeeDetailsWithObject.class);
	 
	 System.out.println(e1.getSpouse());
	 System.out.println(e1.getId());
	 System.out.println(e1.getName());
	}

}
