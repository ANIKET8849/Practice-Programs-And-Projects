package IfElse;

import java.util.Scanner;

public class EquiTriangle {

	public void valid() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Sides Of Triangle : ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if (a==b && b==c) {
			System.out.println("Triangle Is Equilateral.");
		} else if (a==b || b==c || a==c) {
			System.out.println("Triangle Is Isosceles.");
		}else {
			System.out.println("Triangle Is Scalene.");
		} 
	}
	public static void main(String[] args) {
		EquiTriangle eTriangle =new EquiTriangle();
		eTriangle.valid();

	}

}
