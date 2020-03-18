package com.class10;

public class RetrieveElements {
public static void main(String[] args) {
	char [] grades= {'A', 'B', 'C', 'D','E','F'};
	// getting all elements
	for (int i=0; i<grades.length; i++) {
		System.out.println(grades[i]);
	}
	//printing using advanced for loop
	
  for(char grade:grades) {
	  System.out.println(grade);
  }
  String [] fruits = {"Banana", "Orange", "Apple", "Mango"};
  for (String fruit:fruits) {
	  if (fruit.equals("Apple")) {
		  System.out.println(fruit+" is my favorite fruit");
	  }else {
  System.out.println(fruit);
	  }
  }
}
}
