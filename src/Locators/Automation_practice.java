package Locators;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class Automation_practice {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	o.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhi");
	o.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Karle");
	WebElement male = o.findElement(By.xpath("(//input[@name='sex'])[1]"));
	male.click();
	System.out.println(male.isSelected());
	
	WebElement a = o.findElement(By.xpath("//img[@class='light-mode-item navbar-brand-item']"));
	File src = a.getScreenshotAs(OutputType.FILE);
	File desk=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\automation.jpg");
	Files.copy(src, desk);
	

}
}
