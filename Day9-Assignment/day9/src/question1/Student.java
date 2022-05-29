package question1;

import java.util.Scanner;

public class Student {
	
	 private int roll;
	 private String name;
	 private int marks;
	 private char grade;
	 
	 public void displayDetails() {
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Roll :");
		 int a = scanner.nextInt();
		 System.out.println("Enter Name :");
		 String b = scanner.next();
		 System.out.println("Enter Marks :");
		 int c = scanner.nextInt();
		 
		 Student student = new Student();
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 student.calculateGrade(c);	 
	 }
	 private char calculateGrade(int marks) {
		 
		 this.grade=grade;
		 if(marks>=500)
		 {
			 grade = 'A';
		 }
		 else if(marks<500 && marks>=400)
		 {
			 grade = 'B';
		 }
		 else if(marks<400)
		 {
			 grade = 'C';
		 }
		 System.out.println("The Student's grade is :"+grade);
		 return grade;
	 }
	 @Override
	public String toString() {
		 return roll+" "+name+" "+marks+" "+grade;
		
	}
	 
	 Student(){
		 this.roll=roll;
		 this.name=name;
		 this.marks=marks;
		 this.grade=grade;
	 }	

}
