import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet <String> breakfast=new HashSet<>();
	breakfast.add("Bagel");
	breakfast.add("Bread");
	breakfast.add("Coffee");
	breakfast.add("Peanut butter");
	breakfast.add("Oatmeal");
	breakfast.add("Eggs");
	breakfast.add("Eggs");
	
	System.out.println(breakfast.size());
	//it will print in wrong order
	System.out.println(breakfast);
	//hashset does not have particular order
	
	
}
}
