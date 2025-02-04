package IfElse;

import java.util.Scanner;

public class MaxOfTwo {

	public static void main(String[] args) {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		int a=iScanner.nextInt();
		int b=iScanner.nextInt();
		
		if (a>b) {
			System.out.println(a+" Is Maximum Number.");
		} else {
			System.out.println(b+" Is Maximum Number.");
		}

	}

}
