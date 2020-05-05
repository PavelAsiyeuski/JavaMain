package com.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuy {
public static void main(String[] args) {
	//Create a map of Best Buy store. Place
	//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	//Retrieve all keys and values from a Best Buy map using EntrySet.
	
	Map <Integer, String> store = new LinkedHashMap<>();
	store.put(140134, "TV");
	store.put(134156, "Laptop");
	store.put(125546, "Printer");
	store.put(154345, "Microwave");
	store.put(154367, "Vacuum");
	System.out.println(store.size());

	
	
	Set <Entry<Integer, String>> set=store.entrySet();
	for (Entry s:set) {
		System.out.println("You can buy "+s.getValue()+" with the item ID "+s.getKey()) ;
	}
}
}
