package com.class28;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		Map<String, String>hmap= new HashMap<>();
		hmap.put("Name","John");
		hmap.put("Last Name","Smith");
		hmap.put("Address","123 Main St");
		hmap.put("City","Scranton");
		
		boolean isEmpty=hmap.isEmpty();
		System.out.println("Map is empty= "+isEmpty);
		
		
		System.out.println("Map size is "+hmap.size());
		
		hmap.put("Zip","12312");
		hmap.put("Name","Jane");
		System.out.println(hmap);
	}
}
