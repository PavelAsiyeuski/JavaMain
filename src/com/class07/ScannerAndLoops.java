package com.class07;

import java.util.Scanner;

public class ScannerAndLoops {
public static void main(String[] args) {
	//we want to ask user's name 5 times and print Good Afternoon
	Scanner input;
	String name;
	int num=1;  
	input= new Scanner (System.in);
	
	while (num<=5) {
	System.out.println("What is your name");
	name=input.nextLine();
	System.out.println("Good Afternoon "+name);
	num++;
}
	System.out.println("_______________________________");
	
	int b=1;
	while(b<=20) {
	System.out.println("Enter a number from 1 to 20");
	int a=input.nextInt();
	}
	int a = 0;
	if (a==17) {
		System.out.println("Congrats");
	}
	
	
	
}
}