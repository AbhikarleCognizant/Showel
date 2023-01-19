package Locators;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nopcommerce {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://demo.nopcommerce.com/register");
	o.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abhi");
	o.findElement(By.xpath("//input[@id='FirstName']")).clear();
	o.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Karle");
	WebElement day = o.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
	Select s=new Select(day);
	s.selectByValue("4");
	Thread.sleep(4000);
	WebElement month = o.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
	Select b=new Select(month);
	b.selectByValue("4");
	Thread.sleep(3000);
	WebElement year = o.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
	Select n=new Select(year);
	n.selectByVisibleText("1916");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PRINTSCREEN);
	r.keyRelease(KeyEvent.VK_PRINTSCREEN);
	
	o.manage().window().maximize();
	Thread.sleep(4000);
	o.manage().window().minimize();
	o.navigate().refresh();
	String expected = "nopCommerce demo store. Register";
	String actual = o.getTitle();
	System.out.println(actual);
	if(expected.equals(expected)) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is failed");
	}
}
}
