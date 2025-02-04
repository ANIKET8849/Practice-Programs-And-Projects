package BasicProg;

import java.util.Scanner;

public class Temprature2 {
	public void Faremeter(int t) {
		double celcius=(t-32)*5/9;
			System.out.println(celcius);
		}

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter The Temprature In Farameter : ");
			int t=sc.nextInt();
			Temperature temperature=new Temperature();
			temperature.Faremeter(t);

		}
}
