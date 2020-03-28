package com.class17;

public class Task02 {
	String censor(String a, char b){
	    String result="";
	    result=a.replace(b, '*');
	    return result;
	  }
	  public static void main(String [] args){
	    Task02 obj=new Task02();
	    System.out.print(obj.censor("science",'e'));
	  }
	}