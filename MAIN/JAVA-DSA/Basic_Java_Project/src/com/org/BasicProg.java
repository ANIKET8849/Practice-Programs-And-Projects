package com.org;

import java.util.Scanner;

public class BasicProg {

	String  name;
	int rollno;
	
	public void setdetails() {
		Scanner sc=new Scanner(System.in);
		String[] student=new String[3];
		
		System.out.println("Enter Student Name : ");
		name=sc.nextLine();
		System.out.println("Enter Student RollNo. : ");
		rollno=sc.nextInt();
	}
	public void printdetails() {
		System.out.println("The Student Name Is : "+name);
		System.out.println("The Student RollNo Is : "+rollno);
	}
	public static void Main(String args[]) {
		
		
	}
}
