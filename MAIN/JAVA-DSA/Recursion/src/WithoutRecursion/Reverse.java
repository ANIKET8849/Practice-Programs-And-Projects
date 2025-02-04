package WithoutRecursion;

import java.util.Scanner;

public class Reverse {

	public void reverse(int n) {
		int rev=0,d;
		while (n!=0) {
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) {
		Scanner inScanner= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=inScanner.nextInt();
		Reverse reverse=new Reverse();
		reverse.reverse(n);

	}

}
