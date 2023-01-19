package Selenium_project;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	//create object of Point  class
	Point p =new Point(300, 400);
	//use the setsize method
	driver.manage().window().setPosition(p);
}
}
