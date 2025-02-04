package IfElse;

import java.util.Scanner;

public class DivisibleBy {

	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Numbers :");
		int a=iScanner.nextInt();
		
		
		if (a%5==0) {
			System.out.println(a+" Is Divisible By 5.");
		} else if (a%11==0) {
			System.out.println(a+" Is Divisible By 11.");
		}else {
			System.out.println(a+" Is Not Divisible By 5 & 11.");
		}
	}
	public static void main(String[] args) {
		DivisibleBy divisibleBy =new DivisibleBy();
		divisibleBy.check();

	}

}
