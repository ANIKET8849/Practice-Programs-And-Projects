package PracticeSet;

public class PowerOfTwo {
	public static boolean power2(int n) {
		if (n<=0) {
			return false;
		}else if (n==1) {
			return true;
		}else if (n%2!=0) {
			return false;
		}else {
			return power2(n/2);
		}
	}

	public static void main(String[] args) {
		int num=16;
		if (power2(num)) {
			System.out.println(num+" It Is Power Of 2 ");
		} else {
			System.out.println(num+" It Is Not Power Of 2 ");
		}

	}

}
