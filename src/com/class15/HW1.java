package com.class15;

public class HW1 {
void newEmail(String name, String lastName, String email) {
	String newEmail=(name+lastName+"@"+email+".com").toLowerCase();
	System.out.println(newEmail);
}
public static void main(String[] args) {
	HW1 obj = new HW1();
	obj.newEmail("Pavel","Asiyeuski", "gmail");
}
}

