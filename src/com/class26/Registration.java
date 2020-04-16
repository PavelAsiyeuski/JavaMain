package com.class26;

public class Registration {
//Create Registration Class in which you would have variables as email, userName 
//and password that have an access scope only within its own class. 
//After creating an object of the class user should be able to call methods
//and in each method separately pass values to set users email, username and password. 
//Requirements: Valid email consider to be only yahoo
//Valid userName and password cannot be empty and should be of length larger than 6 characters.
//Also valid password cannot contain userName.
	
	private String email;
	private String userName;
	private String password;
	
	public void setEmail(String email) {
		if (!email.isEmpty()) {
			if (email.contains("yahoo")) {
				this.email=email;
				System.out.println("Email done");
		}else {
			System.out.println("Email must be created on Yahoo.com");
		}
		}else {
			System.out.println("Emaill cannot be empty");
		}
	}
	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length()>6) {
				this.userName=userName;	
				System.out.println("User Name done");
			}else {
				System.out.println("User Name must be at least 6 characters long");
			}
		}else {
			System.out.println("User Name cannot be empty");
		}
		
	}
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length()>6) {
				if (!password.contains(userName)) {
					this.password=password;
					System.out.println("Password done");
				}else {
					System.out.println("Password cannot contain User Name");
				}
			}else {
				System.out.println("Password must have at least 6 characters");
			}
		}else {
			System.out.println("Password cannot be empty");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
}
