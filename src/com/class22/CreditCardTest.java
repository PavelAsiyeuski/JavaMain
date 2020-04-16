package com.class22;

public class CreditCardTest {
public static void main(String[] args) {
	CreditCard obj=new CreditCard();
	obj.balance=9000;
	obj.calc();
	Visa obj1=new Visa();
	obj1.balance=9500;
	obj.calc();
	AX obj2=new AX();
	obj2.balance=14500;
	obj2.calc();
}
}
