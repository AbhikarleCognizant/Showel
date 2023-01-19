package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximixe1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	//get method
	driver.get("https://www.google.com/");
	Options opt = driver.manage();
	Window win = opt.window();
	win.maximize();
}
}
