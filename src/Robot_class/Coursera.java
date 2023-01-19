package Robot_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursera {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("https://in.coursera.org/");
    Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	
}
}
