package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver v=new ChromeDriver();
	v.get("https://www.google.co.in/");
	boolean isEnabled = v.findElement(By.xpath("(//input[@name='btnI'])[1]")).isEnabled();
	boolean isDisplayed = v.findElement(By.xpath("(//input[@name='btnK'])[1]")).isDisplayed();
	if(isEnabled) {
		System.out.println("Btn is enabled");
	}
	else {
		System.out.println("Btn is not enabled");
	}
	if(isDisplayed) {
		System.out.println("Btn is displayed");
	}
	else {
		System.out.println("btn is not displayed");
	}
}
}
