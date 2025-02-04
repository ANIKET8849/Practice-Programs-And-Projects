package PracticeSet;

public class SumOfDigit {
	
	public static int SumOfDigit(int n) {
		if (n==0) {
			return 0;
		}
		return n%10+SumOfDigit(n/10);
	}

	public static void main(String[] args) {
		int n=12345;
		SumOfDigit sDigit =new SumOfDigit();
		int ans= sDigit.SumOfDigit(n);
		System.out.println(ans);

	}

}
