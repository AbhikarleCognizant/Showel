package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver j =new ChromeDriver();
	j.get("https://www.flipkart.com/");
	j.manage().window().maximize();
	Thread.sleep(1000);
	j.manage().window().minimize();
}
}
