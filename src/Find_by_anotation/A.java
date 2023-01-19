package Find_by_anotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	//implicitly wait
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	d.get("https://demo.actitime.com/login.do");
	WebElement un = d.findElement(By.xpath("//input[@id='username']"));
	//un.sendKeys("admin");
	//we need refresh the page
	d.navigate().refresh();
	un.sendKeys("admin");
	
	
}
}
