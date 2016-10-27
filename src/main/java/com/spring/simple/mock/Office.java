package com.spring.simple.mock;

public class Office {
	
	private int size ;
	
	private String address;
	
	public Office(String address , int size){
		this.address = address;	
		this.size = size;
	}
	
	public Office(){
		this.address = "¹ãÖÝ·¬Ø®";
		this.size = 450;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
