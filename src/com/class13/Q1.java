package com.class13;

public class Q1 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("The value of a "+a);
	System.out.println("The value of b "+b);
	
	String str1="Day";
	String str2="Night";
	str1=str1.concat(str2);
	str2=str1.substring(0, str1.length()-str2.length());
	str1=str1.substring(str2.length());  
	System.out.println("The value of str2 is "+str2);
	System.out.println("The value of str1 is "+str1);
}
}
