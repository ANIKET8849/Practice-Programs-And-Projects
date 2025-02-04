package PracticeSet;

public class SumOfNaturalNos {
	
	public static int sum(int n) {
		if (n<1) {
			return 0;
		}
		return n+sum(n-1);
	}

	public static void main(String[] args) {
		int num=5;
		SumOfNaturalNos nos=new SumOfNaturalNos();
		int ans= nos.sum(num);
		System.out.println(ans);
	}

}
