package com.org.OneToManyBank;


import java.util.Set;

public class Person {

	private int pid;
	private String pname;
	private Set<Bank> bank;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set<Bank> getBank() {
		return bank;
	}

	public void setBank(Set<Bank> bank) {
		this.bank = bank;
	}

	public Person(int pid, String pname, Set<Bank> bank) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.bank = bank;
	}

	public Person() {
		
	}
	
	

}
