package Encapsulation;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String myname = sc.nextLine();
		
		GettersSetters gs =new GettersSetters();
		gs.setName(myname);
		String name3=gs.getName();
		System.out.println("Hello "+name3);
		

}

}
