package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver sapya= new ChromeDriver();
	sapya.get("https://www.instagram.com/");
	sapya.manage().window().maximize();
	Thread.sleep(2000);
	sapya.manage().window().minimize();

}
}
