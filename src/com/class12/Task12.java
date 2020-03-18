package com.class12;

public class Task12 {
public static void main(String[] args) {
	String name="Java is the best! YAY 1488!!!";
	String alpha=name.replaceAll("[^A-Za-z]", "");
	int a=alpha.length();
	System.out.println(a);
}
}
