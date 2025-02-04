package BasicRecursion;

import java.util.Scanner;

public class NaturalNos {

	public void natural(int e) {
		if (e>1) {
			natural(e-1);
		}
		System.out.print(e+" ");
		
	}
	public static void main(String[] args) {
		Scanner inScanner =new Scanner(System.in);
//		System.out.println("Enter The Start : ");
//		int s=inScanner.nextInt();
		System.out.println("Enter The End : ");
		int e=inScanner.nextInt();
		
		NaturalNos nos=new NaturalNos();
		nos.natural( e);
	}

}
