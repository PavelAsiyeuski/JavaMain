package com.class11;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Please Enter Username");
	String name=scan.nextLine();
	System.out.println("Please Enter Password");
	String pass=scan.nextLine();
	System.out.println("Please Confirm Password");
	String conf=scan.nextLine();
	if (name.isEmpty()||pass.isEmpty()||conf.isEmpty()) {
		System.out.println("Username or Password cannot be empty");
	}
	else if (pass.length()<8) {
		System.out.println("Password is too short");
	}
	else if (pass.contains(name)) {
		System.out.println("Password cannot contain username");
	}
	else if (conf.equals(pass)) {
		System.out.println("Your username and password has been created");
	}else {
		System.out.println("Password do not match");
	}
}
}
