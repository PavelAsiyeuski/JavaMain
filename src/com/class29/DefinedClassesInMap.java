package com.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {
	String type, name;
	Store (String type, String name){
		this.type=type;
		this.name=name;
	}
	public void display () {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours();
}

class Nike extends Store {

	Nike(String type, String name) {
		super(type, name);
	}
	public void workingHours() {
		System.out.println(name+" works from 10 am till 6 pm");
	}
}
class Costco extends Store {

	Costco(String type, String name) {
		super(type, name);
	}
	public void workingHours() {
		System.out.println(name+" works from 8 am till 8 pm");
	}
}
class Amazon extends Store {

	Amazon(String type, String name) {
		super(type, name);
	}
	public void workingHours() {
		System.out.println(name+" works online 24/7");
	}
	
}

public class DefinedClassesInMap {
	public static void main(String[] args) {
		LinkedList <Integer> llist=new LinkedList <>();
		  
		   int [] x=new int [10];
		     llist.add(x[0]=0);
		     llist.add(x[1]=1);
		   for (int i=2;i<=9;i++){
		     x[i]=x[i-1]+x[i-2];
		     llist.add(x[i]);
		   }
		  for (int a:llist) {
			  System.out.print(a);
			  System.out.print(" ");
		  }
		  
		Map <Integer,Store> stores=new LinkedHashMap<>();
		ArrayList <String> aaalist=new ArrayList<>();
		stores.put(1,new Amazon("Online","Amazon"));
		stores.put(2,new Nike("Walk-in","Nike"));
		stores.put(3,new Costco("Wholesale","Costco"));
		Collection <Store> st=stores.values();
		for (Store s:st) {
			s.workingHours();
			s.display();
		}
		
		Set <Entry<Integer,Store>> set=stores.entrySet();
		for (Entry <Integer,Store> s:set) {
			s.getValue().workingHours();
			s.getValue().display();
			System.out.println("_____");
		}
	}
	
}
