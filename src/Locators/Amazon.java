package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abhij\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver k=new ChromeDriver();
	k.navigate().to("https://www.amazon.in/");
	Thread.sleep(4000);
	k.manage().window().minimize();
	k.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("men jacket");
	Thread.sleep(4000);
	k.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(4000);
	//click on All drop box
	WebElement All = k.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s=new Select(All);
	Thread.sleep(4000);
	s.selectByVisibleText("Shoes & Handbags");
	
}
}
