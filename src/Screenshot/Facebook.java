package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	d.manage().window().fullscreen();
	TakesScreenshot t=(TakesScreenshot)d;
	File desk = t.getScreenshotAs(OutputType.FILE);
	File src=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\facebook.jpg");
	Files.copy(desk, src);
	
}
}
