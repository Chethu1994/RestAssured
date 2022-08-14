package pojoForSerializatonDeserialization;

public class Spouse {
	
	String name;
	int sPhone;
	String sCmpny;
	public Spouse(String name, int sPhone, String sCmpny) {
		
		this.name = name;
		this.sPhone = sPhone;
		this.sCmpny = sCmpny;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getsPhone() {
		return sPhone;
	}
	public void setsPhone(int sPhone) {
		this.sPhone = sPhone;
	}
	public String getsCmpny() {
		return sCmpny;
	}
	public void setsCmpny(String sCmpny) {
		this.sCmpny = sCmpny;
	}

}
