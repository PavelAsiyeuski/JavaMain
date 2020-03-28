package com.class16;

class Main {
	  
	  void whatCar(String carColor, int carYear, String carMake) {
		  System.out.println("Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
	  }
	  public static void main(String[] args) {
	    Main obj=new Main();
	    obj.whatCar("Black",2019,"BMW");
	    
	    
	    Main obj1=new Main();
	    obj1.whatCar("White",2018,"Toyota");
	  }
	}