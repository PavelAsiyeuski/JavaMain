package com.class11;

public class Task02 {
public static void main(String [] args) {
	String [][] con = {{"USA","Canada","Mexico"},
			{"Argentina","Brazil","Chile"},
			{"Belarus","France","Germany"},
			{"Japan","South Korea","India"},
			{"Nigeria","Syria","Madagaskar"}
	};
	for (int i=0; i<con.length;i++) {
		for (int j=0; j<con[i].length;j++) {
			System.out.print(con[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("_________________________");
	for (String[] cons:con) {
		for (String cc:cons) {
			System.out.print(cc+" ");
		}
		System.out.println();
	}
	int num=con.length;
	int num1=con[0].length;
	int sum=num1*num;
	System.out.println(sum);
}
}   
