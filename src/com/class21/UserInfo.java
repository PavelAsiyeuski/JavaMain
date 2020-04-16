package com.class21;
	public class UserInfo extends Task01{
		String address;
		UserInfo(String address, String name, int mobNum){
			super(name, mobNum);
			this.address=address;
		}
		void user() {
			System.out.println(name+" "+mobNum+" "+address);
		}
	}


