package TryCatch;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		//Arithmatic Exception 
		try {
			Scanner in =new Scanner(System.in);
			System.out.println("Enter Number : ");
			int a=in.nextInt();
			
			
			} catch (Exception e) {
			System.out.println(e);
		}
//		Scanner in =new Scanner(System.in);
//		System.out.println("Enter Number : ");
//		int a=in.nextInt();
//		System.out.println(a);
		
		
		
		
		
		//Number Format Exception 
		// Java program to demonstrate NumberFormatException 
		
//				try { 
//					// "akki" is not a number 
//					int num = Integer.parseInt ("akki") ; 
//
//					System.out.println(num); 
//				} catch(NumberFormatException e) { 
//					System.out.println(e); 
//				} 
		
		
		
		
		
		//Io Exception 
		   // Create a new scanner with the specified String 
        // Object 
//        Scanner scan = new Scanner("Hello Geek!"); 
//  
//       try {
//     
//           // Print the line 
//           System.out.println("" + scan.nextLine()); 
//     
//           // Check if there is an IO exception 
//           System.out.println(scan.ioException());  
//	} catch (Exception e) {
//		System.out.println(e);
//	}
//
		
		
		
		//ClassNotFoundException
		
//		try {
//			Class.forName("TryCatch");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		}

		
		
		
	}

}
