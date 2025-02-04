package PracticeSet;

public class StringReversal {
	
	public static String Stringrev(String str) {
		if (str.isEmpty()) {
			return str;
		}else {
			return Stringrev(str.substring(1))+str.charAt(0);
		}
	}

	public static void main(String[] args) {
		String inputString="Hello World";
		StringReversal stringReversal=new StringReversal();
		String ans= stringReversal.Stringrev(inputString);
		System.out.println("String Reversal Is : "+ans);
	}

}
