package Alert_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions c=new ChromeOptions();
	c.addArguments("disable notification");
	WebDriver p=new ChromeDriver();
	p.get("https://www.google.co.in/");
	p.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("olx",Keys.ENTER);
	
	
}
}
