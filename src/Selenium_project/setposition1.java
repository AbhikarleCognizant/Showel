package Selenium_project;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver c=new ChromeDriver();
	c.navigate().to("https://www.youtube.com/");
	Point p=new Point(400, 100);
	c.manage().window().setPosition(p);

}
}
