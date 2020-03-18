package com.class05;

public class MoreLogicalOperatotrs {
public static void main(String [] args) {
	int day=2;
	if (day==2 || day==3) {
		System.out.println("Today is SDLC class");
		}else if(day==6 || day==7){
		System.out.println("Today is Java class");
		}else if(day==1 || day==5) {
		System.out.println("Today is a day off");
		}else if (day==4) {
		System.out.println("Today is review day");
		}else {
		System.out.println("Invalid day");
		}
	System.out.println("________________________________");
	String day1="Saturday";
	if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
		System.out.println("Today is SDLC class");
	}else if (day1.equals("Saturday") || day1.equals("Sunday")){
		System.out.println("Today is Java class");
    } else if (day1.equals("Monday") || day1.equals("Friday")) {
        System.out.println("Today is no Class, it is day off");
    } else if (day1.equals("Thursday")) {
        System.out.println("Today is a review class with Elion");
    } else {
        System.out.println("Invalid day");
    }
			
}
}
