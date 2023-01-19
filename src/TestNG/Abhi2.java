package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Abhi2 {
@Test
public void FC4() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver i=new ChromeDriver();
	i.get("https://www.guvi.in/sign-in");
}
@Test
public void FC5() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver m=new ChromeDriver();
	m.get("https://demo.nopcommerce.com/register");
}
}
