package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
@Test
public void TC1() {
	Reporter.log("this is your TEstNg program",true);
	
}
@Test
public void TC2(){
Reporter.log("this is your second test case",true);

}
@Test
public void TC3() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver l=new ChromeDriver();
	l.get("https://in.coursera.org/?authMode=login");
	Reporter.log("this is coursera appl",true);
	
}
@Test
public void TC4() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver k=new ChromeDriver();
	k.get("https://www.guvi.in/sign-in");
	Reporter.log("this is your GUvi appl",true);
}
@Test
public void TC5() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver m=new ChromeDriver();
	m.get("https://www.hackerrank.com/auth/login");
	Reporter.log("this is your hackerrank appl",true);
	
}
}
