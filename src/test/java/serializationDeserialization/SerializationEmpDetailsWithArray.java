package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializatonDeserialization.EmployeeDetailsWithArray;

public class SerializationEmpDetailsWithArray {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		int[] phno= {1234,4567};
				
		//Step1: create object of pojo class and initialize
EmployeeDetailsWithArray emp= new EmployeeDetailsWithArray("chethan","tyss234",phno, "chethan@gmail.com", "SDET");

//Step2: create object of object Mapper class
		ObjectMapper obj= new ObjectMapper();
		
		//Step3: from object mapper call the method writeValue()
		obj.writeValue(new File("./EmployeeDetailsWithArray.json"), emp);
	}
		}


