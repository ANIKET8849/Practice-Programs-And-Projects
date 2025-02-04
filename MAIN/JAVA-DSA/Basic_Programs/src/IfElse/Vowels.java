package IfElse;

import java.util.Scanner;

public class Vowels {
	public void check() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char a=iScanner.next().charAt(0);
		
		if(a>='A'&&a<='Z') {
			a=(char) (a+32);
		}
		if (a>='a'&& a<='z') {
			if (a=='a'|| a=='i'||a=='o'||a=='e'||a=='u') {
				System.out.println(a+"  Is The Vowel.");
			} else {
				System.out.println(a+" Is A Consonant");
			}
		}else {
			System.out.println(a+"  Is Not The Alphabet.");
		}
	}
	public static void main(String[] args) {
		Vowels vowels=new  Vowels();
		vowels.check();

	}

}
