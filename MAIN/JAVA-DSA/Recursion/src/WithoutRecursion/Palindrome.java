package WithoutRecursion;

import java.util.Scanner;

public class Palindrome {
	public void palindrame(int n) {
		int rev=0,d,n1=n;
		while (n!=0) {
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		if (n1==rev) {
			System.out.println("The Number Is Palindrome : "+n1);
		} else {
			System.out.println("The Number Is Not PalinDrome : "+n1);
		}
	}

	public static void main(String[] args) {
		Scanner inScanner= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=inScanner.nextInt();
		Palindrome palindrome=new Palindrome();
		palindrome.palindrame(n);
	}
}
