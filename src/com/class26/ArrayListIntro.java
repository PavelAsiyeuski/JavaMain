package com.class26;

import java.util.ArrayList;

public class ArrayListIntro {
public static void main(String[] args) {
	
	//create an arrayList to store numbers
	
	ArrayList<Integer> numbers=new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(20);
	
	for (int i=0; i<numbers.size(); i++) {
		int num=numbers.get(i);   //autounboxing
	}
	System.out.println("___________________");
	for (int num:numbers) {
		System.out.println(num);
	}
	
}
}
 