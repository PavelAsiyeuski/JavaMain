package com.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Task {
public static void main(String[] args) throws IOException {
	String filePath="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\configs\\Task.properties";
	//2. bring object of fileinputstream
	FileInputStream file=new FileInputStream(filePath);
	Properties prop=new Properties();
	prop.load(file);
	Collection <Object> col= prop.values();
	for (Object c:col) {
		System.out.println(c);
	}
	prop.setProperty("Utility", "Java");
	FileOutputStream fi=new FileOutputStream(filePath);
	prop.store(fi, "Added utility");
	
	
	
	
}
}
