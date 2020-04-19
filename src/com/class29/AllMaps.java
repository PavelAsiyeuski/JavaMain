package com.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {
public static void main(String[] args) {
	Map <String, Integer> grocery=new HashMap<>();
	grocery.put("milk",1);
	grocery.put("cucumber",2);
	grocery.put("banana", 12);
	grocery.put("cheese",3);
	grocery.put("grapes",5);
	System.out.println(grocery);
	
	//create a map of items to buy (item,quantity) in which we want to save the order
	Map<String,Integer> household=new LinkedHashMap<>();
	household.put("sanitizer",2);
	household.put("paper towel",3);
	household.put("toilet paper",4);
	household.put("face mask",50);
	System.out.println(household);
	//create a map in which we store
	Map <String,Integer> shopping=new TreeMap<>();
	shopping.putAll(grocery);
	shopping.putAll(household);
	System.out.println(shopping);
	
	Set <String> keys=shopping.keySet();
	System.out.println(keys);
	
	Collection <Integer> values=shopping.values();
	System.out.println(values);
	
	Iterator <Integer> val=shopping.values().iterator();
	while (val.hasNext()) {
		System.out.print(val.next());
	}
}
}
