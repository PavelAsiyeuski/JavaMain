package com.class07;

public class ForLoop {
public static void main(String[] args) {
/*we want to create multiplication table 
 * 1x1=1
 * 1x2=2
 * 1x3=3
 */
	int num=4;
	for (int i=1; i<=100; i++) {
		System.out.println(num+"*"+i+"="+num*i);
	}
}
}