package question3;

import java.util.Scanner;

public class IPL {
	
	void homeTeamStadium(Stadium stadium) {
		
		try {
			switch (stadium) {
			case EDEN_GARDENS_STADIUM:
				System.out.println("KKR");
				break;
			case CHIDAMBARAM_STADIUM:
				System.out.println("CSK");
				break;
			case M_CHINNASWAMY_STADIUM:
				System.out.println("RCB");
				break;
			case WANKHEDE_STADIUM:
				System.out.println("MI");
			}
		}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
	}
	
	public static void main(String[] args) {
		IPL ipl=new IPL();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:");
		String str=scanner.next();
		
		ipl.homeTeamStadium(Stadium.valueOf(str));
	}
}
