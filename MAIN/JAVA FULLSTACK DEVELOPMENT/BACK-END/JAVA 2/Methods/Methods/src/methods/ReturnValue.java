package methods;

import java.util.Scanner;

public class ReturnValue {

	public int sum(int a,int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		ReturnValue r=new ReturnValue();
		int add=r.sum(num1, num2);
		System.out.println("The Addition is "+add);
	}

}
