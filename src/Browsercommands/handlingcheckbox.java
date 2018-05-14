package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).isEnabled());   //true
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).isSelected());   //true
		 driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).isSelected()); //false
		 
	}

}
