package CoditionalOperators;

import java.util.Scanner;

public class Alphabet {
	
	public void alpha() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Character : ");
		char a=scanner.next().charAt(0);
		
		String ans=((a>='A'&&a<='Z')||(a>='a'&&a<='z'))?" It Is A Alphabet ":" It Is Not A Alphabet ";
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Alphabet alphabet =new Alphabet();
		alphabet.alpha();
		
	}

}
