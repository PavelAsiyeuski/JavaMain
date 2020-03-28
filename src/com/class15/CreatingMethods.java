package com.class15;

public class CreatingMethods {
//we want to create a method that will accept marks(90,80 etc.) 
//based on marks it will return grade(a,b,c,etc.)
//>90 - a ; >80 - b ; >70 - c ; 
	char grade(int a) {
		char grade;
		if (a>90 && a<=100) {
			grade='A';
		}else if (a>80 && a<=90) {
			grade='B';
		}else if (a>70 && a<=80) {
			grade='C';
		}else if (a>60 && a<=70) {
			grade='D';
		}else if (a>50 && a<=60) {
			grade='E';
		}else if (a>40 && a<=50) {
			grade='F';
		}else if (a>30 && a<=40) {
			grade='G';
		}else if (a>20 && a<=30) {
			grade='H';
		}else {
			grade='I';
		}
		System.out.println(grade);
		return grade;
		
	}
	public static void main(String[] args) {
		CreatingMethods obj = new CreatingMethods();
		int num=obj.grade(67);
		
	}
}
