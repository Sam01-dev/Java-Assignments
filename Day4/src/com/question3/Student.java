package com.question3;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private String collegeName;
	
	Student(){
		
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(int roll,String name,String address)
	{
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = "NIT";
	}
	public Student(int roll,String name,String address,String collegeName) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
		
	}
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT==true)
		{
			Student s1 = new Student(1,"Sam","Kol");
			return s1;
			
		}
		else {
			Student s2 = new Student(2,"Jo","Cal","ITN");
			return s2;
			
		}
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", collegeName=" + collegeName
				+ "]";
	}
	
	

}
