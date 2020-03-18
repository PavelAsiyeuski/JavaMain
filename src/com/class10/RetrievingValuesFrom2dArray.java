package com.class10;

public class RetrievingValuesFrom2dArray {
public static void main(String[] args) {

	String month[][]= {{"January","February","December"},
			{"March","April","May"},
			{"June","July","August"},
			{"September","October","November"}};
	int rows=month.length;//how many arrays
	int firstArray=month[0].length;
	System.out.println(firstArray);
	//HOW TO PRINT ALL ARRAYS
	for (int i=0; i<month.length; i++) {
		for (int j=0; j<month[i].length; j++) {
			System.out.println(month[i][j]);
		}
	}
			}
}
