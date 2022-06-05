package question1;

public class Student {
	
	private String roll;
	private String name;
	private int age;
	private int marks;
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		
		return age;
		
	}
	
	public int getMarks() {
		return marks;
	}
	
	
	public void setAge(int age) {
		
		if(age>=18 && age<=60) {
			this.age = age;
			getAge();
			
		}
		else {
			System.out.println("Enter age b/w 18-60");
		}
	}
		
	public void setMarks(int marks) {
		
		if(marks>=0 && marks<=500) {
			this.marks = marks;
			getMarks();
		}
		else {
			
			System.out.println("Enter marks b/2 0-500");
			
		}
	}
	
	public Student(String roll, String name, int age, int marks) {
//		super();
		this.roll = roll;
		this.name = name;
		if(age>=18 && age<=60)
		{
			this.age = age;
		}
		else {
			System.out.println("Enter age b/w 18-60");
		}
		if(marks>=0 && marks<=500)
		{
			this.marks = marks;
		}
		else
		{
			System.out.println("Enter marks b/2 0-500");
		}
		
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
