package question2;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public static Hosteller getHostellerDetails() {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Student Id :");
			int a = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Enter name :");
			String b = scanner.nextLine();
			
			System.out.println("Enter Department ID :");
			int c = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Enter Gender :");
			String d = scanner.nextLine();
			
			System.out.println("Enter phone :");
			String e = scanner.nextLine();
			
			System.out.println("Enter Hostel Name :");
			String f = scanner.nextLine();
			
			System.out.println("Enter Room Number :");
			int g = scanner.nextInt();
			
			Hosteller hosteller = new Hosteller();
			
			hosteller.setStudentId(a);
			hosteller.setName(b);
			hosteller.setDepartmentId(c);
			hosteller.setGender(d);
			hosteller.setPhone(e);
			hosteller.setHostelName(f);
			hosteller.setRoomNumber(g);
			
			System.out.println(hosteller.getStudentId());
			System.out.println(hosteller.getName());
			System.out.println(hosteller.getDepartmentId());
			System.out.println(hosteller.getGender());
			System.out.println(hosteller.getPhone());
			System.out.println(hosteller.getHostelName());
			System.out.println(hosteller.getRoomNumber());
			
		}

	//}

}
