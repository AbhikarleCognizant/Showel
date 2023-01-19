package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentUrl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver y = new ChromeDriver();
	y.get("https://www.monsterindia.com/");
	//get current url method
	String link = y.getCurrentUrl();
	System.out.println(link);
	
}
}
