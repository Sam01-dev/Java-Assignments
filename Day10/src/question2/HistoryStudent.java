package question2;

public class HistoryStudent extends Student{
	
	int historyMarks;
	public int getHistoryMarks() {
		return historyMarks;
	}


	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}


	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}


	int civicsMarks;
	
	
	
	HistoryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	HistoryStudent(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		//super.getPercentage();
		double total=getHistoryMarks()+getCivicsMarks();
		System.out.println(total);
		double result=(total/200)*100;
		System.out.println("result is: "+result);
	}


	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", name=" + name
				+ ", address=" + address + "]";
	}
	
	
	
	
	

}
