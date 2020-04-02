package com.class18;

public class Task03 {
public Task03(int a){
	System.out.println(a);
}
private Task03(int b,int c){
	System.out.println(b+""+c);
}
protected Task03(String name){
	System.out.println(name);
}
Task03(String word, int x){
	System.out.println(word+x);
}
public static void main(String[] args) {
	Task03 obj1=new Task03(10,20);
}
}
