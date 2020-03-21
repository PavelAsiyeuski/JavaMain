package com.class14;

public class MyDogs {
public static void main(String[] args) {
	Dog dog1=new Dog();
	dog1.breed="Shih tzu";
	dog1.color="yellow";
	dog1.name="Lucy";
	dog1.age=2;
	
	Dog dog2=new Dog();
	dog2.breed="Poudel";
	dog2.color="White";
	dog2.name="Erzhan";
	dog2.age=10;
	dog2.bark();
	dog2.eat();
	dog2.run();
}
}
