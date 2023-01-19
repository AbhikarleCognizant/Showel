package Key_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hackerrank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver y=new ChromeDriver();
	y.get("https://www.hackerrank.com/auth/login");
	y.findElement(By.xpath("//input[@id='input-1']")).sendKeys("abhijeetkarle6@gmail.com",Keys.TAB,"Abhi@321",Keys.ENTER);
	
}
}
