package Assignment1;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num2=sc.nextInt();
		
		for(int num1=1;num1<=num2;num1++) {
			if(num1%2!=0) {
				System.out.println("The Number Is  "+num1);
			}
		}

	}

}
