package WithoutRecursion;


import java.util.Scanner;

public class PowerOfNumber {
	
	public void power(int base,int exponent) {
		int result=1;
		int c=1;
		while (c<=exponent) {
			result=result*base;
			c++;
		}
		System.out.println(" The Result Is : "+result);
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num=in.nextInt();
		System.out.println("Enter The Power Of Number : ");
		int pow=in.nextInt();
		PowerOfNumber pNumber=new PowerOfNumber();
		pNumber.power(num, pow);

	}

}
