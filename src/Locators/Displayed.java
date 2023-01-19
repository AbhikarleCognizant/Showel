package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.javatpoint.com/selenium-tutorial");
	Thread.sleep(4000);
	List<WebElement> links = d.findElements(By.tagName("a"));
	System.out.println(links);
	d.getPageSource();
	boolean isDisplayed = d.findElement(By.xpath("//a[@class='next']")).isDisplayed();
	if(isDisplayed) {
		System.out.println("btn is Displayed");
	}
	else {
		System.out.println("btn is not Displayed");
	}
	
}
}
