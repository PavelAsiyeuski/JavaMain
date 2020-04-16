package com.class26;

public class HW {
	public final static double avgElements(int[] a){
	    double num1=0;
	    for (int i=0; i<a.length; i++){
	      num1=num1+a[i];
	    }
	    num1=num1/a.length;
	    return num1;
	  }
	private String a;
}
class A extends HW {
	super.a="Jopa";
}
	  
	  
		public static void main(String[] args) {
			HW obj=new HW();
			int[] a = {2,7,3,8,4};
			System.out.println(avgElements(a)); 
		}
	}