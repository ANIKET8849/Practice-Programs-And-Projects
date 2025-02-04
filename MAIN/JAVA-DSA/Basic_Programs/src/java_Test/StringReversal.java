package java_Test;

public class StringReversal {

	public void rev(String str) {
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		StringReversal reversal =new StringReversal();
		String s="Hello World";
		reversal.rev(s);

	}

}
