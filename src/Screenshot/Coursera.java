package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Coursera {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver u=new ChromeDriver();
	u.get("https://in.coursera.org/");
	TakesScreenshot t=(TakesScreenshot)u;
	File desk = t.getScreenshotAs(OutputType.FILE);
	File src=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\coursera.jpg");
	Files.copy(desk, src);
	
}
}
