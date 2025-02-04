package WithoutRecursion;

import java.util.Scanner;

public class EvenAndOdd {
	void even(int s,int e) {
		System.out.println("The Even Numbers Are : ");
		for (int i = s; i<=e; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	void odd(int s,int e) {
		System.out.println("The Odd Numbers Are : ");
		for (int i = s; i <=e; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Start Number : ");
		int s=iScanner.nextInt();
		System.out.println("Enter The End Number : ");
		int e=iScanner.nextInt();
		EvenAndOdd evenAndOdd=new EvenAndOdd();
//		evenAndOdd.even(s, e);
		evenAndOdd.odd(s, e);
	}

}
