package com.class29;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapEntry {
public static void main(String[] args) {
	Map<String, Integer>month=new LinkedHashMap<>();
	month.put("January", 1);
	month.put("February",2);
	month.put("March",3);
	month.put("April",4);
	month.
	Set <Entry<String,Integer>> set=month.entrySet();
	for (Entry f:set) {  
		System.out.println(f);
	}
	Iterator <Entry<String,Integer>> it=set.iterator();
	while (it.hasNext()) {
		Entry <String,Integer>entry=it.next();
		System.out.println(entry);
		System.out.println("Key "+it.next().getKey()+"== value "+entry.getValue());
	}
}
}
