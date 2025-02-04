package com.org.OneToManyBank;

public class Bank {

	private int bid;
	private String bname;
	
	
	public Bank(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	
	
	public Bank() {
		
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
