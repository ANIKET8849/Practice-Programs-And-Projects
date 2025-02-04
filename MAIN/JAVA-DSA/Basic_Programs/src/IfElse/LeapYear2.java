package IfElse;

import java.util.Scanner;

public class LeapYear2 {

	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Year :");
		int a=iScanner.nextInt();
		
		
		if (a%400==0) {
			System.out.println(a+" this Is The Leap Year.");
		} else if (a%100==0) {
			System.out.println(a+" This Is Not A Leap Year.");
		} else if (a%4==0) {
			System.out.println(a+" This Is Leap Year.");
		}else {
			System.out.println(a+" This Is Not A Leap Year.");
		}
	}
	public static void main(String[] args) {
		LeapYear2 lYear2 =new LeapYear2();
		lYear2.check();

	}

}
