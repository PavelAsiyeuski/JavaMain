package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	final String getFirst(int birthMonth, int birthDay, int birthYear){
		  String birth=birthMonth+"/"+birthDay+"/"+birthYear;
		  System.out.println(birth);
		  return birth;
		  
		}

public static void main(String[] args) {
	Task1 obj=new Task1();
	obj.getFirst(01, 01, 1991);
	
	
	ArrayList <String> cars=new ArrayList<>();
	cars.add("Toyota");
	cars.add("Tesla");
	cars.add("BMW");
	cars.add("Mercedes");
	cars.add("Nissan");
	
	for (String c:cars) {
		System.out.println(c);
	}
	Iterator <String> it=cars.iterator();
	while(it.hasNext()) {
		String car=it.next();
		System.out.println(car);
	}
	for (int i=0; i<cars.size(); i++) {
		System.out.println(cars.get(i));
	}
	
}
}
