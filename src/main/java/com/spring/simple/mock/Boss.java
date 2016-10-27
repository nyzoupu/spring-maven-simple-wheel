package com.spring.simple.mock;

public class Boss {
	
	private String name;
	
	private Car car;
	
	private Office office1;
	
	public Boss(String name){
		this.name = name;
	}
	
	public void indroduce(){
	    
		System.out.println("Hello,nice to meet you,My name is "+name+"!");
		System.out.println("My offfice is in " + office1.getAddress()+",it's size si "+office1.getSize());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Office getOffice1() {
		return office1;
	}

	public void setOffice1(Office office1) {
		this.office1 = office1;
	}

	
}
