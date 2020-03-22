package com.class14;

public class MethodExamples {
//want to create a method that will be greeting a person
	void greet() {
		System.out.println("Hello Asel");
	}
	void greet1(String name) {
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
		//how do I call method greet?
		MethodExamples object1=new MethodExamples();
		object1.greet1("Sarmed");
		object1.greet1("Pasha");
		object1.greet1("Margarita");
		object1.greet1("Erzhan");
	}
	
}
