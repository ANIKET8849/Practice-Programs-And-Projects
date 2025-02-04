package PracticeSet;

public class Gcd {

	public static int GreatestCommonNum(int a,int b) {
		if (b==0) {
			return a;
		}else {
			return GreatestCommonNum(b, a%b);
		}
	}
	public static void main(String[] args) {
		int num1=24;
		int num2=36;
		Gcd gcd=new Gcd();
		int ans=gcd.GreatestCommonNum(num1, num2);
		System.out.println(ans);
				

	}

}
