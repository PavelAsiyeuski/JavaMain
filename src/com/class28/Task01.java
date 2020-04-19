package com.class28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task01 {
public static void main(String[] args) {
	
 //Create a Set collection in which you need to add names of the countries. 
	//In this set we want all objects to be sorted in alphabetical order. 
	//Using 2 different ways retrieve all elements from set.
	
	Set <String> countries=new TreeSet<>();
	countries.add("Belarus");
	countries.add("Ukraine");
	countries.add("USA");
	countries.add("Lithuania");
	countries.add("Argentina");
	countries.add("China");
	countries.add("Turkey");
	System.out.println(countries);
	Iterator <String> it=countries.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
