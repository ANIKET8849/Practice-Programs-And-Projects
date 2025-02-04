package BasicRecursion;

import java.util.Scanner;

public class EvenOdd2 {

	
	public static int Even(int s, int e,int a) {
		if (s>e) {
			System.out.println(a);
			return 1;
		}
		if (s%2==0) {
			a=a+s;
		}
		return Even(s+1, e, a);
	}
	
	public static int Odd(int s, int e,int a) {
		if (s>e) {
			System.out.println(a);
			return 1;
		}
		if (s%2!=0) {
			a=a+s;
		}
		return Odd(s+1, e, a);
	}
	public static void main(String[] args) {
		Scanner inScanner =new Scanner(System.in);
		System.out.println("Enter The Start : ");
		int s=inScanner.nextInt();
		System.out.println("Enter The End : ");
		int e=inScanner.nextInt();
		int a=0;
		
		EvenOdd2 eOdd2=new EvenOdd2();
		eOdd2.Even(s, e,a);
		System.out.println();
		eOdd2.Odd(s, e,a);

	}

}
