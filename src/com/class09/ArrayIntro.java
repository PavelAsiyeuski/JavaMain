package com.class09;

public class ArrayIntro {
public static void main(String [] args) {
	int num=10;
	
	int num1;
	num1=10;
	
	//declare an array and initialize it 
	
	int[] array=new int[4]; 
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	System.out.println(array[1]);
	
	//2nd way
	
	String [] carArray;
	carArray=new String[3];
	carArray[0]="BMW";
	carArray[1]="Honda";
	carArray[2]="Toyota";
	//i am driving toyota
	System.out.println("I am driving "+carArray[2]);
  }
}
