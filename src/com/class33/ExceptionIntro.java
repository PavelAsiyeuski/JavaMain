package com.class33;

public class ExceptionIntro {
	static String str;
public static void main(String[] args) {
	int a=10;
	int b=0;
	//System.out.println(a/b); //Arithmetic Exception
	System.out.println("End of the program");
	
	int [] array= {12,1,13};
	//syso(array[3]) // ArrayIndexOutOfBoundException
	
	//syso(str.length()) // NullPointerException
	
	NullPointerException npe=new NullPointerException();
	throw(npe);
}
}
