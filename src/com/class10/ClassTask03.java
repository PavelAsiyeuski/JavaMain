package com.class10;

public class ClassTask03 {
public static void main(String [] args) {
	String [] a= {"Belarus", "Russia", "Ukraine", "USA", "Lithuania"};
	String [] b= {"Minsk", "Moscow", "Kiev", "Washington DC", "Vilnius"};
	for (int i=0; i<a.length; i++) {
		System.out.println("The capital of "+a[i]+" is "+b[i]);
		}
	for (String x:a) {
		for (String y:b) {
		System.out.println(x+y);
		
		}
	}
	}
}
