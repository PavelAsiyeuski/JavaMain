package com.class08;

import java.util.Scanner;

public class ClassTaask {
public static void main(String[] args) {
//Write a program that reads a range of integers 
//(start and end point), provided by a user and then from that 
//range prints the sum of the even and odd integers.
	Scanner scan = new Scanner (System.in);
	int a=0;
	int b=0;
	int num2=0;
	int num3=0;
	System.out.println("Please enter two numbers for range");
	a=scan.nextInt();
	b=scan.nextInt();
	for (int num1=a; num1<=b; num1++) {
		if(num1%2==0) {
			num2=num2+num1;
		}else {
			num3=num3+num1;
		}
	}
	System.out.println("Even numbers sum is "+num2+". The sum of odd numbers is "+num3);
}
}
