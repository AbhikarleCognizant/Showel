package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("https://www.google.com/");
	//choose the terget element
	WebElement target = p.findElement(By.xpath("//a[text()='Gmail']"));
	//create object of action class
	Actions act=new Actions(p);
	//all method in single step using build method and perform method
	act.moveToElement(target).contextClick().doubleClick().perform();
}
}
