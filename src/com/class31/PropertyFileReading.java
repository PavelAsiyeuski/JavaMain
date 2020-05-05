package com.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertyFileReading {
public static void main(String[] args) throws IOException {
	//to read the properties file we need to have file
	//1. path to property
	String filePath="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\configs\\Example.properties";
	//2. bring object of fileinputstream
	FileInputStream fileInput=new FileInputStream(filePath);
	//to handle data from .properties file we need Property Class 
	Properties prop= new Properties();
	prop.load(fileInput);
	
	String name=prop.getProperty("name");
	System.out.println(name);
	String city=prop.getProperty("city");
	System.out.println(city);
	
	Set<Object>keys=prop.keySet();
	for (Object k:keys) {
		System.out.println(k);
	}
}
}
