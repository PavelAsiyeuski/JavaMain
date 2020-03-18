package com.class05;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your height");
	int height=scan.nextInt();
	if(height<60) {
		System.out.println("You are short");
	}else if (height>=60 && height<=72) {
		System.out.println("You are meduim");
	}else if (height>72) {
		System.out.println("You are tall");
	}
	
}
}
