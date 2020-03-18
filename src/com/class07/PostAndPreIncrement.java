package com.class07;

public class PostAndPreIncrement {
public static void main(String[] args) {
	// ++ --
	// preincrement ++y , postincrement y++
	
	int y=10;
	y=y++;
	System.out.println(y);
	
	int x=10;
	x=++x;
	System.out.println(x);
}
}
