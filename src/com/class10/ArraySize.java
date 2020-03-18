package com.class10;

public class ArraySize {

	public static void main(String[] args) {
		String [] cities = {"Washington DC", "New York", "Paris", "Miami", "Los Angeles", "Dallas", "Minsk"};
		int x=1;
		System.out.println(cities[x]);
		x+=2;
		System.out.println("I moved to "+cities[x]);
		
		//how many elements stored inside of an array?
		int arraySize=cities.length;
		System.out.println("Total elements is "+arraySize);
		
		//how do we access last element from an array?
		System.out.println(cities[arraySize-1]);
		
		//access all elements from an array
		//cities[0]; cities[1]; cities[2] etc.
		for (int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}
	}

}
