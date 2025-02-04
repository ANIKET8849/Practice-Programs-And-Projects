package oops.com.org;

import java.util.Scanner;

/*
Print the average of three numbers entered by user by creating a class
named ‘Average’ having a method to calculate and print the average.*/
class Average{
	
	public  void average(int num,int num1,int num2)
	{
		int avg=(num+num1+num2)/3;
		System.out.println("The Average of three number: "+avg );
	}

}

public class AverageThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter the Three Number:");
		
		System.out.println("Enter the First Number:");
		int num=sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Third Number:");
		int num2=sc.nextInt();
		
		Average avg=new Average();
	         avg.average( num, num1, num2);
		
				
	}



}
