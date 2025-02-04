package oops.com.org;

import java.util.Scanner;

/*  Create a class named Bank. Create its subclasses namely SBI, ICICI, HDFC,
AXIS. Every class will contain a method with name ‘getRateOfInterest()’
and print the rate of interest of each bank.  */

class SBI{
	
public void	getRateOfInterest()
	{
		
	}
}
class ICICI extends SBI{
	
}
class HDFC extends ICICI{
	
}
class AXIS extends HDFC{
	
	
}
public class Bank {

	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		System.out.println("Bank Details:");
		
		System.out.println("Enter the Principle Amount:");
		int amnt=sc.nextInt();
		
		System.out.println("Enter the Rate:");
		float rate=sc.nextFloat();
		
		System.out.println("Enter the Time in Year:");
		int time=sc.nextInt();
 
		
		

		
		
		
	}

}
