package com.class12;

public class StringManipulationsMore {
public static void main(String[] args) {
	System.out.println("Substring()");
	
	String str="Today is a rainy day";
	String partialString=str.substring(6);
	System.out.println(partialString);
	
	//print only Today
	partialString=str.substring(0, 5);
	System.out.println(partialString);
	
	//print rainy
	partialString=str.substring(11, 16);
	System.out.println(partialString);
	
	
}
}
