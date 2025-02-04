package IfElse;

import java.util.Scanner;

public class Month {

	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Month :");
		int a=iScanner.nextInt();
		
		
		if (a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
			System.out.println(" There Are 31 Days In THis Month.");
		}else if (a==4||a==6||a==9||a==11) {
			System.out.println(" There Are 30 Days In THis Month.");
		} else {
			System.out.println(" Please Enter Valid Month.");
		} 
	}
	public static void main(String[] args) {
		Month month=new Month();
		month.check();

	}

}
