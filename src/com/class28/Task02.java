package com.class28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task02 {
public static void main(String[] args) {
	//Create a Set of cities in which you want to make sure that insertion order is maintained. 
	//Using Iterator remove any city that starts with “A”;
	
	Set <String> cities=new LinkedHashSet<>();
	cities.add("Minsk");
	cities.add("Vilnius");
	cities.add("Kiev");
	cities.add("New York");
	cities.add("Anaheim");
	cities.add("Amsterdam");
	cities.add("Moscow");
	
	Iterator <String> it=cities.iterator();
	while(it.hasNext()) {
		String s=it.next();
		if (s.startsWith("A")) {
			it.remove();
		}
	}
	System.out.println(cities);
	
}
}
