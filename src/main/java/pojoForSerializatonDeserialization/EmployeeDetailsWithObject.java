package pojoForSerializatonDeserialization;

public class EmployeeDetailsWithObject {
	
	String name;
	String id;
	int[] phno;
	Object spouse;
	
	
	EmployeeDetailsWithObject(){
		}
	
	public EmployeeDetailsWithObject(String name, String id, int[] phno, Object spouse) {
		
		this.name = name;
		this.id = id;
		this.phno = phno;
		this.spouse = spouse;
	}

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

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
	

}
