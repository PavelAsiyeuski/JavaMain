package com.class22;

public class CreditCard {
//Create a class CreditCard and define variable balance and interest. 
//Create an instance method that will calculate interest based on the given balance. 
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//Call the method by creating an object of each of the three classes.
	
	double balance, interest;
	void calc() {
		if (balance<10000) {
			interest=balance*0.2;
		}else {
			interest=0;
		}
		System.out.println("From your balance "+balance+" interest is going to be "+interest);
	}
}
class Visa extends CreditCard{
	
}
class AX extends CreditCard{
	void calc() {
		if (balance<15000) {
			interest=balance*0.2;
		}else {
			interest=0;
		}
		System.out.println("From your balance "+balance+" interest is going to be "+interest);
	}
}