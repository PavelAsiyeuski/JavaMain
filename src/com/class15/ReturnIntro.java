package com.class15;

public class ReturnIntro {
	public static void main(String[] args) {
ReturnIntro newObject= new ReturnIntro();
int num=newObject.largest(12,13);
	}
	int largest (int a, int b) {
	int largest;
	if(a>b) {
		largest=a;
	}else {
		largest=b;
	}
	return largest;
}
}
