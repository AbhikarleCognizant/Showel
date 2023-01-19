package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_method2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver l =new ChromeDriver();
	l.get("https://www.google.com/maps/@18.4781013,73.9241818,15z");
	l.manage().window().maximize();
	Thread.sleep(1000);
	l.manage().window().minimize();
}
}
