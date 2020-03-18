package com.class03;

public class IfValuables {
public static void main(String[] args) {
	int day=4;
	if(day==1) {
		System.out.println("It is Monday, we don't have class today");
	}else if (day==2) {
		System.out.println("It is Tuesday, we have SDLC class");
	}else if (day==3) {
		System.out.println("It is Wednesday, we have SDLC class");
	}else if (day==4) {
		System.out.println("It is Thursday, we have Review class");
	}else if (day==4) {
		System.out.println("It is Friday, we don't have class today");
	}else if (day==6) {
		System.out.println("It is Saturday, we have Java class today");
	}else if (day==7) {
		System.out.println("It is Sunday, we have Java class today");
	}else {System.out.println("Invalid weekday");
	}
}
}
