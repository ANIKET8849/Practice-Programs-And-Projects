package WithoutRecursion;

import java.util.Scanner;

public class BinaryCode {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num=in.nextInt();
		int[] a=new int[10];
		int i=0;
		while (num>0) {
			a[i]=num%2;
			num=num/2;
			i++;
		}
		for (int j=a.length-1; j>=0; j--) {
			System.out.print(a[j]+" ");
		}
		

	}

}
