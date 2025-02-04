package com.org;

public class Datatypes {
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		
		//Integer Datatype: Whole numbers without decimal point
		//int: -2147483648 to +2147483647
		//short: -32768 to +32767
		//long: -9223372036854775808 to +9223372036854775807
		//byte: -128 to +127
		
		int num=10; 
		System.out.println("The number is "+num);
		
		long num2=9223372036854775807L;
		System.out.println("The number is "+num2);
		
		
		
		
		// Numbers with decimal point
		
		float myfloat=10/3f;
		System.out.println("The number is "+myfloat);
		
		double mydouble=10/3d;
		System.out.println("The number is "+mydouble);
		
		
		//boolean 
		
		boolean mybooleantrue= true;
		boolean mybooleanfalse= false; 
		
		System.out.println(mybooleantrue);
		System.out.println(mybooleanfalse);
		
		//Datatypes for String
		
		char mychar= '@';
		String myname="Ketaki Atre";
		
		System.out.println(mychar);
		System.out.println("My name is "+myname);
		
	}
}
