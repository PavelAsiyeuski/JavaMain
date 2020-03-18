package com.class12;

public class Task02 {

	public static void main(String[] args) {

		String name="Testers";
		int num = name.length();
		int x=num/2;
		if (num%2!=0 && num>3) {
			System.out.println(name.charAt(x));
		}else {
			System.out.println("Your number is not odd");
		}
		
	}

}
