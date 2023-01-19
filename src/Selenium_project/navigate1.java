package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver b =new ChromeDriver();
	b.navigate().to("https://www.monsterindia.com/");
	b.manage().window().maximize();
	b.navigate().to("https://www.flipkart.com/");
	b.navigate().back();
	b.navigate().forward();
	b.navigate().refresh();
}
}
