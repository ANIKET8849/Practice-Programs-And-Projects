package GetterSetter;

import java.util.*;

public class PrintNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The First Number :");
		int num=sc.nextInt();
		
		System.out.println("Enter The Second Number :");
		int num1=sc.nextInt();
		
		System.out.println("Enter The Second Number :");
		int num2=sc.nextInt();
		
		int sum=num+num1+num2;
		
		System.out.println("The Sum Is :"+sum);
	}

}
