package question1;

import java.util.Scanner;

public class AccountDemo{

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.println("Enter Account Number");
		String a = s.next();
		account.setAccountNumber(a);
		
		System.out.println("Enter Deposit Amount");
		int deposit = s.nextInt();
		account.deposit(deposit);
		
		System.out.println("Enter Amount to Withdraw");
		double withdraw = s.nextDouble();
		
		try {
		if(withdraw<=account.getBalance())
		{
			System.out.println(account.withdraw(withdraw));
		}
		else
		{
			InsufficientFundsException ife = new InsufficientFundsException("Insufficient Funds");
			throw ife;
			
		}
		}
		catch(InsufficientFundsException ife) {
		
			System.out.println(ife.getMessage());
		
		}

	}

}
