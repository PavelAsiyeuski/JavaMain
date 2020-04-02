package com.class20;

public class HW {
	static int maxValue(int arr[]){
	    int size=arr.length;
	    int num=0;
	    for (int i=1; i<size; i++){
	      if (arr[i]>arr[i-1]){
	        num=arr[i];
	      }
	    }
	    return num;
	  }
		public static void main(String[] args) {
			int[] arr = {5,12,-3,7,3,22};
			System.out.println(maxValue(arr)); //should print 22
		}
		
		
	}
