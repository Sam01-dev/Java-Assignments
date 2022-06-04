package question2;

public abstract class Student {
	
	String name;
	String address;
	
	
	void getPercentage() {
		
		
	}

	Student(){
		
	}
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
