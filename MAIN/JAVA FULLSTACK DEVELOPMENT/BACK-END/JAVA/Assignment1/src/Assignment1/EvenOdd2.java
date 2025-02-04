package Assignment1;

import java.util.*;

public class EvenOdd2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The Number Is Even Number ");
		}
		else {
			System.out.println("The Number Is Odd Number ");
		}
	}

}
