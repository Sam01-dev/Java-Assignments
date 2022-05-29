package question1;

public class Student {
	
	int studId;
	String studName;
	double examFee;
	
	
	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}

	public void displayDetails() {
		
	}
	
	public double payFee(double a) {
		
		return(getExamFee()+a);
	}
	
//	Student(int a, String b,double c ){
//		
//		this.studId = a;
//		this.studName = b;
//		this.examFee = c;
//		
//	}
public static void main(String[] args) {
		
		Student student = new Student();
		student.setExamFee(2000);
		
		
		DayScholar dayScholar = new DayScholar();
		dayScholar.setTransportFee(100);
		System.out.println(student.payFee(dayScholar.getTransportFee()));
		
		Hosteller hosteller = new Hosteller();
		hosteller.setHostelFee(200);
		System.out.println(student.payFee(hosteller.getHostelFee()));
		
		
	}

}


