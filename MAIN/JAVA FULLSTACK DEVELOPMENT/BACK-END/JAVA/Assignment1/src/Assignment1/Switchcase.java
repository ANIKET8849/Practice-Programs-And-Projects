package Assignment1;

import java.util.*;

public class Switchcase {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First Number : ");
		double num1=sc.nextDouble();
		
		System.out.println("Enter The Second Number : ");
		double num2=sc.nextDouble();
		
		System.out.println("Enter Your Choice (1,2,3,4) :");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println(num1+num2);
			break;
			
		case 2:
			System.out.println(num1-num2);
			break;
			
		case 3:
			System.out.println(num1*num2);
			break;
			
		case 4:
			System.out.println(num1/num2);
			break;
			
		default:
			System.out.println("You Have Entered Wrong Choice : ");
			break;
		}
		
			
	}

}
