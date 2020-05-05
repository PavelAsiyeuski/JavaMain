package com.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {
public static void main(String[] args) {
	
	try {
		Thread.sleep(3000);
		System.out.println("dsdsds");
		
	}catch (InterruptedException e) {
		System.out.println("Caught exception");
	}
	System.out.println("Continue to next block");
	
	String fPath="";
	try {
		FileInputStream fis=new FileInputStream(fPath);
	}catch(FileNotFoundException fne) {
		System.out.println("Caught exception");
	}
	
	int a=10;
	int b=0;
	
	try {
		System.out.println(a/b);
	}catch (ArithmeticException ae) {
		System.out.println("Caught arithmetic exception");
	}
}
}
