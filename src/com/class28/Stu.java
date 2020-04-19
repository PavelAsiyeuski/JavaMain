package com.class28;

	public abstract class Stu {
		public String name;
		public int id;
		public Stu(String name,int id){
			this.name=name;
			this.id=id;
		}
		public abstract void display();
	}
	class Student1 extends Stu{
		
		public Student1(String name, int id){
			super(name, id);
		}
		public void display() {
		System.out.println("Student name is "+name+" and his ID is "+id);
	}
	}
	class Student2 extends Stu{
		public Student2(String name, int id) {
			super(name,id);
		}
		public void display() { 
		System.out.println("Student name is "+name+" and his ID is "+id);
	}
	}
	class Student3 extends Stu {
		public Student3(String name, int id) {
			super(name,id);
		}
		public void display() {
			System.out.println("Student name is "+name+" and his ID is "+id);
		}
	}


