package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_driver_maximize {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhij\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	WebDriver g =new FirefoxDriver();
	g.get("https://www.facebook.com/");
	g.manage().window().maximize();
	Thread.sleep(5000);
	g.manage().window().minimize();
	g.close();
	
	
}
}
