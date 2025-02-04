package structures;

public class SwitchCase {

	public static void main(String[] args) {
		int choice=5;
		
		switch(choice) {
		case 1: 
			System.out.println("You are in case 1");
			break;
			
		case 2:
			System.out.println("You are in case 2");
			break;
			
		case 3:
			System.out.println("You are in case 3");
			break;
			
		default:
			System.out.println("You have entered wrong choice!!");
			break;
		}
	}

}
