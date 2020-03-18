package com.class08;

public class Continue {
public static void main(String[] args) {
	//write a program to print numbers from 1 to 20 without 5,6,7
	for(int i=1; i<21; i++) {
		if(i==5 || i==6 || i==7) {
			continue;
		}
		System.out.println(i);
	}
	System.out.println("____________________");
	for (int i=1; i<=100; i++) {
		if(i>=35 && i<=55) {
			continue;
		}
		System.out.println(i);
	}
}
}
