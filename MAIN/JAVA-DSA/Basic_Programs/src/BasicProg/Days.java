package BasicProg;

import java.util.Scanner;

public class Days {

	void ConvertToYear(int days) {
		int year=days/365;
		int remaining_Days=days%365;
		
		int week=remaining_Days/7;
		int day=remaining_Days%7;
		System.out.println("Years : "+year+" Weeks : "+week+" Days : "+day);
	}
	public static void main(String[] args) {
		Scanner inScanner =new Scanner(System.in);
		System.out.println("Enter The No Of Days : ");
		int days=inScanner.nextInt();
		Days d=new Days();
		d.ConvertToYear(days);
	}

}
