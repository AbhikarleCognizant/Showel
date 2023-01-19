package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("https://www.w3schools.com/tags/att_iframe_src.asp");
	p.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	p.manage().window().maximize();
	p.switchTo().frame("cnftComm");
	WebElement t1 = p.findElement(By.xpath("//a[text()='HTTP Methods']"));
	System.out.println(t1);
	
}
}
