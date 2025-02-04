package Assignment1;

import java.util.*;

public class Salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Basic Salary : ");
		int basic=sc.nextInt();
		
		if(basic<=10000) {
			double hra=20*basic/100;
			double da=80*basic/100;
			System.out.println("The Basic Salary Is : "+basic);
			System.out.println("The Basic HRA Is : "+hra);
			System.out.println("The Basic DA Is : "+da);
		}
		else if(basic<=20000) {
			double hra2=25*basic/100;
			double da2=90*basic/100;
			System.out.println("The Basic Salary Is : "+basic);
			System.out.println("The Basic Salary Is : "+hra2);
			System.out.println("The Basic Salary Is : "+da2);
		}
		else {
			double hra3=30*basic/100;
			double da3=95*basic/100;
			System.out.println("The Basic Salary Is : "+basic);
			System.out.println("The Basic Salary Is : "+hra3);
			System.out.println("The Basic Salary Is : "+da3);
		}

	}

}
