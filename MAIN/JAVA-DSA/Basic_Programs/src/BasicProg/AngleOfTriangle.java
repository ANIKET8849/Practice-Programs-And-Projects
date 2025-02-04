package BasicProg;

import java.util.Scanner;

public class AngleOfTriangle {

	public void angle(int a,int  b) {
		int ThirdAngle=180-(a+b);
		System.out.println("Third Angle Is  : "+ThirdAngle);
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The First Angle Of Triangle : ");
		int a=in.nextInt();
		System.out.println("Enter The SEcond Angle Of Triangle : ");
		int b=in.nextInt();
		AngleOfTriangle aOfTriangle=new AngleOfTriangle();
		aOfTriangle.angle(a, b);

	}

}
