package IfElse;

import java.util.Scanner;

public class MaxOfThree {

	public void max(int a,int b, int c) {
		
		if (a>b) {
			if (a>c) {
				System.out.println(a+" Is Maximum Number.");
			} else {
				System.out.println(c+" Is Maximum Number.");
			}
		} else {
			if (b>c) {
				System.out.println(b+" Is Maximum Number.");
			} else {
				System.out.println(c+" Is Maximum Number.");
			}
		}
	}
	public static void main(String[] args) {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		int a=iScanner.nextInt();
		int b=iScanner.nextInt();
		int c=iScanner.nextInt();
		
		MaxOfThree max =new MaxOfThree();
		max.max(a, b, c);

	}

}
