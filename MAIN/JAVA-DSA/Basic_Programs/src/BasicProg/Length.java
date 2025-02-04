package BasicProg;

import java.util.Scanner;

public class Length {
	
	public void Lengthcm(int l) {
		double lengthm=l/100;
		double lengthkm=l/1000;
		
		
		
		System.out.println("The Length In Meter is "+lengthm);
		System.out.println("The Length In kilo-Meter Is : "+lengthkm);

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Lenth : ");
		int l=sc.nextInt();
		Length len=new Length();
		len.Lengthcm(l);

	}

}
