package IfElse;

import java.util.Scanner;

public class Week {

	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int a=iScanner.nextInt();
		
		
		if (a==1) {
			System.out.println(" Monday.");
		}else if (a==2) {
			System.out.println(" Tuesday.");
		} else if (a==3) {
			System.out.println(" Wensday.");
		} else if (a==4) {
			System.out.println(" Thursday.");
		} else if (a==5) {
			System.out.println(" Friday.");
		} else if (a==6) {
			System.out.println(" Saturday.");
		} else if (a==7) {
			System.out.println(" Sunday.");
		} 
	}
	public static void main(String[] args) {
		Week week=new Week();
		week.check();

	}

}
