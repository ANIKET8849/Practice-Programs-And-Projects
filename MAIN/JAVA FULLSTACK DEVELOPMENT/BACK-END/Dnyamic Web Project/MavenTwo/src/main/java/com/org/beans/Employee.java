package com.org.beans;

public class Employee {

	private int id;
	private String name;
	private String clg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(clg);
	}
}
