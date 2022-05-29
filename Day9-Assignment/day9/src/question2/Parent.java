package question2;

public class Parent {
	
	void method1(int a){
		//this method belongs to parent class
		final int number = a;
		System.out.println(number);	
	}
	final void method2() {
		//this method belongs to parent class
		
	}
	void method3() {
		//this method belongs to parent class
		
	}
}
final class Child extends Parent{
	
	void method4() {
		
		//this method belongs to child class
		
		
	}
	
}

