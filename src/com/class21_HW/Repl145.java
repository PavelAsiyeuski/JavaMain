package com.class21_HW;

public class Repl145 {
	static int[][] arr1=new int[3][3];
static void sum2D (int[][] arr) {
	int sum=0;
	for (int i=0; i<arr.length;i++) {
		for (int j=0; j<arr[i].length; j++) {
			sum=sum+arr[i][j];
		}
	}
	System.out.println(sum);
}
}
