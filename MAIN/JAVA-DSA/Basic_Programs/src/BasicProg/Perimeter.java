package BasicProg;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Length : ");
		int len=in.nextInt();
		System.out.println("Enter The Breath : ");
		int bre=in.nextInt();
		int per=2*(len+bre);
		System.out.println(per);
	}

}
