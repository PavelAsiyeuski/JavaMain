package com.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {
public static void main(String[] args) {
	String file="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\configs\\Example.properties";
	try {
		FileInputStream fis=new FileInputStream(file);
		fis.close();
		Properties prop=new Properties();
		prop.load(fis);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("End of the program");
}
}
