package com.org;

public class InterfaceDemo implements Demo{
	
	public void printMsg() {
		
		System.out.println("Hello World!!");
	}
	public static void main(String[] args) {
		
		InterfaceDemo obj=new InterfaceDemo();
		obj.printMsg();
	}

}
