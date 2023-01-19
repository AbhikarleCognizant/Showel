package Selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class microsoftedge {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\abhij\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	
}
}
