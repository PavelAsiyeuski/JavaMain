package com.class26_HW;

public class Main implements Functions{
	  
	  public double adding (double firstNumber, double secondNumber){
	    double result;
	    result=firstNumber+secondNumber;
	    return result;
	  }
	  public double subtracting (double firstNumber, double secondNumber){
	    double result;
	    result=firstNumber-secondNumber;
	    return result;
	  }
	  public double multiply (double firstNumber, double secondNumber){
	    double result;
	    result=firstNumber*secondNumber;
	    return result;
	  }
	  public double dividing (double firstNumber, double secondNumber){
	    double result;
	    result=firstNumber/secondNumber;
	    
	    
	  }

	public void display(double result) {
		System.out.println("Result ::: "+result);
		
	}
	
	
	}