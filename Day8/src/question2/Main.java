package question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] array = new Animal[3];
		
		Dog dog = new Dog();
		
		array[0]=dog;
		
		Cat cat = new Cat();
		
		array[1]=cat;
		
		Tiger tiger = new Tiger();
		
		array[2]=tiger;
		
		array[0].eat();
		array[0].walk();
		array[0].makeNoise();
		System.out.println("===============");
		array[1].eat();
		array[1].walk();
		array[1].makeNoise();
		System.out.println("===============");
		array[2].eat();
		array[2].walk();
		array[2].makeNoise();
		System.out.println("===============");
		
		

	}

}
