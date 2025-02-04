package Assignment1;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Physics Marks : ");
		int sub1=sc.nextInt();
		
		System.out.println("Enter Chemistry Marks : ");
		int sub2=sc.nextInt();

		System.out.println("Enter Biology Marks : ");
		int sub3=sc.nextInt();
		
		System.out.println("Enter Mathematics Marks : ");
		int sub4=sc.nextInt();
		
		System.out.println("Enter Computer Marks : ");
		int sub5=sc.nextInt();
		
//		int physics = 100/sub1*100;
//		int chem = 100/sub2*100;
//		int bio = 100/sub3*100;
//		int maths = 100/sub4*100;
//		int comp = 100/sub5*100;
		
		int total = sub1+sub2+sub3+sub4+sub5;
		
	
		int percentage=total/5;
		
		if(percentage>=90) {
			System.out.println("Grade A ");
	}
		else if(percentage>=80) {
			System.out.println("Grade B");
}
		else if(percentage>=70) {
			System.out.println("Grade C");
		}
		else if(percentage>=60) {
			System.out.println("Grade D");
		}
		else if(percentage>=50) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("You Are Failed !! ");
}
}
}