package com.class28;

import java.util.*;


public class SetFamily {
public static void main(String[] args) {
	Set <String> veggies = new TreeSet<>();
	veggies.add("carrot");
	veggies.add("tomato");
	veggies.add("cucumber");
	veggies.add("potato");
	veggies.add("avocado");
	System.out.println(veggies);
	
	
	Set <String> fruits=new LinkedHashSet<>();
	fruits.add("orange"); //removes duplicates
	fruits.add("orange");
	fruits.add("pineapple");
	fruits.add("apple");
	System.out.println(fruits);
	fruits.addAll(veggies);
	System.out.println(fruits);
}
}
