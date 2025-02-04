package methods;

import java.util.Scanner;

public class ParameterizedMethods {

	public void printName(String myname) {
		System.out.println("My name is "+myname);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		ParameterizedMethods pm=new ParameterizedMethods();
		pm.printName(name);
		

	}

}
