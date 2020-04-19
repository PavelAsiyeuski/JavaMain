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
	    return result;
	  
	  }
	  public void display(double result) {
			System.out.println("Result ::: "+result);
		}
	
	public static void main(String[] args) {
		Main nn=new Main();
		double[] num= {nn.adding(100, 20), nn.subtracting(100, 20), nn.multiply(100, 20), nn.dividing(100, 20)};
		for(double result:num) {
			nn.display(result);
		}
	}
}