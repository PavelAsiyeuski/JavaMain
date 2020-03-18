package com.class11;

public class StringVerification {
public static void main(String[] args) {
	String message="Welcome Admin";
	//verify that message contains username which is admin
	System.out.println(message.contains("Admin"));
	boolean flag=message.contains("Welcome");
	System.out.println(flag);
	//we want to see if welcome starts with welcome
	
	message.startsWith("Welcome");
}
}
