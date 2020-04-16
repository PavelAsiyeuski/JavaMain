package com.class21_HW;

public class Parent {
Parent(String city){
	System.out.println(city);
}
Parent(){
	
}
}
class Child extends Parent{
	Child(String city){
		super(city);
	}
}