package BasicRecursion;

import java.util.Scanner;

public class EvenOdd {
	
//	public static int Even(int s,int e) {
//		if (s>e) {
//			return 1;
//		}
//		if (s%2==0) {
//			System.out.print(s+" ");
//		}
//		return Even(s+1, e);
//	}
	
	
	public void Even(int s,int e) {
		if (e>s) {
			Even(s, e-1);
		}
		if (e%2==0) {
			System.out.print(e+" ");
		}
	}
	
	
//	public static int Odd(int s,int e) {
//		if (s>e) {
//			return 1;
//		}
//		if (s%2!=0) {
//			System.out.print(s+" ");
//		}
//		return Odd(s+1, e);
//	}
	
	public void Odd(int s,int e) {
		if (e>s) {
			Odd(s, e-1);
		}
		if (e%2!=0) {
			System.out.print(e+" ");
		}
	}

	public static void main(String[] args) {
		Scanner inScanner =new Scanner(System.in);
		System.out.println("Enter The Start : ");
		int s=inScanner.nextInt();
		System.out.println("Enter The End : ");
		int e=inScanner.nextInt();
		
		EvenOdd evenOdd= new EvenOdd();
		evenOdd.Even(s, e);
		System.out.println();
		evenOdd.Odd(s, e);

	}

}
