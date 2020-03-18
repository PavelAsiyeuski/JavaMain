package com.class05;

import java.util.Scanner;

public class Homework {
	public static void main(String [] args) {
	  Scanner scan=new Scanner (System.in);
	  String mon="null";
	  System.out.println("Input a number between 1-12");
	  int a=scan.nextInt();
	  switch (a){
	    case 1:
	      mon="January";
	      break;
	      case 2:
	      mon="February";
	      break;
	      case 3:
	      mon="March";
	      break;
	      case 4:
	      mon="April";
	      break;
	      case 5:
	      mon="May";
	      break;
	      case 6:
	      mon="June";
	      break;
	      case 7:
	      mon="July";
	      break;
	      case 8:
	      mon="August";
	      
	      break;
	      case 9:
	      mon="September";
	      
	      break;
	      case 10:
	      mon="October";
	      
	      break;
	      case 11:
	      mon="November";
	      
	      break;
	      case 12:
	      mon="January";
	      break;
	      default:
	      mon="Invalid";
	  }
	  
	      System.out.println(mon);
	     
	  }
	}