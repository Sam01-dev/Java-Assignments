package question1;

public class Account {
	
	String accountNumber;
	double Balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	void deposit(double amount) {
		Balance+=amount;
		System.out.println("Your Balance Is"+" "+Balance);
	}
	
	double withdraw(double amount) {
		
		double take = this.Balance-amount;
		//this.Balance = take;
		if(take>0)
		{
			return take;
		}
		else
		{
			String error = "Insufficient Balance";
			double error1 = Double.parseDouble(error);
			return error1;
		}
		
	}

}
