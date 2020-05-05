package com.class34;

public class Task01 {
	public static void main(String[] args) {
		ageCheck(17);
		checkUserName("Pavlik");
		checkUserName("Pavl");
	}
public static void ageCheck (int age) {
	if (age<16) {
		throw new RuntimeException ("Age has to be higher than 16"); 
	}
}
public static void checkUserName (String userName) {
	if (userName.length()<5) {
		throw new RuntimeException ("UserName has to be at least 5 characters long");
		}
	}
}

