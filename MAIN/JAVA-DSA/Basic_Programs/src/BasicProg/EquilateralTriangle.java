package BasicProg;

import java.util.Scanner;

public class EquilateralTriangle {
	
	public void area(int side) {
		double area2;
		area2=0.43301270189*side*side;
		System.out.println("Area Of Triangle Is : "+area2);
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Side Of Triangle : ");
		int a=in.nextInt();
		EquilateralTriangle eTriangle=new EquilateralTriangle();
		eTriangle.area(a);
	}

}
