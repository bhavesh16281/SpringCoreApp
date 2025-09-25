package com.bhavesh16281;

public class ComputerImpl {
	
	private Computer computer;

	public Computer getComputer() {
		return computer;
	}

	public ComputerImpl() {
		System.out.println("Inside Computer Impl Class..");
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public void print() {
		computer.print();
	}


}
