package com.class23;

public class ComputerTest {
public static void main(String[] args) {
	
	Computer [] arr= {new Apple("MacBook"),new Lenovo("Lenovo"),new HP("HP"),new Dell("Dell")};
	for (Computer c:arr) {
		c.keyboard();
		c.OS();
		c.work();
		System.out.println("__________________");
	}
	
}
}
