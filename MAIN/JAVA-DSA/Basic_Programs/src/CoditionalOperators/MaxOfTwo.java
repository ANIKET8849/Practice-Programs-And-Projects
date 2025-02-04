package CoditionalOperators;

import java.util.Scanner;

public class MaxOfTwo {

	void max() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		int a=iScanner.nextInt();
		int b=iScanner.nextInt();
		
		int max=(a>b)?a:b;
		System.out.println(max);
	}
	public static void main(String[] args) {
		MaxOfTwo mTwo =new MaxOfTwo();
		mTwo.max();

	}

}
