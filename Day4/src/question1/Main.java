package question1;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("10","Sam",-18,-400);
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getMarks());
		
		Student s2 = new Student();
		s2.setRoll("20");
		System.out.println(s2.getRoll());
		s2.setName("Jon");
		System.out.println(s2.getName());
		s2.setAge(-20);
		System.out.println(s2.getAge());
		s2.setMarks(-500);
		System.out.println(s2.getMarks());
				

	}

}
