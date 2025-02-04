package WithoutRecursion;

import java.util.Scanner;

public class NaturalNos {
	
	public void natural(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.print(i+"  ");
		}
	}

	public static void main(String[] args) {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=iScanner.nextInt();
		NaturalNos nos=new NaturalNos();
		nos.natural(n);

	}

}
