package com.class25;

public interface WebDriver {
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("You can open Chrome browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("You can close Chrome browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("You can maximize window in Chrome");
		
	}

	@Override
	public void findElement() {
		System.out.println("You can find elements in Chrome");
		
	}
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("You can open Firefox browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("You can close Firefox browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("You can maximize window in Firefox");
		
	}

	@Override
	public void findElement() {
		System.out.println("You can find elements in Firefox");
		
	}
}