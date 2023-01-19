package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 {
@Test
public void TC3() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abhij\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://www.amazon.com/");
}
}
