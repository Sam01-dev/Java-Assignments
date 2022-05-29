package question3;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		
		if(bank.equals("axis"))
		{
			 AxisBank axisBank = new AxisBank();
			 axisBank.setBranchName("Behala");
			 axisBank.setIfscCode("AXIS0404");
			 axisBank.setRateOfInterest(15.00);
			 System.out.println(axisBank.getBranchName());
			 System.out.println(axisBank.getIfscCode());
			 System.out.println(axisBank.getRateOfInterest());
			 axisBank.getCreditCard();
			 return axisBank;
		}
		else if(bank.equals("icici"))
		{
			ICICIBank iciciBank = new ICICIBank();
			iciciBank.setBranchName("Bangalore");
			iciciBank.setIfscCode("ICICI0404");
			iciciBank.setRateOfInterest(20.00);
			 System.out.println(iciciBank.getBranchName());
			 System.out.println(iciciBank.getIfscCode());
			 System.out.println(iciciBank.getRateOfInterest());
			return iciciBank;
		}
		else
		{
			System.out.println("Error");
			return null;
		}
		
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter bank name");
		String aString = scanner.next();
		
		//Demo demo = new Demo();
		Demo.getBank(aString);

	}

}
