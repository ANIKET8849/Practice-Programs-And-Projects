package PracticeSet;

public class Decimal {

	public static int Dec(int n,int b) {
		if (n<=1) {
			return n;
		}
		if (n%2!=0) {
			return (int) Math.pow(2, b)*n;
		}
		b=b+1;
		return Dec(n/10,b);
	}
	public static void main(String[] args) {
		int n=11111111;
		Decimal d=new Decimal();
		int ans=d.Dec(n,0);
		System.out.println(ans);
	}

}
