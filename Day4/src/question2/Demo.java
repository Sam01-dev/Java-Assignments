package question2;

public class Demo {
	
	Demo(){
		
		System.out.println("I am part of Demo()");
		
	}
	
	Demo(String s){
		System.out.println("I am part of Demo(String s)");
	}
	
	Demo(int i){
		System.out.println("I am part of Demo(int i)");
		
	}
	
	Demo(float f){
		System.out.println("I am part of Demo(float f)");
		
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		Demo demo2 = new Demo(10);
		Demo demo3 = new Demo(10);
		Demo demo4 = new Demo("Sam");
		
		
		
		
		
	}

}
