package BasicRecursion;

import java.util.Scanner;

public class Factorial {
	static int fact(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=in.nextInt();
		Factorial f = new Factorial();
		int ans=f.fact(n);
		System.out.println(ans);

	}

}
