package com.class09;

public class NestedLoopies {
public static void main(String [] args) {
	for (int a=1; a<6; a++) {
		for (int b=1; b<10; b++) {
			System.out.print(b);
		}
		System.out.println();
	}
	System.out.println("________________________");
	for (int a=1; a<6; a++) {
		for (int b=1; b<6; b++) {
			System.out.print(b);
		}
		System.out.println();
	}
	System.out.println("_______________________");
	for (int a=1; a<6; a++) {
		for (int b=5; b>0; b--) {
			System.out.print(b);
		}
		System.out.println();
	}
	System.out.println("_______________________");
	for (int a=5; a>0; a--) {
		for (int b=1; b<6; b++) {
			System.out.print(a);
		}
		System.out.println();
	}
}
}
