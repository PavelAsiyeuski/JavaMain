package com.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl205 {
	public static void main(String[]args){
		  List <Map<String,Object>> dataList = new LinkedList<>();
		  Map <String,Object> apple= new LinkedHashMap<>();
		  apple.put("Items","Apple");
		  apple.put("Price",20.0);
		  apple.put("Quantity",10);
		  dataList.add(apple);
		  Map <String,Object> orange= new LinkedHashMap<>();
		  orange.put("Items","Orange");
		  orange.put("Price",21.99);
		  orange.put("Quantity",10);
		  dataList.add(orange);	 
		  double total=0;
		  for (Map<String, Object> m : dataList) {
			  Set <String> set=m.keySet();
			  double price = (Double) m.get("Price");
			  double quantity = (Integer) m.get("Quantity");
			  m.put("Price",price);
			  m.put("Quantity",quantity);
			  Set <Entry <String,Object>> entry=m.entrySet();
			  Iterator <Entry<String,Object>> it=entry.iterator();
			  while (it.hasNext()) {
				  Entry<String,Object> ent=it.next();
				  System.out.print(ent.getKey()+": "+ent.getValue()+" ");
				
			  }
			  System.out.print("SubTotal: "+price*quantity);
			  System.out.println("");
			  total=total+(price*quantity);
		  }

		System.out.println("Your purchase total : "+total);
	}
}
