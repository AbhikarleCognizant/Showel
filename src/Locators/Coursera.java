package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursera {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver b =new ChromeDriver();
	b.get("https://in.coursera.org/?authMode=login");
	//enter username
	b.findElement(By.xpath("//input[@name='email']")).sendKeys("abhijeetkarle6@gmail.com");
	//enter passward
	b.findElement(By.xpath("//input[@name='password']")).sendKeys("Abhi@123");
	b.findElement(By.xpath("//button[text()='Login']")).click();
	String expT = "Coursera | Degrees, Certificates, & Free Online Courses";
	String actT = b.getTitle();
	System.out.println(actT);
	if(expT.equals(actT)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
	
	
}
}
