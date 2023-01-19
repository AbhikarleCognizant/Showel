package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abhij\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver m=new ChromeDriver();
	m.navigate().to("https://www.facebook.com/");
	Thread.sleep(1000);
	m.navigate().to("https://www.amazon.in/");
	m.navigate().back();
	m.navigate().forward();
	m.navigate().refresh();
}
}
