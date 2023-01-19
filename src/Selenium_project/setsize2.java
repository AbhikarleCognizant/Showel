package Selenium_project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver u= new ChromeDriver();
	u.get("https://in.coursera.org/");
	Dimension d=new Dimension(100, 500);
	u.manage().window().setSize(d);
	
}
}