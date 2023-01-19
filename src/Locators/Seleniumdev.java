package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdev {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver n =new ChromeDriver();
	n.get("https://www.selenium.dev/documentation/");
	n.findElement(By.linkText("WebDriver")).click();
	
}
}
