package Key_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	//open the link
	h.get("https://demo.actitime.com/login.do");
	//implicit wait
	h.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//open application using Keys class
	h.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}
