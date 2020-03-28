package com.class18;

public class ConstructorIntro {

	ConstructorIntro(){
		System.out.println("I am a constructor");
	}
	ConstructorIntro(String i){
		System.out.println("I am a constructor with 1 string parameter "+i);
	}
	ConstructorIntro(int num){
		System.out.println("I am a constructor with 1 integer value "+num);
	}
	//to create a constructor 
	//1.name must be the same as class name 
	//2.no return type 
	
	public static void main(String[] args) {
	ConstructorIntro obj = new ConstructorIntro("POPA-+");
	System.out.println("Code after constructor");
	obj.hello();
}
	void hello() {
		System.out.println("Hello Class");
	}
}
