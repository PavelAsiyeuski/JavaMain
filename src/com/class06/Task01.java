package com.class06;

import java.util.Scanner;

public class Task01 {
public static void main(String [] args) {
	Scanner scan=new Scanner (System.in);
	String country;
	String lang;
	System.out.println("Please enter your country");
	country=scan.nextLine();
	switch (country) {
	case "Russia":
		lang="Russian";
		break;
	case "Belarus":
		lang="Russian";
		break;
	case "Ukraine":
		lang="Ukrainian";
		break;
	case "UK":
		lang="English";
		break;
	case "Germany":
		lang="German";
		break;
	case "France":
		lang="French";
		break;
		default:
			lang="Invalid name";
	}
	System.out.println("They speak "+lang);
}
}
