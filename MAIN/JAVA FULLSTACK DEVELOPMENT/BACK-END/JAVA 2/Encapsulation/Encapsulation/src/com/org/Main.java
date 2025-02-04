package com.org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name1=sc.nextLine();
		
		GettersSetters gs=new GettersSetters();
		gs.setName(name1);
		String name4=gs.getName();
		System.out.println("Hello "+name4);
		
	}

}
