package IfElse;

import java.util.Scanner;

public class GrossSalary {

	void salary() {
			Scanner scanner =new Scanner(System.in);

	        System.out.println("Enter the basic salary of the employee:");
	        double basicSalary = scanner.nextDouble();

	        double hra, da;

	        if (basicSalary <= 10000) {
	            hra = basicSalary * 0.20; 
	            da = basicSalary * 0.80; 
	        } else if (basicSalary <= 20000) {
	            hra = basicSalary * 0.25; 
	            da = basicSalary * 0.90; 
	        } else {
	            hra = basicSalary * 0.30; 
	            da = basicSalary * 0.95;
	        }

	        double grossSalary = basicSalary + hra + da;

	        System.out.printf("Gross Salary= %.2f ", grossSalary);
	}
	public static void main(String[] args) {
		GrossSalary gSalary =new GrossSalary();
		gSalary.salary();

	}

}
