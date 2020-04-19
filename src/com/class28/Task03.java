package com.class28;

import java.util.HashSet;
import java.util.Set;

import com.class04.NewClass;

public class Task03 {
public static void main(String[] args) {
	//Create a Set collection that will hold Objects of Student Type. 
	//In this set we do not care about the insertion order. 
	//Each student object should have name and studentID. Display name of each student.
	
	Set <Stu> student = new HashSet<>();
	student.add(new Student1("Pavel",1234));
	student.add(new Student2("Margarita",54321));
	student.add(new Student3("Luna",123100));
	for (Stu st:student) {
		st.display();
	}
	
}
}
