package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abhij\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver k = new ChromeDriver();
	k.get("https://paytm.com/");
	k.manage().window().maximize();
	Thread.sleep(3000);
	k.manage().window().minimize();
	
}
}
