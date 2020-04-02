package com.class19;

public class Task01 {

	String name,address;
	Task01(String name,String address){
		this.name=name;
		this.address=address;
	}
	void displayInfo() {
		System.out.println("Student's name is "+name+" and his address is "+address);
	}
	public static void main(String[] args) {
		Task01 obj=new Task01("Pavel","1707 w 5th st");
		obj.displayInfo();
	}
}
