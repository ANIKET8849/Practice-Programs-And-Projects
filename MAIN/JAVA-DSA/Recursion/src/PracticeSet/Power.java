package PracticeSet;

public class Power {
	
	public static int pow(int base, int exponent) {
		if (exponent==0) {
			return 1;
		}else {
			return base*pow(base, exponent-1);
		}
	}

	public static void main(String[] args) {
		int base=2;
		int exponent=3;
		Power power=new Power();
		int ans=power.pow(base, exponent);
		System.out.println(ans);

	}

}
