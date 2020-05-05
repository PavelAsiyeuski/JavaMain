package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {
	public static void main(String[] args) {
		division (10,0);
		division (12,2);
		
		read("");
	}
	
	public static int division(int num,int num1) {
		int result=0;
		try {
			result=num/num1;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			ae.getMessage();
		}finally {
			System.out.println("I am finally block");
		}
		return result;
	}
	public static void read (String filePath) {
		FileInputStream fis=null;
		try {
		fis=new FileInputStream(filePath);
		Properties prop=new Properties ();
		prop.load(fis);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
