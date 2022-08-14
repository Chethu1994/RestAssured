package pojoForSerializatonDeserialization;
/**
 * This is a pojo class to store employee details
 * @author chethu
 *
 */
public class EmployeeDetails {
	
//Step1:declare all the necessary variables as global
	
	String empName;
	String empId;
	String email;
	int phno;
	String designation;
	
	
	
	//create empty constructor
	
	public EmployeeDetails(){
		
}
	//Step2:create a constructor to initialize these variables

	public EmployeeDetails(String empName, String empId, String email, int phno, String designation) {
		
		this.empName = empName;
		this.empId = empId;
		this.email = email;
		this.phno = phno;
		this.designation = designation;
	}

	//Step:provide  getters and setters to access these variables

	public String getEmpName(){
		return empName;
	}


	public String getEmpId() {
		return empId;
	}


	public String getEmail() {
		return email;
	}


	public int getPhno() {
		return phno;
	}


	public String getDesignation(){
		return designation;
	}
}
