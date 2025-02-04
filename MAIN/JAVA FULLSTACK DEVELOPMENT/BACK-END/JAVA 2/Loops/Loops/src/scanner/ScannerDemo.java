package scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
//		System.out.println("My name is "+name);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
//		System.out.println("My age is "+age);
		
		if(age>=18) {
			System.out.println("Hello, "+name+" You are eligible to vote!");
		}
		else {
			System.out.println("Hello, "+name+" You are not eligible to vote!");
		}
	}

}
