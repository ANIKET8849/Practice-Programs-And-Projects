package IfElse;

import java.util.Scanner;

public class Alphabet2 {


	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char a=iScanner.next().charAt(0);
		
		
		if (a>='a'&& a<='z'|| a>='A'&& a<='Z') {
			System.out.println(a+" Is The Alphabet.");
		}else if (a>='0'&&a<='9') {
			System.out.println(" It Is A Digit.");
		}else {
			System.out.println(a+"  It Is A Special Character.");
		}
	}
	public static void main(String[] args) {
		Alphabet2 alpha=new Alphabet2();
		alpha.check();

	}

}
