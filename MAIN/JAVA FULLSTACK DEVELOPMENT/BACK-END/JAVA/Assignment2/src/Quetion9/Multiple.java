package Quetion9;

import java.util.*;

public class Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,k;
		
		System.out.println("Enter The First Number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter The Second Number : ");
		num2=sc.nextInt();
		
		k=num2%num1;
		
		if(k==0) {
			System.out.printf("%d Is Multiple Of %d",num1,num2);
		}
		else {
			System.out.printf("%d Is Not Multiple Of %d",num1,num2);
		}

	}

}
