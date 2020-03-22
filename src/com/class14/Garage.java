package com.class14;

public class Garage {
	public static void main(String[] args) {
	//build individual project
Car car1=new Car();
car1.make="Lamborghini";
car1.model="Gallardo";
car1.year=2020;
car1.color="Blue";

Car car2=new Car();
car2.make="BMW";
car2.model="m5";
car2.year=2019;
car2.color="Pink";
car2.drive();
car2.stop();
car2.makeNoise();
car2.accelerate();

Car2 anotherCar= new Car2();
anotherCar.make="Toyota";

}
}