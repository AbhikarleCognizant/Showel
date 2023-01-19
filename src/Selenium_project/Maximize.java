package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver m =new ChromeDriver();
	m.get("https://www.youtube.com/");
	m.manage().window().maximize();
	Thread.sleep(2000);
	m.manage().window().minimize();
	
}
}
