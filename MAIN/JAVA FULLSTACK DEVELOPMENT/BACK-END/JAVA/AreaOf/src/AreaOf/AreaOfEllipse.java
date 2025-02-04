package AreaOf;

import java.util.*;

public class AreaOfEllipse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Radius Of Major Axis : ");
		double major=sc.nextDouble();
		
		System.out.println("Enter The Radius Of Minor Axis : ");
		double minor=sc.nextDouble();
		
		double area = 3.14*major*minor;
		
		System.out.println("The Area Of Ellipse Is : "+area);

	}

}
