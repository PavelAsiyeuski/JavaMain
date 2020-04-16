package com.class24;

public class Parent {

	Parent(){
	System.out.println("aaa");
}
void met() {}
}
class Child extends Parent {
	Child (String a){
		System.out.println("bbb");
	}
	super.met();
}
