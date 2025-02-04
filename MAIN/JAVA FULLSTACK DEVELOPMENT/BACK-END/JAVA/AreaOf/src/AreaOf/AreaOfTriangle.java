package AreaOf;

import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First Side Of Triangle  : ");
		double s1=sc.nextDouble();
		
		System.out.println("Enter The Second Side Of Triangle : ");
		double s2=sc.nextDouble();
		
		double area = s1*s2/2;
		
		System.out.println("The Area Of Triangle Is : "+area);

	}

}
