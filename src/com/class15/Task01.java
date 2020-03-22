package com.class15;

public class Task01 {
void isLarger (int a, int b) {
	if (a<b) {
		System.out.println(b+" is larger than "+a);
	}else if (a>b) {
		System.out.println(a+" is larger than "+b);
	}else {
		System.out.println("Numbers are even");
	}
}
void isEvenOrOdd(int c) {
	if (c%2==0) {
		System.out.println(c+" is even");
	}else {
		System.out.println(c+" is odd");
	}
}
void isPalindrome(String word) {
	char [] array = word.toCharArray();
	String reverse="";
	for (int i=array.length-1; i>=0; i--) {
		reverse+=array[i];
	}
	if (reverse.equalsIgnoreCase(word)) {
		System.out.println("Word is palindrome");
	}else {
		System.out.println("Word is not palindrome");
	}
}
void hello (String lang) {
	if (lang.equalsIgnoreCase("USA") || lang.equalsIgnoreCase("UK")) {
		System.out.println("Hello");
	}else if (lang.equalsIgnoreCase("russia")) {
		System.out.println("Привет");
	}else if (lang.equalsIgnoreCase("France")) {
		System.out.println("Bonjour");
	}else if (lang.equalsIgnoreCase("Spain") || lang.equalsIgnoreCase("Mexico")) {
		System.out.println("Hola");
	}else if (lang.equalsIgnoreCase("Belarus")) {
		System.out.println("Прывiтанне");
	}else {
		System.out.println("Please enter different country");
	}
	
}
}
