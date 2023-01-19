package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("http://omayo.blogspot.com/");
	p.findElement(By.xpath("//input[@id='alert1']")).click();
	Alert alt = p.switchTo().alert();
	String text = alt.getText();
	System.out.println(text);
	
	
	
}
}
