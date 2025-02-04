package Quetion7;

import java.util.*;

public class BiggerNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First Number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter The Second Number : ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.printf("%d Is Larger Number ",num1);
		}
		else if(num1<num2) {
			System.out.printf("%d Is Larger Number ", num2);
			
		}
		else {
			System.out.printf("%d Are Equal Numbers",num1);
		}

	}

}
