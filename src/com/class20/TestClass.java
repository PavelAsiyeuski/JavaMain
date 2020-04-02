package com.class20;

public class TestClass {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empNumber=12345;
		emp.salary=10000.00;
		emp.getPaid();
		Employee.company="ABC";
		Employee.work();
		System.out.println("_________________");
		ProductOwner po=new ProductOwner();
		po.empNumber=353424;
		po.salary=15567.00;
		ProductOwner.company="Syntax";
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Stand Up";
		po.attendMeetings();
		po.prioritizeBacklog();
		Car obj=new Car();
		
		Car2 obj2=new Car2();
	}
}
