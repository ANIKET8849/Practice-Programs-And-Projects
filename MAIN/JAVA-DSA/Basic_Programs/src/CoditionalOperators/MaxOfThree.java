package CoditionalOperators;

import java.util.Scanner;

public class MaxOfThree {

	public void max3() {
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter Three Numbers : ");
		int a=inScanner.nextInt();
		int b=inScanner.nextInt();
		int c=inScanner.nextInt();
		
		int max=((a>b)?((a>c)?a:c):((b>c)?b:c));
		System.out.println(max);
		
	}
	public static void main(String[] args) {
		MaxOfThree mThree =new MaxOfThree();
		mThree.max3();

	}

}
