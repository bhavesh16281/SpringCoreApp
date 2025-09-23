package com.bhavesh16281;

public class Laptop {
	private int price;
	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Laptop(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	public Laptop(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Laptop() {
		System.out.println("Inside Laptop Constructor..");
	}
	
	public void print() {
		System.out.println("Inside Laptop Class..");
	}

}
