package com.class12;

public class InterviewTask {
public static void main(String[] args) {
	
	String name="Hello! You can check any String here";
	
	String alpha=name.replaceAll("[^A-za-z]", "");
	int a=alpha.length();
	System.out.println("The number of alpha characters is "+a);
	System.out.println("________________________________");
	String word=name.replaceAll("[A-za-z0-9!?.,]", "");
	int b=word.length();
	System.out.println("The number of words is "+(b+1));
	
}
}
