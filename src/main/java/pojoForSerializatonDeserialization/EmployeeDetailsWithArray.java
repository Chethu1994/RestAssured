package pojoForSerializatonDeserialization;

public class EmployeeDetailsWithArray {

	//Step1:declare all the necessary variables as global
String name;
String id;
int[] phno;
String email;
String designation;

//Step2:create a constructor to initialize these variables

//Create an empty constructor
EmployeeDetailsWithArray(){
	
}
public EmployeeDetailsWithArray(String name, String id, int[] phno, String email, String designation) {
	
	this.name = name;
	this.id = id;
	this.phno = phno;
	this.email = email;
	this.designation = designation;
}

	//Step:provide  getters and setters to access these variables
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int[] getPhno() {
	return phno;
}

public void setPhno(int[] phno) {
	this.phno = phno;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}








}

