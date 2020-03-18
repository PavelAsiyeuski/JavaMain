package com.class06;

import java.util.Scanner;

public class ScannerAndSwitch {
public static void main(String [] args) {
	Scanner scan=new Scanner (System.in);
	char gender;
	String genderType;
	
	System.out.println("Please enter gender:M or F");
	gender=scan.next().charAt(0);
	switch (gender) {
	case 'M':
		genderType="Man";
		break;
	case 'F':
		genderType="Female";
		break;
		default:
			genderType="Unknown";
	}
	System.out.println("Your gender is "+genderType);
}
}
