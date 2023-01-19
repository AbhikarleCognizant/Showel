package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_selenium_nopcommerce {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver c=new ChromeDriver();
	c.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
	c.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abhi");
	c.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Karle");
	c.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhijeetkarle6@gmail.com");
	c.findElement(By.xpath("//input[@id='ConfirmEmail']")).sendKeys("abhijeetkarle6@gmail.com");
	c.findElement(By.xpath("//input[@id='Username']")).sendKeys("abhi123");
	WebElement country = c.findElement(By.xpath("//select[@id='CountryId']"));
	Select s=new Select(country);
	s.selectByValue("239");
	WebElement Timezone = c.findElement(By.xpath("//select[@id='TimeZoneId']"));
	Select p=new Select(Timezone);
	p.selectByValue("Marquesas Standard Time");
	c.findElement(By.xpath("//input[@id='Password']")).sendKeys("Abhi_123");
	c.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Abhi_123");
	WebElement MYcompany = c.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
	Select b=new Select(MYcompany);
	b.selectByValue("5");
}
}
