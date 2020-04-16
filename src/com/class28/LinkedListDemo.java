package com.class28;

import java.util.Iterator;
import java.util.LinkedList;

import com.class27.Food;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList <String> llist=new LinkedList<>(); 
	llist.add("Yunus");
	llist.add("Pavlik");
	llist.add(1,"Margasha");
	System.out.println(llist);
	
	for (String l:llist) {
		System.out.println(l);
	}
	for (int i=0; i<llist.size(); i++) {
		System.out.println(llist.get(i));
	}
	Iterator <String> it=llist.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
	LinkedList<Food> food=new LinkedList<>();
	System.out.println(food);
} 
}
