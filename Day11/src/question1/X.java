package question1;

public interface X {
	
	void methodX1();
	
	default void methodX2() {
		
		System.out.println("I am in methodX2 of intr X");
		
	};
	
	static void methodX3() {
		System.out.println("I am in methodX3 of intr X");
	};
	

}
