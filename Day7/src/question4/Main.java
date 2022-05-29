package question4;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setName("John");
		employee.setAge(10);
		employee.setPhoneNumber("12345678");
		employee.setAddress("LA");
		employee.setSpecialisation("Software Engineer 1");
		employee.setDepartment("STS");
		//employee.setSalary(50000.00);
		
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getPhoneNumber());
		System.out.println(employee.getAddress());
		employee.printSalary(50000.00);
		System.out.println(employee.getSpecialisation());
		System.out.println(employee.getDepartment());
		
		System.out.println("============================");
		
		Manager manager = new Manager();
		
		manager.setName("Brad");
		manager.setAge(20);
		manager.setPhoneNumber("12340000678");
		manager.setAddress("Miami");
		//manager.setSalary(60000.00);
		
		System.out.println(manager.getName());
		System.out.println(manager.getAge());
		System.out.println(manager.getPhoneNumber());
		System.out.println(manager.getAddress());
		manager.printSalary(60000.00);
		
		

	}

}
