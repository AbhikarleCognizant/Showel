package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://demoqa.com/automation-practice-form");
	o.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abhi");
	o.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Karle");
	o.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("abhihet12@gmail.com");
	WebElement radio = o.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
	radio.click();
	System.out.println(radio.isSelected());
	System.out.println(radio.isDisplayed());
	o.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7028502545");
	o.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
	
}
}
