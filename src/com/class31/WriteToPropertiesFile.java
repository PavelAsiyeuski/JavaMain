package com.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
public static void main(String[] args) throws IOException {
	String filePath="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\configs\\Example.properties";

	FileInputStream fis=new FileInputStream(filePath);
	Properties prop=new Properties();
	prop.load(fis);
	
	prop.setProperty("phoneNumber", "1234567890");
	
	FileOutputStream fos=new FileOutputStream(filePath);
	prop.store(fos, "Added additional key");
	
}
}
