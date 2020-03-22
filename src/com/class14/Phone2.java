package com.class14;

public class Phone2 {
public static void main(String[] args) {
	Phone phone1= new Phone();
	phone1.OS="IOS";
	phone1.make="IPhone";
	phone1.model="XS Max";
	phone1.color="Black";
	phone1.year=2019;
	phone1.run();
	phone1.ring();
	phone1.vibration();
	System.out.println("_______________________");
	Phone phone2=new Phone();
	phone2.OS="Android";
	phone2.make="Samsung";
	phone2.model="S4";
	phone2.color="White";
	phone2.year=2017;
	phone2.run();
	phone2.ring();
	phone2.vibration();
	System.out.println("________________________");
	Phone phone3=new Phone();
	phone3.OS="N/A";
	phone3.make="Nokia";
	phone3.model="3310";
	phone3.color="Blue";
	phone3.year=2002;
	phone3.run();
	phone3.ring();
	phone3.vibration();
}
}
