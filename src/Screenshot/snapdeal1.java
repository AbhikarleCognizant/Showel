package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class snapdeal1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver g=new ChromeDriver();
	g.get("https://www.snapdeal.com/");
	WebElement a = g.findElement(By.xpath("//img[@class='notIeLogoHeader aspectRatioEqual sdHomepage cur-pointer']"));
	File src = a.getScreenshotAs(OutputType.FILE);
	File desk=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\snap.jpg");
	Files.copy(src, desk);
}
}
