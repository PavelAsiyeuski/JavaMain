package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		//if day is friday-->if date is 13--->watch scary movie
		//				  -->if date is not 13-->watch a comedy 
		boolean isFriday=true;
		int date=14;
		
		if(isFriday) {
			System.out.println("Today is Friday, I am going to movies");
			if(date==13) {System.out.println("I'll watch scary movie");
			}else {System.out.println("I'll watch a comedy");
			}
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}
	}
}
