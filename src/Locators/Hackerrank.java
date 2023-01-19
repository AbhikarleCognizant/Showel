package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hackerrank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://www.hackerrank.com/auth/login");
	//enter user name
	h.findElement(By.xpath("//input[@name='username']")).sendKeys("abhijeetkarle6@gmail.com");
	//enter pwd
	h.findElement(By.xpath("//input[@name='password']")).sendKeys("Abhi@321");
	//click on login button
	h.findElement(By.xpath("//span[text()='Log In']")).click();
	String exptT = "HackerRank";
	String actT = h.getTitle();
	System.out.println(actT);
	if(exptT.equals(actT)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
}
}
