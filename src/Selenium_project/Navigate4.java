package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver j=new ChromeDriver();
	j.navigate().to("https://www.meesho.com/");
	Thread.sleep(1000);
	j.navigate().to("https://www.myntra.com/");
	j.navigate().back();
	j.navigate().forward();
	j.navigate().refresh();
	
}
}
