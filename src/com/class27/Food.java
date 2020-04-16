package com.class27;

abstract public class Food {
	String foodName;
	Food (String foodName){
		this.foodName=foodName;
	}
	abstract void taste();
	abstract void healthy();
	abstract void hasDairy();
	abstract void vegan();
}
class Burger extends Food {
	Burger(String foodName){
		super(foodName);
	}
	void taste() {
		System.out.println(foodName+" tastes delicious");
	}
	@Override
	void healthy() {
		System.out.println(foodName+" is not healthy");
		
	}
	@Override
	void hasDairy() {
		System.out.println(foodName+" does not contain dairy");
		
	}
	@Override
	void vegan() {
		System.out.println(foodName+" is not vegan");
		
	}
}
class Fries extends Food {

	Fries(String foodName) {
		super(foodName);
	}
	void taste() {
		System.out.println(foodName+" tastes great");
	}
	void healthy() {
		System.out.println(foodName+" is not healthy");
	}
	void hasDairy() {
		System.out.println(foodName+" does not contain dairy");
	}
	void vegan() {
		System.out.println(foodName+" is vegan");
	}	
	}
class CaesarSalad extends Food {
	CaesarSalad(String foodName) {
		super(foodName);
	}
	void taste() {
		System.out.println(foodName+" tastes well");
	}
	void healthy() {
		System.out.println(foodName+" is healthy");
	}
	void hasDairy() {
		System.out.println(foodName+" has dairy");
	}
	void vegan() {
		System.out.println(foodName+" is vegan");	
	}
}
class IceCream extends Food{

	IceCream(String foodName) {
		super(foodName);
	}
	void taste() {
		System.out.println(foodName+" tastes very sweet");
	}
	void healthy() {
		System.out.println(foodName+" is not healthy at all");
	}
	void hasDairy() {
		System.out.println(foodName+" does have dairy");
	}
	void vegan() {
		System.out.println(foodName+" is not vegan");
		
	}
	
}