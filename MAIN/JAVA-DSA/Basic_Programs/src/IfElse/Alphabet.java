package IfElse;


import java.util.Scanner;

public class Alphabet {

	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char a=iScanner.next().charAt(0);
		
		
		if (a>='a'&& a<='z'|| a>='A'&& a<='Z') {
			System.out.println(a+" Is The Alphabet.");
		}else {
			System.out.println(a+"  Is Not The Alphabet.");
		}
	}
	public static void main(String[] args) {
		Alphabet alphabet=new Alphabet();
		alphabet.check();

	}

}
