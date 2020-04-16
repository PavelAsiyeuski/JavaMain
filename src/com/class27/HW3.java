package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3 {
public static void main(String[] args) {
	ArrayList <String> drinks=new ArrayList<>();
	drinks.add("Cola");
	drinks.add("Gin");
	drinks.add("Juice");
	drinks.add("Coffee");
	drinks.add("Tea");
	drinks.add("Vodka");
	
	
	for (int i=0; i<drinks.size(); i++) {
		if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
			drinks.set(i, "Water");
		}
		
	}
	System.out.println(drinks);
}
}
