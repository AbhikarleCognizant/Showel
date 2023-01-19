package Selenium_project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	//create object of Dimension class
    Dimension d=new Dimension(200, 100);
  //use the set size method
    driver.manage().window().setSize(d);
  
}
}
