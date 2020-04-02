package com.class18;

public class Task02 {
	int gr1,gr2,gr3;
	String stu;
	void avg() {
		int gradeAvg=(gr1+gr2+gr3)/3;
		System.out.println("The student "+stu+" has an average grade of "+gradeAvg);
	}
		Task02(String student,int grade1, int grade2, int grade3){
	stu=student;
	gr1=grade1;
	gr2=grade2;
	gr3=grade3;


}
}
