package Quetion8;

import java.util.*;

public class Int {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,num3,big,small;
		
		System.out.printf("NUMBER CALCULATIONS\n\n");
		
		System.out.println("Enter The First Number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter The Second Number : ");
		num2=sc.nextInt();
		
		System.out.println("Enter The Third Number : ");
		num3=sc.nextInt();
		
		big=num1>num2?num1:num2;
		big=big>num3?big:num3;
		small=num1<num2?num1:num2;
		small=small<num3?small:num3;
		
		System.out.printf("\t------------\n");
		System.out.printf("\tSum = \t\t\t %d\n",num1+num2+num3);
		System.out.printf("\tAverage =\t %d\n",(num1+num2+num3)/3);
		System.out.printf("\tProduct = \t %d\n",num1*num2*num3);
		System.out.printf("\tBiggest = \t %d\n",big);
		System.out.printf("\tSmaller = \t %d\n",small);

	}

}
