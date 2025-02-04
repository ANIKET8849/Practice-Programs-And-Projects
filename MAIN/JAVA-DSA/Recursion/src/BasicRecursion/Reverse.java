package BasicRecursion;

import java.util.Scanner;

public class Reverse {

//	public static int Rev(int n,int rev) {
//		if (n<=0) {
//			return rev;
//		}
//		int d=n%10;
//		rev=(rev*10)+d;
//		return Rev(n/10,rev);
//	}
	
//	public int Rev(int n) {
//		int rev=0,d=0;
//		if (n<=0) {
//			return rev;
//		}
//		d=n%10;
//		rev=(rev*10)+d;
//		return Rev(n/10);
//		
//	}
	
	public int Rev(int n,int rev) {
	if (n>0) {
		int d=n%10;
		rev=(rev*10)+d;
		return Rev(n/10,rev);
	}
	return rev;
	
}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=in.nextInt();
		Reverse reverse=new Reverse();
		int ans= reverse.Rev(n,0);
		System.out.println(ans);

	}

}
