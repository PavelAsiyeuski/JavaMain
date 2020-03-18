package com.class06;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	int a;
	int b;
	char c;
	int d = 0;
	System.out.println("Please enter first number");
	a=scan.nextInt();
	System.out.println("Please enter second number");
	b=scan.nextInt();
	System.out.println("Please enter operator");
	c=scan.next().charAt(0);
	switch (c) {
	case '+':
		d=a+b;
		break;
	case '-':
		d=a-b;
		break;
	case '*':
		d=a*b;
		break;
	case '/':
		d=a/b;
		break;
		default:
			System.out.println("Invalid operator");
	}
	System.out.println(a+""+c+""+b+" equals to "+d);
}
}
