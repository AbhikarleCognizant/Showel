package Screenshot;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Udemy {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://www.udemy.com/");
	Thread.sleep(3000);
	WebElement a = h.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[3]/a/img"));
	File src = a.getScreenshotAs(OutputType.FILE);
	File desk=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\udemy.jpg");
	Files.copy(src, desk);
	
	
	
	
}
}
