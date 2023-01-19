package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class google {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.google.co.in/");
	TakesScreenshot ts=(TakesScreenshot)o;
	File desk = ts.getScreenshotAs(OutputType.FILE);
	File src =new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\google.jpg");
	Files.copy(desk, src);
	
}
}
