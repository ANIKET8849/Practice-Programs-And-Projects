package PracticeSet;

public class CountDigit {

	public static int countDigit(int n) {
		if (n==0) {
			return 0;
		}
		return 1+countDigit(n/10);
	}
	public static void main(String[] args) {
		int num=12345;
		CountDigit cDigit=new CountDigit();
		int ans= cDigit.countDigit(num);
		System.out.println(ans);
	}

}
