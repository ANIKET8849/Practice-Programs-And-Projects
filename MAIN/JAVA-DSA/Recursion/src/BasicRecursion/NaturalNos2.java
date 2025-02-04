package BasicRecursion;

import java.util.Scanner;

public class NaturalNos2 {

	public static int natural(int s,int e) {
		if (s>e) {
			return s;
		}
		return s+natural(s+1, e);
	}
//	public int natural(int e) {
//		if (e>1) {
//			return natural(e-1);
//		}
//			int sum=e+natural(e);
//			return sum;
//	
//	}
	public static void main(String[] args) {
		Scanner inScanner =new Scanner(System.in);
		System.out.println("Enter The Start : ");
		int s=inScanner.nextInt();
		System.out.println("Enter The End : ");
		int e=inScanner.nextInt();
		
		NaturalNos2 nos2=new NaturalNos2();
		int ans =nos2.natural(s,e);
		System.out.println(ans+" ");
	}


}
