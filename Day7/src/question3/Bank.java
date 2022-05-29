package question3;

public class Bank {

	String branchName;
	String ifscCode;
	
	public String getBranchName() {
		return branchName;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	void displayDetails(String a, String b) {
		setBranchName(a);
		setIfscCode(b);
		System.out.println(getBranchName());
		System.out.println(getIfscCode());
	}
}
