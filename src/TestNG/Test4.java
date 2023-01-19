package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver y=new ChromeDriver();
	y.get("https://demo.actitime.com/login.do");
	Reporter.log("How are you",true);
	
}
@Test
public void TC2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2F");
	Reporter.log("HEllo",true);
	Assert.fail();
}
@Test
public void TC3() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("https://www.selenium.dev/documentation/");
	Reporter.log("WHat are you doing");
	Assert.fail();
}
@Test
public void TC4() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver i=new ChromeDriver();
	i.get("https://demo.nopcommerce.com/register");
	Reporter.log("THis is your fourth test case");
	Assert.fail();
	
}
}
