package com.class04;

import java.util.Scanner;

public class ScannerAndVerification {

	public static void main(String[] args) {
		// Capture 2 numbers from a user and compare them and identify which is larger

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");

		int num1 = input.nextInt();
		System.out.println("Please enter a second number");
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println("Number 1 is larger than Number 2");
		} else if (num2 > num1) {
			System.out.println("Number 2 is larger than Number 1");
		} else {
			System.out.println("Numbers are equal");
		}
	}
}
