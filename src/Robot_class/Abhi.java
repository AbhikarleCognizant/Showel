package Robot_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhi {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver k=new ChromeDriver();
	//open the app
	k.get("https://www.amazon.com/");
	//create object of Robot class
	Robot r=new Robot();
	//keypress
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//key release
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	
	}
}