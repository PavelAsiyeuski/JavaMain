package com.class23;

public class FinalExamples {
final String str="I love Java";
final void saySmth(String str) {
	System.out.println(str);
}
public static void main(String [] args) {
	FinalExamples obj=new FinalExamples();
	obj.saySmth("Java is my love");   
	
}
}
