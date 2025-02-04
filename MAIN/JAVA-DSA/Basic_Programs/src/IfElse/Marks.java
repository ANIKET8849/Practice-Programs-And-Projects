package IfElse;

import java.util.Scanner;

public class Marks {
 
	void marks1() {
	       Scanner scanner=new Scanner(System.in);

	        System.out.println("Enter marks for Physics:");
	        int physics = scanner.nextInt();

	        System.out.println("Enter marks for Chemistry:");
	        int chemistry = scanner.nextInt();

	        System.out.println("Enter marks for Biology:");
	        int biology = scanner.nextInt();

	        System.out.println("Enter marks for Mathematics:");
	        int mathematics = scanner.nextInt();

	        System.out.println("Enter marks for Computer:");
	        int computer = scanner.nextInt();

	        double percentage = (physics + chemistry + biology + mathematics + computer) / 5.0;

	        System.out.printf("Percentage = %.2f\n", percentage);

	        if (percentage >= 90) {
	            System.out.println("Grade A");
	        } else if (percentage >= 80) {
	            System.out.println("Grade B");
	        } else if (percentage >= 70) {
	            System.out.println("Grade C");
	        } else if (percentage >= 60) {
	            System.out.println("Grade D");
	        } else if (percentage >= 40) {
	            System.out.println("Grade E");
	        } else {
	            System.out.println("Grade F");
	        }
	}
	public static void main(String[] args) {
		Marks marks=new Marks();
		marks.marks1();

	}

}

