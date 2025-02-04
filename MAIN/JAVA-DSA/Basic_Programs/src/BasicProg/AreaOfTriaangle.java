package BasicProg;

import java.util.Scanner;

public class AreaOfTriaangle {

	public void area(int base,int height) {
		double area2;
		area2=(0.5)*base*height;
		System.out.println("Area Of Triangle Is : "+area2);
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Base Of Triangle : ");
		int a=in.nextInt();
		System.out.println("Enter The Height Of Triangle : ");
		int b=in.nextInt();
		AreaOfTriaangle aOfTriaangle=new AreaOfTriaangle();
		aOfTriaangle.area(a, b);

	}

}
