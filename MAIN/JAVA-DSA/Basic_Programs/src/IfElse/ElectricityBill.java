package IfElse;
import java.util.Scanner;

public class ElectricityBill {
	void Elecricity() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of units consumed:");
        int units = scanner.nextInt();

        double totalAmount = 0;
        if (units <= 50) {
            totalAmount = units * 0.50;
        } else if (units <= 150) {
            totalAmount = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            totalAmount = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            totalAmount = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        double surcharge = totalAmount * 0.20;
        double netAmount = totalAmount + surcharge;
        System.out.println("Total Amount : \t"+totalAmount);
        System.out.println("Surcharge : \t"+surcharge);
        System.out.println("Net Amount : \t"+netAmount);
	}

	public static void main(String[] args) {
		ElectricityBill eBill =new ElectricityBill();
		eBill.Elecricity();

	}

}
