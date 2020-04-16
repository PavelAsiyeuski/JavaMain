package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
public static void main(String[] args) {
	//lets make arrayList that stores double type of objects
	
	ArrayList<Double> alist = new ArrayList<>();
	alist.add(10.99);
	alist.add(12.90);
	alist.add(1000.99);
	
	System.out.println(alist);
	
	System.out.println(alist.size());
	
	alist.set(1, 29.99);
	
	System.out.println(alist);
	
	ArrayList obj=new ArrayList();
	obj.add("hello");
	obj.add(100);
	obj.add('c');
	
	obj.addAll(alist); //implementing all objects in our collection
	for (Object o:obj) {
		System.out.println(o);
	}
	System.out.println(obj);
	//iterator 
	Iterator<Double> iterator=alist.iterator();
	while(iterator.hasNext()) {
		double d=iterator.next();
		System.out.println(d);
	}
	
}
}
