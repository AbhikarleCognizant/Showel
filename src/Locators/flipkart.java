package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhij\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	WebDriver j=new FirefoxDriver();
	j.get("https://www.flipkart.com/");
	//enter user name
	j.manage().window().fullscreen();
	j.findElement(By.xpath("//input[@name='q']")).sendKeys("Tshirt under 400 rs");
	j.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	
	
}
}
