package com.class06;

import java.util.Scanner;

public class AllInOne {
public static void main(String [] args) {
	/*write a program to ask user if there is a sale 
	 * if no sale --> not going shopping
	 * if there is a sale --> calculate the price 
	 * based on the price we will apply discount and calculate final price
	 * 
	 * if price < 20 ==> apply 10%
	 * if price between 20 and 100 ==> 20%
	 * between 100 and 500 ==> 30%
	 * if price higher than 500 ==> apply 50%
	 * 
	 * After discount ___ the price of the item reduced from ____ to ____	 
	 * */
Scanner scan=new Scanner (System.in);
double finalPrice = 0;
int discount = 0;
System.out.println("Did you make any sale?");
String sale=scan.nextLine();
if (sale.equals("No")) {
	System.out.println("Not going to shop");
}else if (sale.equals("Yes")) {
		System.out.println("Please enter the price");
	}double price=scan.nextDouble();
		if(price<20) {
			finalPrice=price-(price*0.1);
			discount=10;
		}else if (price>=20 && price<100) {
			finalPrice=price-(price*0.2);
			discount=20;
		}else if (price>=100 && price<500) {
			finalPrice=price-(price*0.3);
			discount=30;
		}else if (price>=500) {
			finalPrice=price-(price*0.5);
			discount=50;
		}System.out.println("After "+discount+"% discount the price of the item reduced from "+price+" to "+finalPrice);
			


}
}
