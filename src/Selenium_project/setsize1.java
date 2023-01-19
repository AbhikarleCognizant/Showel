package Selenium_project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p =new ChromeDriver();
	p.navigate().to("https://www.instagram.com/");
	Dimension d=new Dimension(100, 400);
	p.manage().window().setSize(d);
}
}
