package assignment;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeserialization {

	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		Employees e = new Employees();
		
		e.setEmpNo(10);
		e.setEmpName("Abhay Yadav");
		e.setEmpGender("Male");
		e.setEmpAge(23);
		e.setEmpAddress("Pune");
		
		String JsonString = mapper.writeValueAsString(e);
		
		System.out.println("Serialization : Object to String ");		
		System.out.println(JsonString);
		
		Employees emp = mapper.readValue(new File("C:\\NicheThyself\\API\\Assignments\\JSONfile2.json"), Employees.class);
		
		System.out.println("\n"+"Deserialization : File to Object ");
		emp.displayObjectDetails();		

	}

	
}
