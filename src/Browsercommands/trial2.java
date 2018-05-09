package Browsercommands;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class trial2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Geckodriver\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.google.com/");
	}

}
