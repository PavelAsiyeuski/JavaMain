package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW4 {
public static void main(String[] args) {
	ArrayList <Integer> nums=new ArrayList<>();
	for (int i=0; i<=50; i+=2) {
		nums.add(i);
	}
	Iterator <Integer> it=nums.iterator();
	while (it.hasNext()) {
		Integer a=it.next();
		if (a%5==0) {
			it.remove();
		}
	}
	System.out.println(nums);
}
}
