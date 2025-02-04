package BasicProg;

import java.util.Scanner;

public class Factorial {

	void Factorial1(int v) {
		int s=1;
		while (v!=0) {
			s=s*v;
			v--;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=in.nextInt();
		Factorial f=new Factorial();
		f.Factorial1(n);

	}

}
