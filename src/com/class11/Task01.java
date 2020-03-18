
package com.class11;

public class Task01 {
public static void main(String [] args) {
	String [] cars= {"American","German","Korean","Italian"};
	for (int i=0; i<cars.length; i++) {
		System.out.println(cars[i]);
	}
	for (String car:cars) {
		System.out.println(car);
	}
}
}
