package com.class15;

public class Recap {

	int empId;
	double salary;
	
	String name, lastName, title;
	
	void working() {
		System.out.println(title+" is working");
	}
	void getPaid() {
		System.out.println(name+" is getting paid "+salary);
	}
	void attendMeetings() {
		System.out.println(name+" attending meetings");
	}
	public static void main(String[] args) {
		Recap emp1=new Recap();
		emp1.empId=123;
		emp1.name="John";
		emp1.lastName="Smith";
		emp1.title="CEO";
		emp1.salary=200000;
		
		emp1.working();
		emp1.getPaid();
		emp1.attendMeetings();
		
		Recap emp2=new Recap();
		emp2.empId=124;
		emp2.name="Pavel";
		emp2.lastName="Asiyeuski";
		emp2.title="QA Engineer";
		emp2.salary=100000;
		emp2.working();
		emp2.getPaid();
		emp2.attendMeetings();
		
	}
}
