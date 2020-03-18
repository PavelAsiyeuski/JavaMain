package com.class11;

public class StringValidation {
public static void main(String[] args) {
	String str1="Welcome Syntax Students";
	String str2="Welcome Syntax students";
	//to compare 2 strings
	
	System.out.println(str1.equals(str2));
	System.out.println(str1.equalsIgnoreCase(str2));
	
	String actual="Home - Syntax Technologies   ";
	String expected="Home - Syntax Technologies";
	if (actual.trim().equals(expected)) {
		System.out.println("Test case pass.");
	}else {
		System.out.println("Test case fail.");
	}
		System.out.println("__________________");
	
		if(actual.trim().equals(expected)) {
			System.out.println("Test case pass.");
		}else {
			System.out.println("Test case fail.");
		}
	}
}

