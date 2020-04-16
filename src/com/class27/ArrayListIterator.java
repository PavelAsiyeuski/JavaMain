package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
public static void main(String[] args) {
	ArrayList <String> choco=new ArrayList<>();
	choco.add("Kinder");
	choco.add("Godiva");
	choco.add("Lindt");
	choco.add("Snickers");
	
	ArrayList <String> sweets=new ArrayList<>();
	sweets.add("cheesecake");
	sweets.add("ice cream");
	sweets.addAll(choco);
	
	//how we iterate through the collection
	Iterator<String> it=sweets.iterator();
	while (it.hasNext()) {
		String element=it.next();
		System.out.println(element);
	}
	
}
}
