package com.class23;

public class WebDriver {
void open() {
	System.out.println("Opening browser");
}
}
class FirefoxDriver extends WebDriver{
	void open() {
		System.out.println("Opening firefox driver");
	}
}
class ChromeDriver extends WebDriver{
	void open() {
		System.out.println("Opening chrome browser");
	}
}
class InternetExplorerDriver extends WebDriver{
	void open() {
		System.out.println("Opening IE browser");
	}
}