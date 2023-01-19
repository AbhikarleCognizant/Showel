package Robot_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver g=new ChromeDriver();
	//open the url
	g.get("https://www.flipkart.com/");
	g.findElement(By.partialLinkText("Cancellation & Returns")).click();
	//create object of class
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	//key press
	r.keyPress(KeyEvent.VK_PAGE_UP);
	//key release
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	
}
}
