package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplilearn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\abhij\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.navigate().to("https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2F");
	p.findElement(By.xpath("//input[@name='user_login']")).sendKeys("abhijeetkarle6@gmail.com");
	p.findElement(By.xpath("//input[@name='user_pwd']")).sendKeys("Abhi@123");
	p.findElement(By.xpath("//input[@name='btn_login']")).click();
	p.findElement(By.xpath("//input[@name='user_login'")).sendKeys(Keys.F5);
	
}
}
