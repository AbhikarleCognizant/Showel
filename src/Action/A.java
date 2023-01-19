package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.google.com/");
	//choose the target element
	WebElement target = o.findElement(By.xpath("//a[text()='Gmail']"));
	//create object of Actions class
	Actions act=new Actions(o);
	//use move to element method
/*	act.moveToElement(target).perform();
	//right click on target element
	act.contextClick(target).perform();
	//left click(click)  */
	act.click(target).perform();
	
}
}
