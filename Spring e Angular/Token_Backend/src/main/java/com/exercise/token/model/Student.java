package com.exercise.token.model;

public class Student {
	
	private int ra;
	private String name;
	private String email;
	
	
	public Student(int ra, String name, String email) {
		super();
		this.ra = ra;
		this.name = name;
		this.email = email;
	}


	public int getRa() {
		return ra;
	}


	public void setRa(int ra) {
		this.ra = ra;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
	
}
