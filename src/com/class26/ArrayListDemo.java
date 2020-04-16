package com.class26;

import java.util.ArrayList;

public class ArrayListDemo {
	
public static void main(String[] args) {
	
	//array list with names
	ArrayList<String> arrayList=new ArrayList<>();
	
	//adding String object into arrayList
	arrayList.add("John");
	arrayList.add("Pavel");
	
	//access element from arrayList
	String name=arrayList.get(1);
	System.out.println(name);
	
	//arrayList is dynamic array
	int size=arrayList.size();
	System.out.println(size);
	
	arrayList.add("Hichem");
	arrayList.add("Marga");
	arrayList.add("Victor");
	System.out.println(arrayList.size());
	//removing elements
	arrayList.remove("Hichem");
	System.out.println(arrayList.size());
	
	//replacing elements (1 {index} , "Name")
	arrayList.set(1, "Marina");
	System.out.println(arrayList);
	
	//how to retrieve values from arrayList 1 by 1?
	for (int i=0; i<arrayList.size(); i++) {
		String element=arrayList.get(i);
		System.out.println(element);
	}
	System.out.println("______________");
	for (String arr:arrayList) {
		System.out.println(arr);
	}
	
}
}
