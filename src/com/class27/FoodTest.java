package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {
public static void main(String[] args) {
	ArrayList <Food> alist=new ArrayList<>();
	alist.add(new Burger("Burger"));
	alist.add(new Fries("Fries"));
	alist.add(new CaesarSalad("Caesar Salad"));
	alist.add(new IceCream("Ice Cream"));
	
	for (Food f:alist) {
		f.taste();
		f.healthy();
		f.hasDairy();
		f.vegan();
	}
	System.out.println("_________________________");
	for (int i=0; i<alist.size(); i++) {
		alist.get(i).taste();
		alist.get(i).healthy();
		alist.get(i).hasDairy();
		alist.get(i).vegan();
	}
	System.out.println("_________________________");
	Iterator <Food> it=alist.iterator();
	while(it.hasNext()) {
		Food word=it.next();
		word.taste();
		word.healthy();
		word.hasDairy();
		word.vegan();
	}
}
}
