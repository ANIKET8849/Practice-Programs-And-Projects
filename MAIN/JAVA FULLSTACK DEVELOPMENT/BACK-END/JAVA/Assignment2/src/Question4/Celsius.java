package Question4;
import java.util.*;
public class Celsius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double cel;
		double temp = 0.0;
		
		cel=(temp-32.0)*5.0/9.0;
		System.out.println("Enter the fahrenheit value");
		temp=sc.nextDouble();
		System.out.println("The celsious value of %10.2f is %2.2f  : " + temp+"  :   " 
				+cel);
		

	}

}
