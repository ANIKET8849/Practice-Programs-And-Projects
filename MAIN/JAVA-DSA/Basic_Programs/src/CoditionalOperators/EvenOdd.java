package CoditionalOperators;

import java.util.Scanner;

public class EvenOdd {

	void max() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int a=iScanner.nextInt();
		
		
		String max=(a%2==0)? "Even": "Odd";
		System.out.println(max);
	}
	public static void main(String[] args) {
		EvenOdd evenOdd =new EvenOdd();
		evenOdd.max();

	}

}
