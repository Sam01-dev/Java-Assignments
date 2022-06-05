package com.question4;

public class Question4 {
	
	void run(int n) {
		
		if(n%2==1)
		{
			System.out.println(n);
		}
		if(n%2==0)
		{
			System.out.println(n-(n%10)+10);
		}
		if(n<0)
		{
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		
		Question4 s = new Question4();
		
		s.run(-5);
		
		
	}

}
