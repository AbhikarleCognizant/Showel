package Screenshot;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Postman {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.postman.com/downloads/");
	Thread.sleep(3000);
	WebElement a = o.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/nav/a/div/img"));
				File src = a.getScreenshotAs(OutputType.FILE);
				File desk=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\postman.jpg");
				Files.copy(src, desk);
}
}
