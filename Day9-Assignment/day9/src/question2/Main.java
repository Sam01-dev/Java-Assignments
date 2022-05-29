package question2;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
	System.out.println("Enter Number");
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a>=1 && a<=10)
		{
			Parent parent = new Child();
			parent.method1(a);
		}
		else
		{
			System.out.println("Invalid Number");
		}
		
		
	}

}
