package com.class34;
class BalanceException extends RuntimeException{
	public BalanceException(String name) {
		super(name);
	}
}
public class ThrowKeyword {
public static void main(String[] args) {
	
	NullPointerException npe=new NullPointerException();
	//throw npe;
	//throwException();
	withdraw(100,1000);
 }

	public static void withdraw (int balance, int amount) {
		if (amount>balance) {
			throw new BalanceException("Your balance is too low");
		}
	}

	public static void throwException() {
		throw new ArithmeticException();
	}
}
