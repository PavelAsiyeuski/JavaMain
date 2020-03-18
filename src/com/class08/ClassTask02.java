package com.class08;

import java.util.Scanner;

public class ClassTask02 {

	public static void main(String[] args) {
		/*Write a program to ask a user to enter item they want to buy 
		 * and the price of that item. Every time user enters money accumulate 
		 * the amount and tell the user how much is left to pay off the amount. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		String item="null";
		Scanner scan=new Scanner (System.in);
		int price=0;
		int pay=0;
		int left=0;
		int left1=0;
		int change=0;
		System.out.println("Please enter the name of your item");
		item=scan.nextLine();
		System.out.println("Please enter the price of the item");
		price=scan.nextInt();
		System.out.println("How much are you paying?");
		pay=scan.nextInt();
		do { 
			left=price-(pay+left1);
			if (price==pay) {
				System.out.println("Thank you for shopping");
				break;
			}else if (pay>price) {
				change=pay-price;
				System.out.println("Your change is "+change);
			}else {
				do {
				pay=scan.nextInt();
				left1=left-pay;
				if (left1>0)
				System.out.println("You have "+left1+" left to pay");
				else {
					System.out.println("Thank you for shopping!");
				}
			}while (left1>0);
			}
		}while (pay<price);
		}
	}


