package IfElse;

import java.util.Scanner;

public class ValidTriangle {

	public boolean valid() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Sides Of Triangle : ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if (a<b+c || b<a+c || c<a+b) {
			return true;
		} else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		ValidTriangle vTriangle=new ValidTriangle();
		boolean ans= vTriangle.valid();
		if (ans) {
			System.out.println("This Is Valid Triangle.");
		}else {
			System.out.println("This Is Not A Valid Triangle.");
		}

	}

}
