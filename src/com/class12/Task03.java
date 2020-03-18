package com.class12;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	String name="null";
	System.out.println("Mom's first name?");
	String mom=scan.nextLine();
	System.out.println("Dad's first name?");
	String dad=scan.nextLine();
	int a=dad.length()/2;
	int b=mom.length()/2;
	
	System.out.println("Boy or Girl?");
	String baby=scan.nextLine();
	if (baby.equalsIgnoreCase("boy")) {
		name=dad.substring(0, a).concat(mom.substring(b));
		System.out.println(name);
	}else if (baby.equalsIgnoreCase("girl")) {
		name=mom.substring(0, b).concat(dad.substring(a));
		System.out.println(name);
	}else {
		System.out.println("Enter a valid sex of your kid");
	}
} 
}
