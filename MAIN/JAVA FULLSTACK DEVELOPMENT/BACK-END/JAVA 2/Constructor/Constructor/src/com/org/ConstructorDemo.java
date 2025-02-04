package com.org;

public class ConstructorDemo {

	ConstructorDemo(){
		System.out.println("This is parameterless constructor");
	}
	
	ConstructorDemo(int a,int b){
		System.out.println("This is parameterized constructor");
		System.out.println("Addition = "+(a+b));
	}
	
	public void printNum(){
		System.out.println(10);
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();   //default constructor
		cd.printNum();
		
		ConstructorDemo cd2=new ConstructorDemo();	//parameterless constructor
		
		ConstructorDemo cd3=new ConstructorDemo(10,20);	//parameterized constructor
		
	}
}
