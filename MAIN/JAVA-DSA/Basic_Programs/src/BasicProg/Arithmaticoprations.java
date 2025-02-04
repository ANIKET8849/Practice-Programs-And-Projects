package BasicProg;

import java.util.Scanner;

public class Arithmaticoprations {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The First number : ");
		int num1=in.nextInt();
		System.out.println("Enter The First number : ");
		int num2=in.nextInt();
		int sum=num1+num2;
		int dif=num1-num2;
		int pro=num1*num2;
		double que=num1/num2;
		int rem=num1%num2;
		System.out.println(sum);
		System.out.println(dif);
		System.out.println(pro);
		System.out.println(que);
		System.out.println(rem);
	}

}
