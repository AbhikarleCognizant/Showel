package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Hyundai {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver u=new ChromeDriver();
	u.get("https://www.hyundai.com/worldwide/en/");
	WebElement a = u.findElement(By.xpath("//img[@class='logo-default']"));
	File src = a.getScreenshotAs(OutputType.FILE);
	File desk=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\hyundai.jpg");
	Files.copy(src, desk);
	
}
}
