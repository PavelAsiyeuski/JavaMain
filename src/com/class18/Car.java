package com.class18;

public class Car {
String make, model, color;
int year;

public void printDetails() {
	System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
}

public static void main(String[] args) {
Car car1=new Car();
Car car=new Car();
car.make="BMW";
car.model="X6";
car.year=2019;
car.printDetails();

System.out.println(car1.make);

}
}
