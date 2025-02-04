package PracticeSet;

public class Factorial {
	
	public static int fact(int n) {
		if (n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		int num=5;
		Factorial factorial=new Factorial();
		int ans= factorial.fact(num);
		System.out.println(ans);
	}

}
