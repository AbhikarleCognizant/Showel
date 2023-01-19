package Seleniumsection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver g=new ChromeDriver();
	g.get("https://www.facebook.com/");
	//click on create new acccount btn
	Thread.sleep(4000);
	g.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//select Day listbox
	Thread.sleep(4000);
	WebElement day = g.findElement(By.xpath("//select[@id='day']"));
	//create object of select class
	Select s=new Select(day);
	Thread.sleep(4000);
	//use select class methods
	s.selectByValue("16");
	//select month listbox
	WebElement month = g.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(4000);
	Select b=new Select(month);
	b.selectByVisibleText("Apr");
	Thread.sleep(4000);
	WebElement year = g.findElement(By.xpath("//select[@id='year']"));
	Select c=new Select(year);
	Thread.sleep(4000);
	c.selectByValue("1999");
	
}
}
