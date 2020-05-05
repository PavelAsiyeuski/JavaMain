package com.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	//How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value 
	//then programmer expected.
	
	Scanner scan=new Scanner (System.in);
	try {
	
		System.out.println("Enter something");
		int a=scan.nextInt();
	}catch(InputMismatchException ie) {
		System.out.println("Exception caught");
	}
	
}
}
