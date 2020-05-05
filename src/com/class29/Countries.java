package com.class29;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Countries {
public static void main(String[] args) {
	//Create a map of countries with its capital that will store countries in alphabetical order.
	//Print all keys and values from a country map using for each loop and iterator.
	//Print all values from a country map using for each loop and iterator.
	
	Map <String,String> countries = new TreeMap<>();
	countries.put("Belarus","Minsk");
	countries.put("Russia","Moscow");
	countries.put("Ukraine","Kiev");
	countries.put("USA","Washington DC");
	countries.put("Canada","Ottawa");
	countries.put("Spain","Madrid");
	Set <String> name=countries.keySet();
	Collection <String> cap=countries.values();
	for (String f:name) {
		System.out.println(f);
	}
	for (String d:cap) {
		System.out.println(d);
	}
	Iterator <String> it=name.iterator();
	Iterator <String> ti=cap.iterator();
	for (int i=0; i<countries.size();i++) {
		System.out.println("The capital of "+it.next()+" is "+ti.next());
	}
}
}
