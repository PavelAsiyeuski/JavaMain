package com.class17;

public class Task03 {
	String vowel="";
private String a(String word) {
	vowel=word.replaceAll("[^AaEeUuIiOo]", "");
	return vowel;
}
public static void main(String[] args) {
	

Task03 obj=new Task03();
obj.a("ABRAKADABRA");
System.out.println(obj.vowel);
}
}