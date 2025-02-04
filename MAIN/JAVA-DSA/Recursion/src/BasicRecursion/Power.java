package BasicRecursion;

import java.util.Scanner;

public class Power {
	
	public int pow(int base,int exponent) {
		if (exponent==1) {
			return base;
		}
		return base*pow(base, exponent-1);
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num=in.nextInt();
		System.out.println("Enter The Power Of Number : ");
		int pow=in.nextInt();
		Power power =new Power();
		int ans= power.pow(num, pow);
		System.out.println(ans);
	}

}
