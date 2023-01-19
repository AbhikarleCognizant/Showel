package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	//maximize
	driver.manage().window().maximize();
	//java wait
	Thread.sleep(4000);
	//minimize(this method is not present in selenium 3.141.59)
     driver.manage().window().minimize();
}
}
