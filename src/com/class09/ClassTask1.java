package com.class09;

public class ClassTask1 {
public static void main(String [] args) {
	for (int a=5; a>0; a--) {
		for (int b=1; b<=a; b++) {
			System.out.print(a);
		}
		System.out.println();
	}
	System.out.println("____________________");
	for (int a=1; a<6; a++) {
		for (int b=1; b<=a; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int c=4; c>0; c--) {
		for (int d=1; d<=c; d++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
