package com.class24;

public abstract class Phone {
    //implemented methods
	public void call() {
		System.out.println("Phone can make call");
	}
	
	public void text() {
		System.out.println("Phone can send texts");
	}
	//unimplemented methods
	public abstract void takePicture();
	public abstract void playMusic();
	
}
class iPhone extends Phone {
	public void takePicture() {
		System.out.println("iPhone takes pictures");
	}
	public void playMusic() {
		System.out.println("iPhone plays music using Apple Store");
	}
}
