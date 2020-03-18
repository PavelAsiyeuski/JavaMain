package com.class04;
import java.util.Scanner;
public class Homework {
	 public static void main(String [] args){
		  Scanner scan= new Scanner (System.in);
		  System.out.println("Please enter your age");
		  int age=scan.nextInt();
		  System.out.println("Please enter your gender: M or F");
		  char gender=scan.next().charAt(0);
		  if (age>25) { 
		    if (gender=='F') {
		      System.out.println("Woman");
		    }else if (gender=='M') {
		        System.out.println("Man");
		      }
		    }
		    else {
		      if(gender=='F'){
		        System.out.println("Girl");}
		        else if (gender=='M'){
		          System.out.println("Boy");
		        }
		      }
		    }
		    
		  }
