package com.class19;

public class ThisKeyword {

	int a, b;
	
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
	}
	ThisKeyword(){
		
	}
	public void sum (int a, int b) {
		System.out.println("Sum of local variables ="+a+b);
		System.out.println("Sum of instance variables ="+(this.a+this.b));
	}
	
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(10,20);
		obj.sum(100,200);
		
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(20,40); 
	}
}
