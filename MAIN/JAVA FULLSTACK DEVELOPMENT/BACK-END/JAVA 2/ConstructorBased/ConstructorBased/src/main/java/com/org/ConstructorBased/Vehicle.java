package com.org.ConstructorBased;

public class Vehicle {

	private Bike b1;    // Variable of type Bike is created as class is a user-defined datatype and Bike is a class.
	private Car c1;
	
	public Vehicle(Bike b2,Car c2) {
		this.b1=b2;
		this.c1=c2;
	}
	
	
}
class Bike{
	public Bike() {
		System.out.println("This is Bike Class");
	}
}
class Car{
	public Car() {
		System.out.println("This is Car Class");
	}
}