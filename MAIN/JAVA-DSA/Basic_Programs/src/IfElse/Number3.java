package IfElse;

import java.util.Scanner;

public class Number3 {

	void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Numbers :");
		int a=iScanner.nextInt();
		
		
		if (a>0) {
			System.out.println(a+" Is Positive Number.");
		} else if (a==0) {
			System.out.println(a+" Is Zero.");
		}else {
			System.out.println(a+" Is Negative Number.");
		}
	}
	public static void main(String[] args) {
		Number3 number3 =new Number3();
		number3.check();

	}

}
