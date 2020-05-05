package com.class33;

public class AboutException {
public static void main(String[] args) {
	String str="Hello";
	try {
	char character=str.charAt(10);
	System.out.println(character);
	} catch (StringIndexOutOfBoundsException se) {
		//to get info about exception
		//!!!! se.printStackTrace(); !!!!// name,message about E , where it occurs
		// System.out.println(se); //name and message about E
		System.out.println(se.getMessage()); //just a message
	}
			System.out.println("End of the program");
}
}
