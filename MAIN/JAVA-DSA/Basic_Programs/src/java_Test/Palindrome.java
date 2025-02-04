package java_Test;

public class Palindrome {

	public boolean IsPalindrome(String str) {
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		String s ="racecar";
		Palindrome p =new Palindrome();
		boolean result=p.IsPalindrome(s);
		if (result) {
			System.out.println("The String Is Palindrome.");
		}else {
			System.out.println("String Is Not Palindrome.");
		}
	}
}
