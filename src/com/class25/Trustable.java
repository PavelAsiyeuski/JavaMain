package com.class25;

public interface Trustable {
void trust();
}
interface Bank extends Trustable{
	void deposit();
	void withdraw();
}
class BOA extends Finance implements Bank, CreditUnion{

	public void trust() {
		System.out.println("BOA is trustable");
	}
	public void deposit() {
		System.out.println("You can make deposit in BOA");
	}
	public void withdraw() {
		System.out.println("You can withdraw your money with BOA");
	}
	public void giveCredit() {
		System.out.println("BOA can give you a credit");
	}	
}
interface CreditUnion{
	void giveCredit();
	}
class Finance {
	void financing(){
		System.out.println("Dealing with financing");
	}
}
