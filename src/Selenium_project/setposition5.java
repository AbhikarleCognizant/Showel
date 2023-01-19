package Selenium_project;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver l =new ChromeDriver();
	l.navigate().to("https://www.facebook.com/");
	Point p =new Point(100, 200);
	l.manage().window().setPosition(p);
}
}
