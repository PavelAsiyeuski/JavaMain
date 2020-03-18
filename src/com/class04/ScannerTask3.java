package com.class04;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter name of the city");
		String city=scan.nextLine();
		System.out.println("Please enter the temperature");
		int temp=scan.nextInt();
		System.out.println("The temperature in the city "+city+" is "+(temp-32)*0.55);
	}
}
