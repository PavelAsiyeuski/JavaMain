package com.class12;

public class StringReplace {
public static void main(String[] args) {
	String me="I am a good tester";
	String newString=me.replace("a", "c");
	System.out.println(newString);
	
	me=me.replace("good", "great");
	System.out.println(me);
	
	me=me.replace("Great", "Awesome");
	System.out.println(me);
	
	//.replaceAll()
	
	String str="Phone number is 1234567890";
	str=str.replaceAll("[A-Za-z]","");
	System.out.println(str);
	
	String str1="Hello123456*$&@!! 89";
	str1=str1.replaceAll("[^0-9]", "");
	System.out.println(str1);
}
}
