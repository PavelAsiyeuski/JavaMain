package com.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*You are a salesman
		 * ask a user for piece of the item
		 * based on the amount of sales we need to calculate commission
		 * if sales are between 1-100 --> commission should be 90%
		 * 100-200 --> commission is 20%
		 * 200-500 --> commission is 30%
		 * >500 -->50%
		 */
		Scanner scan=new Scanner (System.in);
		double sales;
		double commission;
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble();
		if (sales>=1 && sales<=100) {
			commission=sales*0.10;
		}else if (sales>100 && sales<=200) {
				commission=sales*0.2;
		}else if (sales>200 && sales<=500) {
			commission=sales*0.3;
		}else {
			commission=sales*0.5;
		}
;		
		System.out.println("Based on your sales, your commission is "+commission);
	}

}
