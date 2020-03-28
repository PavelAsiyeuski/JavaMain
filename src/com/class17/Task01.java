package com.class17;

public class Task01 {
//Create a method that will accept an array as
	//parameters and will return a sum of all 
	//elements from that array. Method should 
	//be visibly only within same package and 
	//accessible by the creating an instance of the class.
	int sum;
	private int array(int[]nums) {
		for (int i=0; i<nums.length; i++) {
			sum=sum+nums[i];
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Task01 obj=new Task01();
		int [] nums= {3,12,52,14};
		System.out.println(obj.array(nums));
	}
}
