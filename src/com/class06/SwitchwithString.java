package com.class06;

import java.util.Scanner;

public class SwitchwithString {
public static void main(String[] args) {
	String country;
	String food;
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	switch (country.toLowerCase()) {
	case "Morocco":
		food="couscous";
		break;
	case "Belorussia":
		food="Potato";
		break;
	case "Tajikistan":
		food="Osh";
		break;
	case "Turkey":
		food="Baklava";
		break;
	case "Afghanistan":
		food="Mantu";
		break;
	case "Kazakhstan":
		food="Beshparmak";
		break;
	default:
		food="Unknown";
	}
System.out.println("Your favorite food is "+food);
}
}
