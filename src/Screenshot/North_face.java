package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class North_face {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.thenorthface.com/en-us");
	TakesScreenshot t=(TakesScreenshot)o;
	File src = t.getScreenshotAs(OutputType.FILE);
	File desk=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\northface.jpg ");
	Files.copy(src, desk);
	
}
}
