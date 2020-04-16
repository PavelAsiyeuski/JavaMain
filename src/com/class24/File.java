package com.class24;

public abstract class File {
//Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. 
	//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation 
	//of open behaviour: Example: to open .java file we need notepad++ 
	//or sublime text, to open .doc file we need Microsoft word to be installed etc
	String color;
	File(String color){
		System.out.println("");
	}
	
	abstract void open();
	void edit() {
		}
	void close() {
		}
}
class JavaFile extends File{
	JavaFile(String color){
		super(color);
		System.out.println("");
	}
	@Override
	void open() {
		System.out.println("To open Java File we need notepad++");
	}
}
class WordFile extends File{

	WordFile(String color) {
		super(color);
		
	}

	@Override
	void open() {
		System.out.println("To open Word File we need Microsoft Office");
	}
}
class PDFFile extends File{

	PDFFile(String color) {
		super(color);
		
	}

	@Override
	void open() {
		System.out.println("To open PDF File we need Adobe Acrobat");
	}
}
