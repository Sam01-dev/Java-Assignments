package question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b1 = new Parrot();
		
		b1.fly();
		
		Parrot p1 = (Parrot) b1;
		p1.sing();
		
		//The ClassCastException is one of the unchecked
		//exception in Java. It can occur in our program
		//when we tried to convert an object of one class
		//type into an object of another class type.
		//When we try to cast an object of Parent class to
		//its Child class type, this exception is thrown.
		
		
		//Dynamic polymorphism is a process or mechanism in
		//which a call to an overridden method is to resolve 
        //at runtime rather than compile-time. It is also 
		//known as runtime polymorphism or dynamic method 
		//dispatch. We can achieve dynamic polymorphism by 
		//using the method overriding.

	}

}
