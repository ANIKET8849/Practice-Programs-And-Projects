package BasicProg;

import java.util.Scanner;

public class SquareRoot {

	void square(int n) {
		 
		float sqrt=n,temp=0;
		while (sqrt!=temp) {
			temp=sqrt;
			sqrt=(n/temp+temp)/2;
		}
		System.out.println(sqrt+" This Is Square Root Of "+n);
	}
	public static void main(String[] args) {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=iScanner.nextInt();
		SquareRoot sRoot=new SquareRoot();
		sRoot.square(n);
	}

}
