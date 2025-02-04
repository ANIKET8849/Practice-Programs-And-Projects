package IfElse;

import java.util.Scanner;

public class EvenOdd {

	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Numbers :");
		int a=iScanner.nextInt();
		
		
		if (a%2==0) {
			System.out.println(a+" Is Even Number.");
		}else {
			System.out.println(a+" Is Odd Number.");
		}
	}
	public static void main(String[] args) {
		EvenOdd eOdd=new EvenOdd();
		eOdd.check();

	}

}
