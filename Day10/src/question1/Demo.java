package question1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount>=1000) {
			Hotel h1=new TajHotel();
			return h1;
		}
		else if(amount>=200 && amount<=1000) {
			Hotel h1=new RoadSideHotel();
			return h1;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount :");
		int a = scanner.nextInt();
		
		Demo demo = new Demo();
		if(demo.provideFood(a)instanceof TajHotel) {
			Hotel hotel=new TajHotel();
			TajHotel t1=(TajHotel) hotel;
			hotel.chickenBiryani();
			hotel.masalaDosa();
			t1.welcomeDrink();
			
			
		}
		else if(demo.provideFood(a)instanceof RoadSideHotel) {
			RoadSideHotel road=new RoadSideHotel();
			RoadSideHotel r1=(RoadSideHotel)road;
			r1.chickenBiryani();
			r1.masalaDosa();
			
		}
		else {
			System.out.println("enter a valid number");
		}
		
		
	}

}
