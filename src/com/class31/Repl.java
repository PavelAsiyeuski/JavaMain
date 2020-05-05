package com.class31;

import java.util.*;
import java.util.Iterator;
import java.util.Map.*;

public class Repl {
	public static void display(Map<String,Integer> map){
		Set <Entry<String,Integer>> set=map.entrySet();
		Iterator <Entry<String,Integer>> it = set.iterator();
	    if (map.isEmpty()) {
	    	System.out.println("map is empty");
	    }else {
	    	while (it.hasNext()) {
	    		Entry <String,Integer> ent=it.next();
	    		System.out.println(ent.getKey()+" "+ent.getValue());
	    	}
	    }
	  }



	public static void main(String[] args) {
		Map <String,Integer> map = new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		Set <Entry<String,Integer>> set=map.entrySet();
		
			display(map);
	
	}
}

