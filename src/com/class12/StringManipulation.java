package com.class12;

public class StringManipulation {
public static void main(String[] args) {
	String str="Good Morning Students!";
	char letter1=str.charAt(0);
	System.out.println(letter1);
	char letter5=str.charAt(4);
	System.out.println(letter5);
	
	//get all characters 1 by 1 from string 
	
	char letter;
	for (int i=0; i<str.length(); i++) {
		letter=str.charAt(i);
		System.out.println(letter+" ");
	}
	System.out.println("INDEX OF ______________");
	
	String name="Syntax Technologies";
	int index=name.indexOf("y");
	System.out.println(index);
	
	index=name.indexOf(" ");
	System.out.println(index);
	
	index=name.indexOf("Technologies");
	System.out.println(index);
	
	index=name.indexOf("o");
	System.out.println("Index of first o="+index);
	
	index=name.lastIndexOf("o");
	System.out.println("Index of the last o="+index);
	
}
}