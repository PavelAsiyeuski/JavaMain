package com.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReading {
public static void main(String[] args) throws FileNotFoundException {
	String filePath="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\configs\\Task.properties";
	//2. bring object of fileinputstream
	FileInputStream fileInput=new FileInputStream(filePath);
	System.out.println(filePath);
	String username=System.getProperty("user.name");
	System.out.println(username);
	String os=System.getProperty("os.name");
	System.out.println(os);
	 
}
}
