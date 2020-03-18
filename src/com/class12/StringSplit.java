package com.class12;

public class StringSplit {
public static void main(String[] args) {
	String today="Today is my favorite Java class";
	String [] array=today.split("my");
	System.out.println(array.length);
	System.out.println(array[0]);
	System.out.println(array[1]);
	
	String [] stringArray=today.split("a");
	for (String arr:stringArray) {
		System.out.println(arr);
	}
}
}
