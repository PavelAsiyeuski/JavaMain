package com.class21_HW;

public class Area {
	//Create 1 class in which create a methods that will calculate the area (volume) of 
	//Rectangle
	//Square
	//Box
	void rect(int a,int b, int c) {
		System.out.println("The area of rectangle is"+(a*b*c));
	}
	void square(int a,int b,int c,int d) {
		System.out.println("The area of square is "+((a*b)*2));
	}
	void box (int a,int b,int c) {
		System.out.println("The are of a box is "+(2*a+2*b+2*c));
	}
}
