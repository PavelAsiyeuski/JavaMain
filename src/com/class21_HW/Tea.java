package com.class21_HW;

abstract class Tea{
	String teaType;
	  Tea (String teaType){
	    this.teaType=teaType;
	  }
	  abstract void addSugar();
	}
class Lemon extends Tea {
	  Lemon (String teaType){
		 super(teaType);
		 this.teaType=teaType;
	  }
	  void addSugar(){
	    System.out.println("For "+teaType+" we need 2 spoons of sugar");
	  }
	}

	  