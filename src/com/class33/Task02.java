package com.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
	static List <Exception> list=new LinkedList<>();
	public static List<Exception> listMethod (){
		
		
		try {
			int a;
			Scanner scan=new Scanner (System.in);
			System.out.println("Enter something");
			a=scan.nextInt();
		}catch(InputMismatchException ie) {
			
			list.add(ie);
		}
		
	

	try {
		int x=10;
		int y=0;
		System.out.println(x/y);
	}catch (ArithmeticException ae) {
		
		list.add(ae);
	}
	
	try {
		String fPath="";
		FileInputStream fis=new FileInputStream(fPath);
	}catch(FileNotFoundException fne) {
		
		list.add(fne);
	}
	try {
		int [] r= {12,1,5};
		System.out.println(r[12]);
	}catch(ArrayIndexOutOfBoundsException arre){
		list.add(arre);
	}
	return list;
}

	
public static void main(String[] args) {
	//Create a static method that will return a List of Exceptions.
	//Inside your method create objects of 4 exception classes using try 
	//and catch blocks and store them inside your list.
	//Call your method inside main and print name and details of all Exception objects.
	
	listMethod();
	Iterator <Exception> it=list.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
