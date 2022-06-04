package question1;

public interface Y {
	
	void methodY1();
	
	default void methodY2() {
		System.out.println("I am in methodY2 of intr Y");
		
	};
	
	static void methodY3() {
		System.out.println("I am in methodY3 of intr Y");
	};

}
