package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase4 {
@Test(priority = 2)
public void Abhi() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver u=new ChromeDriver();
	u.get("https://web.whatsapp.com/");
	
}
@Test(priority = 3)
public void Bhavana() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("https://www.facebook.com/");
	
}
@Test(priority = 1)
	public void Chandu() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver i=new ChromeDriver();
	i.get("https://www.google.com/");
}
}
