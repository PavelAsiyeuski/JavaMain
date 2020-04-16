package com.class25;

public interface Drivable {
	//compiler by default add public static final
	boolean move_fast=true;
	//compiler by default adds public abstract
	void drive();
	
	
}
	abstract class Vehicle{
		abstract void stop();
		}
	


	class Car extends Vehicle implements Drivable{

		
		public void drive() {
			System.out.println("Car drives");
		}
		void stop() {
			System.out.println("Car stops");
		}
	}
