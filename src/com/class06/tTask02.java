package com.class06;

import java.util.Scanner;

public class tTask02 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	String grade;
	String exp;
	System.out.println("Please enter your grade");
	grade=scan.nextLine();
	switch (grade) {
		case "A":
			exp="Excellent";
			break;
		case "B":
			exp="Good";
			break;
		case "C":
			exp="Average";
			break;
		case "D":
			exp="Bad";
			break;
			default:
				exp="Not acceptable";
	}
	System.out.println("The grade "+grade+" means "+exp);
			
			
}
}
