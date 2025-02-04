package PracticeSet;

public class Palindrome {

	public static boolean Ispalindrome(String str) {
		if (str.length()<=1) {
			return true;
		}else {
			if (str.charAt(0)==str.charAt(str.length()-1)) {
				return Ispalindrome(str.substring(1, str.length()-1));
			}else {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		String input="racecar";
		if (Ispalindrome(input)) {
			System.out.println(input+" Is A Palindrome. ");
		} else {
			System.out.println(input+" Is Not A Palindrome. ");
		}

	}

}
