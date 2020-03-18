package com.class07;

public class WhileLoop {

	public static void main(String[] args) {
		int time=10;
		while (time<12) {
			System.out.println("Good Morning");
			time++;
		}
//how to print numbers from 1 to 50;
		time=1;
		while (time<=50) {
			System.out.println(time);
			time++;
		}
		
		int num1=5;
		while(num1<=15) {
			System.out.println(num1+" ");
			num1++;
			System.out.println("******************");
			
		int num2=50;
		while(num2>0) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println("*****************************");
		int num3=1;
		while (num3<20) {
			System.out.println(num3);
			num3+=2;
		}
				
	}

}
} 
