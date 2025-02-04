package CoditionalOperators;

import java.util.Scanner;

public class LeapYear {

	public void year() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Year : ");
		long year=scanner.nextInt();
		
		String ans=((year%400==0)?"Leap Year":((year%100==0)?"Not A Leap Year":((year%4==0)?"Leap  Year ":"Not A Leap Year")));
		System.out.println(ans);
	}
	public static void main(String[] args) {
		LeapYear yLeapYear=new LeapYear();
		yLeapYear.year();

	}

}
