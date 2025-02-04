package com.org;

public class Demo {

	public static void main(String[] args) {
		int num1=3;
		int num2=0;
		
		try {
			int num3=3/0;
		}
		catch(Exception e) {
			//e.getMessage();
			//System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception "+e.getMessage());
		}
		finally {
			System.out.println("This is finally block!!");
		}
	}

}
