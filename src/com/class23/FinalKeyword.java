package com.class23;

public class FinalKeyword {
public static String str="Hello";
public final String str1="Bye";

public static final String APPLICATION_URL="syntax.com";

final char GRADE='A';

public static void main(String []args) {
	str="Hi";
	//str1="GoodBye" ==> CE 
}
public final void hello() {
	System.out.println("I am final method");
}
public final void hello(String name) {
	System.out.println("Hello "+name);
}
}
class SubClass extends FinalKeyword{
	// public void hello(){ ===> CE: cannot override final method
public void hello(int num) {
	System.out.println("hello of child class");
}
}
