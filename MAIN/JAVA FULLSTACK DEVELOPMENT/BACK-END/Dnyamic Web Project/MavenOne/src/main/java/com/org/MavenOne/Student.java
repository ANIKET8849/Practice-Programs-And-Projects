package com.org.MavenOne;

public class Student {
	private int id;	
	private String name;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	
	public void Display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(clg);
		
	}
}
