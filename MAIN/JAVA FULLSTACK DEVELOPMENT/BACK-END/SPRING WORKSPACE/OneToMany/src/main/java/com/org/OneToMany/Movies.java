package com.org.OneToMany;

public class Movies {

	private int mid;
	private String moviesname;
	
	
	public Movies(int mid, String moviesname) {
		super();
		this.mid = mid;
		this.moviesname = moviesname;
	}
	
	public Movies() {
		
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMoviesname() {
		return moviesname;
	}
	public void setMoviesname(String moviesname) {
		this.moviesname = moviesname;
	}
	
	
}
