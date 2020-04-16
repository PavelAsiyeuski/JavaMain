package com.class23;

public class Computer {
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//Define common behavior within and some fields in parent class 
	//and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. 
	//Loop through each object and execute available methods.

	String model;
	public Computer(String model) {
		this.model=model;
	}
	void keyboard() {
	System.out.println(model+" has qwerty keyboard");
}
	void OS() {
		System.out.println(model+" has Windows 10");
	}
	void work() {
		System.out.println(model+" is working well");
	}
}
class Apple extends Computer{
	public Apple(String model){
		super(model);
	}
	void OS() {
		System.out.println(model+" has Macintosh OS");
	}
	void USB3(){
		System.out.println(model+" supports USB 3.0");
	}
}
class Lenovo extends Computer{
	Lenovo(String model){
		super(model);
	}
	void gaming() {
		System.out.println(model+" is good for gaming");
	}
}
class HP extends Computer{
	HP(String model){
		super(model);
	}
	void touchScreen() {
		System.out.println(model+" has touch screen");
	}
	void work() {
		System.out.println(model+" is working well");
		touchScreen();
	}
}
class Dell extends Computer{
	Dell(String model){
		super(model);
	}
	void working() {
		System.out.println(model+" is good for working");
	}
}