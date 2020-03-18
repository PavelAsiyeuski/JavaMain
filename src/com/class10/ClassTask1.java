package com.class10;

public class ClassTask1 {
public static void main(String[] args) {
	String [] animals= {"Bear", "Moose", "Fox", "Wolf", "Cat", "Dog"};
	for (int i=0; i<animals.length; i++) {
		System.out.println(animals[i]);
	}
	for (String animal:animals) {
		System.out.println(animal);
	}
}
}
