package com.class11;

public class StringDemo {
public static void main(String [] args) {
	String school="Syntax";
	String str=new String ("hello");
	String str1="This a String 7676,&7&&";
	//how many characters String has
	System.out.println(school.length());
	System.out.println(str.length());
	//convert String to lowercase or uppercase
	System.out.println(school.toUpperCase());
	//concatinate 2 string 
	String newString=str+school;
	System.out.println(newString);
	
	String day="Saturday";
	String date="14";
	
	String newDate=day.concat(date); 
	System.out.println(newDate);
	
	char grade='A';
	String str2="Student";
	//concatination can be used only for String+String
	
	//see if string is EMPTY
	String str3="";
	boolean empty=str3.isEmpty();
	System.out.println(empty);
	
	//TRIM Functions
	String str4="   Welcome to Syntax   ";
	str4=str4.trim();
System.out.println(str4);
}
}
