package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
public static void main(String[] args) {
	ArrayList <String> words=new ArrayList<>();
	words.add("Hello");
	words.add("Bye");
	words.add("Mood");
	words.add("Syntax");
	words.add("Technologies");
	
	
	Iterator <String> it=words.iterator();
	while (it.hasNext()) {
		String word=it.next();
		if(word.endsWith("e")){
			it.remove();
		}
		System.out.println(words);
	}
	
}
}
