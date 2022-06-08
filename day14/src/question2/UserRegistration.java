package question2;

import java.util.Scanner;

public class UserRegistration{
	
	void registerUser(String username, String userCountry)  throws InvalidCountryException
	{
		if(userCountry.equals("India"))
		{
			System.out.println("User registration done successfully");
		}
		else
		{
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = s.next();
		
		System.out.println("Enter Your Country");
		String country = s.next();
		
		UserRegistration ur = new UserRegistration();
		
		
		try {
			ur.registerUser(name, country);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
			
		
	}

}
