package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizi_method {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abhij\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver prath= new ChromeDriver();
	prath.get("https://www.flipkart.com/");
	prath.manage().window().maximize();

}
}
