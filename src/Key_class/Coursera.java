package Key_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursera {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver u=new ChromeDriver();
	u.get("https://in.coursera.org/?authMode=login");
	Thread.sleep(4000);
	u.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijeetkarle6@gmail.com",Keys.TAB,"Abhi@123",Keys.ENTER);
}
}
