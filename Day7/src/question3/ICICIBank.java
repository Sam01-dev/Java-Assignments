package question3;

public class ICICIBank extends Bank {
	
	double rateOfInterest;
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	
	void displayDetails(String a, String b, double c) {
		setBranchName(a);
		setIfscCode(b);
		setRateOfInterest(c);
		System.out.println(getBranchName());
		System.out.println(getIfscCode());
		System.out.println(getRateOfInterest());
	};

}
