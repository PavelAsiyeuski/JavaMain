package com.class04;

import java.util.Scanner;

public class ScannerTask {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("What is the amount of loan you need?");
	int num1=scan.nextInt();
	if (num1<200000) {System.out.println("You got it!");
	}else {System.out.println("Sorry, we can't lend you this money");
	
	}
	
}
}
