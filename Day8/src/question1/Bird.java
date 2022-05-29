package question1;

public class Bird {
	
	public void fly() {
		
		System.out.println("Bird is flying");
	}

}

class Parrot extends Bird{
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		//super.fly();
		System.out.println("I am flying");
	}
	public void sing(){
		System.out.println("I am Singing");
	}
	
	
	
}
