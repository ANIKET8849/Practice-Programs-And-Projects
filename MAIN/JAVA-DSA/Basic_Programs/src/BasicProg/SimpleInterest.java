package BasicProg;

import java.util.Scanner;

public class SimpleInterest {

	void simpInterest() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Principle : ");
		int p=in.nextInt();
		System.out.println("Enter The Time : ");
		int t=in.nextInt();
		System.out.println("Enter The Rate Of Interst Per Year : ");
		int r=in.nextInt();
		 int si=(p*t*r)/100;
		 System.out.println(si);
		
	}
	public static void main(String[] args) {
		SimpleInterest sInterest =new SimpleInterest();
		sInterest.simpInterest();

	}

}
