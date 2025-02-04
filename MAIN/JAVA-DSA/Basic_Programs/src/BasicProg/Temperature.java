package BasicProg;

import java.util.Scanner;

public class Temperature {
	public void Faremeter(int t) {
	double fahrenheit=(t*9/5)+32;
		System.out.println(fahrenheit);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Temprature In Celcius : ");
		int t=sc.nextInt();
		Temperature temperature=new Temperature();
		temperature.Faremeter(t);

	}

}
