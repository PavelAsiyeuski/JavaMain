package com.class05;

public class Task2 {
public static void main(String [] args) {
	int day=7;
	if (day>=1 && day<=5) {
		System.out.println("It's a weekday");
	}else if (day>5 && day<=7) {
		System.out.println("It's a weekend");
	}else {
		System.out.println("Invalid day");
	}
}
}
