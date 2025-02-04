package com.org.ConstructorBased;

public class Vehicle {

	private Bike b1;
	private Car c1;
	
	public Vehicle(Bike b2,Car c2) {
		this.b1=b2;
		this.c1=c2;
	}
}

class Bike{
	public Bike() {
		System.out.println("This Is Bike !!!");
	}
}
class Car{
	public Car() {
		System.out.println("This Is Car");
	}
}