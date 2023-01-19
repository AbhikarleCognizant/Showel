package SCroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open the application
	driver.get("https://www.amazon.com/");
	//use javascript executor interface
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	//scroll down
	jse.executeScript("window.scrollBy(0,4000);");
	//scroll up
	Thread.sleep(5000);
	jse.executeScript("window.scrollBy(0,-2000);");
	
}
}
