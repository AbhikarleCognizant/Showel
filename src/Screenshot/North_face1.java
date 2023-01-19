package Screenshot;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class North_face1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver i=new ChromeDriver();
	i.get("https://www.thenorthface.com/en-us");
	WebElement a = i.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/div/header/div[1]/div/div[4]/div[1]/a/picture/img"));
	File src = a.getScreenshotAs(OutputType.FILE);
	File desk=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\north.jpg");
	Files.copy(src, desk);
	
}
}
