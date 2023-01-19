package Key_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.guvi.in/sign-in");
	o.findElement(By.xpath("//input[@id='login_email']")).sendKeys("abhijeetkarle6@gmail.com",Keys.TAB,"Abhi@123",Keys.ENTER);
	o.manage().window().maximize();
	Thread.sleep(3000);
	o.navigate().to(o.getCurrentUrl());
	
	
}
}
