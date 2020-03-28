package com.class17;

public class StaticKeyword {
//create a template for Phone
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+" with touch screen= "+touchScreen);
	}
	void displaySpecification() {
		System.out.println("We built a phone with "+memory+"GB memory in "+color+" color");
	}
	public static void main(String[] args) {
		brand="iPhone";
		touchScreen=true;
		StaticKeyword obj=new StaticKeyword(); 
		obj.color="grey";
		obj.memory=64;
		
		displayGeneralInfo();
		obj.displaySpecification();
	}
	//different way==>
	public static void man(String[] arg) {
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();
		
	}
}
