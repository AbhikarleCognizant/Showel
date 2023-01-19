package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver k = new ChromeDriver();
	k.get("https://in.coursera.org/");
	k.manage().window().maximize();
	Thread.sleep(2000);
	k.manage().window().minimize();
}
}
