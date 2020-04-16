package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
public static void main(String[] args) {
	Flower [] array={new Tullip("tullip"), new Rose("Rose"), new Sunflower("Sunflower")};
	
	ArrayList <Flower>flowers=new ArrayList<>();
	flowers.add(new Rose("Rose"));
	flowers.add(new Tullip("Tullip"));
	flowers.add(new Sunflower("Sunflower"));
	
	for (Flower fl:flowers) {
		fl.bloom();
	}
	for (int i=0; i<flowers.size();i++) {
		flowers.get(i).bloom();
	}
	Iterator <Flower> it=flowers.iterator();
	while (it.hasNext()) {
		Flower word=it.next();
		word.bloom();	
	}


	//hw - call available methods using for loop, adv for ,iterator
	//hw- create food class that will have 3 undefined methods and 4 subclasses
	//then create collection of food and using 3 diff ways print it out
}
}
