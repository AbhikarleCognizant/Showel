package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbhitestNG {
@Test
public void FC1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver g=new ChromeDriver();
	g.get("https://www.facebook.com/");

}
@Test
public void FC2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver l=new ChromeDriver();
	l.get("https://demo.actitime.com/login.do");
}
@Test
public void FC3() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver l=new ChromeDriver();
	l.get("https://www.selenium.dev/documentation/");
	
}
}

