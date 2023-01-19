package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceform {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.nopcommerce.com/en/register");
	Thread.sleep(4000);
	d.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abhi");
	d.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Karle");
	Thread.sleep(4000);
	d.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhijeetkarle6@gmail.com");
	d.findElement(By.xpath("//input[@id='ConfirmEmail']")).sendKeys("abhijeetkarle6@gmail.com");
	d.findElement(By.xpath("//input[@id='Username']")).sendKeys("Abhijeet");
	Thread.sleep(4000);
	JavascriptExecutor j=(JavascriptExecutor)d;
	j.executeScript("window.scrollBy(0,3000);");
	WebElement cong = d.findElement(By.xpath("//select[@id='CountryId']"));
	Select s=new Select(cong);
	s.selectByValue("286");
	Thread.sleep(3000);
	WebElement time = d.findElement(By.xpath("//select[@id='TimeZoneId']"));
	Select t=new Select(time);
	t.selectByValue("Alaskan Standard Time");
	Thread.sleep(3000);
	d.findElement(By.xpath("//input[@id='Password']")).sendKeys("Abhi@123");
	d.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Abhi@123");
	d.manage().window().fullscreen();
	Dimension m=new Dimension(200,400);
	d.manage().window().setSize(m);
	Thread.sleep(5000);
	Point p=new Point(80, 90);
	d.manage().window().setPosition(p);
	
	
	
}
}
