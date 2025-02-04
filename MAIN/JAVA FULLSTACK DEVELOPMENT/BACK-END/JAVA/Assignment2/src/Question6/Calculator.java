package Question6;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The First Number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter The Second  Number : ");
		int num2=sc.nextInt();
		
		System.out.printf("----------------\n");
		System.out.printf("\tSum =\t\t %d\n", num1+num2);
		System.out.printf("\tProduct =\t %d\n",num1*num2);
		System.out.printf("\tDifference =\t %d\n",num1-num2);
		System.out.printf("\tQuetiont =\t %d\n",num1/num2);
		

	}

}
