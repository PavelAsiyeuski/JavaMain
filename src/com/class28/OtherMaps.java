package com.class28;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {
public static void main(String[] args) {
	Map <Integer, String> lmap=new LinkedHashMap<>();
	lmap.put(1234, "John Smith");
	lmap.put(1245, "Pavel ASiyeuski");
	lmap.put(1245, "Margaritka");
	
	System.out.println(lmap);
	System.out.println("_____________");
	
	Map <Integer, String> tmap=new TreeMap<>();
	tmap.put(1230, "Pavlik");
	tmap.put(1230, "Marga");
	tmap.put(1345, "Anna");
	tmap.put(5600, "Aaaa");
	System.out.println(tmap);
	
	Set <Integer> set=tmap.keySet();
	System.out.println(set);
	Collection <String> alist=tmap.values();
	System.out.println(alist);
	Set<Entry<Integer, String>> ss=tmap.entrySet();
	Iterator <Entry<Integer, String>> it=ss.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
