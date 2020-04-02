package com.class19;

public class TestClass {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.breed="Husky";
		dog.color="Grey";
		dog.fur="Too much";
		dog.size="Big";
		
		dog.bark();
		dog.beWild();
		dog.sleep();
		dog.eat();
		
		Animals animal=new Animals();
		animal.color="Any";
		animal.fur="Any";
		animal.size="Any";
		
		Cat cat=new Cat();
		cat.color="Grey";
		cat.fur="Short";
		cat.size="Medium";
		cat.bigEyes=true;
		
		cat.beWild();
		cat.sleep();
		cat.eat();
		cat.play();
	}
}
