package BasicProg;

import java.util.Scanner;

public class CompoundInterest {

	void compInterest() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Principle : ");
		int p=in.nextInt();
		System.out.println("Enter The Time : ");
		int t=in.nextInt();
		System.out.println("Enter The Rate Of Interst Per Year : ");
		int r=in.nextInt();
		System.out.println("Enter The Interst Compounded Per Year : ");
		int n=in.nextInt();
		double a;
		a=(p*Math.pow((1+(r/(100*n))), n*t));
		 
		 System.out.println(a);
		
	}
	public static void main(String[] args) {
		CompoundInterest cInterest=new CompoundInterest();
		cInterest.compInterest();

	}

}
