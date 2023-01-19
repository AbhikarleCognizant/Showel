package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver n=new ChromeDriver();
	n.get("https://www.guvi.in/sign-in");
	//user name
	n.findElement(By.xpath("//input[@id='login_email']")).sendKeys("abhijeetkarle6@gmail.com");
	n.findElement(By.xpath("//input[@id='login_password']")).sendKeys("Abhi@123");
	n.findElement(By.xpath("//button[text()='Login']")).click();
	
	
}
}
