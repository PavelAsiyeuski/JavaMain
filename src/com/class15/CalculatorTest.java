package com.class15;

public class CalculatorTest {
public static void main(String[] args) {
	Calculator calc=new Calculator();
	calc.add(100, 200);
	calc.sub(1000,300);
	
	calc.add(1000, 2000);
	calc.sub(10, 3);
	
	calc.mult(20,10);
	calc.div(20.99, 10.99);
}
}
