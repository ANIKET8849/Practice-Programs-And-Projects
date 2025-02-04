package AreaOf;

import java.util.*;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Side Of The Square : ");
		double s=sc.nextDouble();
		
		double area = s*s;
		
		System.out.println("The Area Of The Square Is : "+area);

	}

}
