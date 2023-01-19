package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver l =new ChromeDriver();
	l.navigate().to("https://www.microsoft.com/en-in");
	Thread.sleep(1000);
	l.navigate().to("https://www.google.com/maps/@18.4781013,73.9242248,15z");
	l.navigate().back();
	l.navigate().forward();
	l.navigate().refresh();
}
}
