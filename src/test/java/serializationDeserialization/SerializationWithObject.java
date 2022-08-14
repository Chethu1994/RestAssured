package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializatonDeserialization.EmployeeDetailsWithObject;
import pojoForSerializatonDeserialization.Spouse;

public class SerializationWithObject {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
	
	int[] phno= {123456,456789};
	//Spouse sp= new Spouse("abc",123, "infy");
	Spouse sp=new Spouse("dingi", 123, "infy");
	
	
EmployeeDetailsWithObject emp = new EmployeeDetailsWithObject("chethan", "tyss", phno, sp);
ObjectMapper obj= new ObjectMapper();

   obj.writeValue(new File("./EmployeeDetails.json"), emp);
   
}}