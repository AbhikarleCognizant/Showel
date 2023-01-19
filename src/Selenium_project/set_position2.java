package Selenium_project;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_position2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o =new ChromeDriver();
	o.navigate().to("https://www.codingninjas.com/");
	Point p =new Point(400, 100);
	o.manage().window().setPosition(p);
}
}
