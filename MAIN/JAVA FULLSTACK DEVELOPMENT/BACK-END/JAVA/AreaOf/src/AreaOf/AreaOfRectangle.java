package AreaOf;

import java.util.*;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Width Of Rectangle : ");
		double w=sc.nextDouble();
		
		System.out.println("Enter The Length Of Rectangle : ");
		double l=sc.nextDouble();
		
		double area = w*l;
		
		System.out.println("The Area of Rectangle Is : "+area);

	}

}
