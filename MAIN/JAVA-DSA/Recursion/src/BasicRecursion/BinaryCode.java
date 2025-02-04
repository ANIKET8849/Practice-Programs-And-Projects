package BasicRecursion;

import java.util.Scanner;

public class BinaryCode {

//	public static int PrintBinary(String str) {
//		if (str.isEmpty()) {
//			return 0;
//		}
//		int length=str.length();
//		char lastchar=str.charAt(length-1);
//		int lastdigit=(lastchar=='1')?1:0;
//		int powerOf2=(int) Math.pow(2, length-1);
//		String remainStr=str.substring(0, length-1);
//		int remainval=PrintBinary(remainStr);
//		
//		return (lastdigit *powerOf2)+remainval;
//	}
	
	   public static int convertBinaryToDecimal(long num) {
	        int decimalNumber = 0, i = 0;
	        long remainder;

	        // Loop to process each digit of the binary number
	        while (num != 0) {
	            remainder = num % 10;  // Get the last digit (0 or 1)
	            num /= 10;             // Remove the last digit
	            decimalNumber += remainder * Math.pow(2, i); // Add to decimal result
	            i++;                   // Increment the power of 2
	        }

	        return decimalNumber; // Return the final decimal number
	    }

    
    
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
//		System.out.println("Enter The Number : ");
//		String a=in.nextLine();
		BinaryCode bCode=new BinaryCode();
//		int ans= bCode.PrintBinary(a);
		int ans2=bCode.convertBinaryToDecimal(1111110);
		System.out.println(ans2);
	}

}
