package IfElse;

import java.util.Scanner;

public class Alphabet3 {

	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char a=iScanner.next().charAt(0);
		
		
		if (a>='a'&& a<='z') {
			System.out.println(a+"It Is Lowercase.");
		}else if (a>='A'&& a<='Z') {
			System.out.println(" It Is Uppercase.");
		}else {
			System.out.println(a+"  It Is Not A Alphabet.");
		}
	}
	public static void main(String[] args) {
		Alphabet3 alpha=new Alphabet3();
		alpha.check();

	}

}
