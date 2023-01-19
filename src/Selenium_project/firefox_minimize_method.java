package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_minimize_method {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhij\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	WebDriver h =new FirefoxDriver();
	h.get("https://www.facebook.com/");
	h.manage().window().maximize();
	Thread.sleep(3000);
	h.manage().window().minimize();
}
}
