package Alert_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions c=new ChromeOptions();
	c.addArguments("disable notification");
	WebDriver o=new ChromeDriver();
	o.get("https://www.quikr.com/");
	
	
}
}
