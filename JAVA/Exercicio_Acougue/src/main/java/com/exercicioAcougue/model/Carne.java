package com.exercicioAcougue.model;

public class Carne {
	private String name;
	private int total;
	private double price;
	
	
	
	public Carne() {
		super();
	}

	public Carne(String name, int total, double price) {
		super();
		this.name = name;
		this.total = total;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
