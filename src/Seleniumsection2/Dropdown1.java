package Seleniumsection2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver t=new ChromeDriver();
	t.get("https://demo.nopcommerce.com/register");
	t.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abhi");
	t.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Karle");
	 WebElement day = t.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
	Thread.sleep(4000);
	Select s=new Select(day);
	s.selectByValue("16");
	Thread.sleep(2000);
	WebElement month = t.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
	Thread.sleep(3000);
	Select p=new Select(month);
	p.selectByVisibleText("April");
	Thread.sleep(4000);
	WebElement year = t.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
	Select k=new Select(year);
	k.selectByVisibleText("1999");
	Thread.sleep(2000);
	t.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhijeetkarle6@gmail.com");
	t.findElement(By.xpath("//input[@id='Password']")).sendKeys("Abhi@321");
	JavascriptExecutor j=(JavascriptExecutor)t;
	Thread.sleep(3000);
	j.executeScript("window.scrollBy(0,4000);");
	Thread.sleep(3000);
	j.executeScript("window.scrollBy(0,-2000);");
	
}
}
