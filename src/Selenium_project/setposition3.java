package Selenium_project;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o =new ChromeDriver();
	o.navigate().to("https://www.meesho.com/");
	Point p =new Point(50, 80);
	o.manage().window().setPosition(p);
}
}
