package com.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	int age;
	System.out.println("Please enter your age");
	age=scan.nextInt();
	if (age>0 && age<3) {
		System.out.println("You are a baby");
	}else if (age>=3 && age<=5) {
		System.out.println("You are a kid");
	}else if (age>5 && age<=12) {
		System.out.println("You are a child");
	}else if (age>12 && age<=19) {
		System.out.println("You are a teenager");
	}else if (age>19 && age<65) {
		System.out.println("You are an adult");
	}else {
		System.out.println("You are enjoying your life");
	}
}
}
