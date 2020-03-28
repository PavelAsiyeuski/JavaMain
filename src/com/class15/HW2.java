package com.class15;

public class HW2 {
boolean isPrime(int a) {
	boolean isPrime = true;
	if(a>1) {
		for (int i=2; i<a; i++) {
			if (a%i==0) {
				isPrime=false;
				break;
			}else {
				isPrime=true;
			}
		}
		
	}else {
		isPrime=false;
	}
	System.out.println(isPrime);
	return isPrime;
	
}
public static void main(String[] args) {
	HW2 obj=new HW2();
	obj.isPrime(10);
	
}
}
